package SetBit;

import java.util.Scanner;

public class SetBit {

	 public static int setBit(int A, int B){
	        return (A != B) ? (int)(Math.pow(2, A) + Math.pow(2, B)) : (int) Math.pow(2,A);
	    }

	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(setBit(a,b));
	    }

}
