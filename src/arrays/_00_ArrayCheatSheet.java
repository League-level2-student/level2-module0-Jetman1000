package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] animals={"cat", "dogs", "horse", "tiger", "giraffe"};
		//2. print the third element in the array
	//System.out.println(animals[2]);
		 animals[2]="rat";
		//4. print the third element again
	//System.out.println(animals[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<animals.length; i++) {
			//System.out.println(animals[i]);
		}
		
		//6. make an array of 50 integers
		int [] numbers= new int[50];
		
		//7. use a for loop to make every value of the integer array a random number
		Random r=new Random();

		for(int y=0;y<numbers.length;y++) {
			//numbers[y]=r.nextInt(51);
			//System.out.println(numbers[y]);
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		int zero=50;
		for(int i=0; i<numbers.length;i++) {
				if(numbers[i]<zero){
					 zero=numbers[i];
				}
		}
		System.out.println(zero);

			//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int fifty=50;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>fifty ) {
				fifty=numbers[i];
			}
		}
		System.out.println(fifty);
	}
}
