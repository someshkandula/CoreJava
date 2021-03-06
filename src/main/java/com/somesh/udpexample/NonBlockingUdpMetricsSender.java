package com.somesh.udpexample;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class NonBlockingUdpMetricsSender {
    private final Charset encoding;
    private final DatagramChannel clientSocket;
    private final ExecutorService executor;

    public NonBlockingUdpMetricsSender(String hostname, int port, Charset encoding) throws IOException {
        this.encoding = encoding;
       // this.handler = handler;
        this.clientSocket = DatagramChannel.open();
        this.clientSocket.connect(new InetSocketAddress(hostname, port));

        System.out.println("Inside NonBlockingUdpSender");
        this.executor = Executors.newSingleThreadExecutor(new ThreadFactory() {
            final ThreadFactory delegate = Executors.defaultThreadFactory();
            @Override public Thread newThread(Runnable r) {
                Thread result = delegate.newThread(r);
                result.setName("StatsD-" + result.getName());
                result.setDaemon(true);
                return result;
            }
        });
    }

    public void stop() {
        try {
            executor.shutdown();
            executor.awaitTermination(30, TimeUnit.SECONDS);
        }
        catch (Exception e) {
            //handler.handle(e);
        }
        finally {
            if (clientSocket != null) {
                try {
                    clientSocket.close();
                }
                catch (Exception e) {
                   // handler.handle(e);
                }
            }
        }
    }

    public void send(final String message) {
        try {
            executor.execute(new Runnable() {
                @Override public void run() {
                    blockingSend(message);
                }
            });
        }
        catch (Exception e) {
            //handler.handle(e);
        }
    }

    private void blockingSend(String message) {
        try {
            final byte[] sendData = message.getBytes(encoding);
            clientSocket.write(ByteBuffer.wrap(sendData));
        } catch (Exception e) {
        	System.out.println("Inside exception : " + e);
            //handler.handle(e);
        }
    }
}