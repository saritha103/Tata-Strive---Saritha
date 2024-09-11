package Day7;

import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numbers1= {2,3,4,6};
		int [] numbers2= {6,6,6,6};
		
		for (int i = 0;i < numbers1.length;i++) {
			System.out.println(numbers1[i]);
			for (int j = 0;j< numbers2.length;j++) {
				
				System.out.println(numbers2[j]);
			}
				
		}
	}

}
