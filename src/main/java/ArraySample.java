import java.util.Scanner;

/**
 * 
 */

/**
 * @author ksomalin
 *
 */
public class ArraySample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfElementsInTkt = scanner.nextInt();
		int[] arrInt = new int[noOfElementsInTkt];
		for (int i = 0; i < noOfElementsInTkt; i++) {
			arrInt[i] = scanner.nextInt();
		}
		int p = arrInt[scanner.nextInt()];
		scanner.close();

		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		System.out.println("p= " + p);
		
		int x = returnValue(arrInt, p);

		System.out.println(x);

	}

	public static int returnValue(int[] array, int pValue) {
		
		
		int k = 0;
		for (int i = 0; i < array.length; i++)
			
			//get the position
			// if position
			if (array[i] == pValue){
				//i = i + 1;
				System.out.println(" i "+i);
				int leftOverCount = 0;
				if(i != 0)
					leftOverCount = array.length - i;
				System.out.println(leftOverCount);
				if(i==0)
					k = i+1;	
				else
				k = i * array.length - leftOverCount;
				System.out.println("k"+k);
				return k;
			}
		
		return k;
	}

}
