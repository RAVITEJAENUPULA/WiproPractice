package p1;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           int number=0,n=0,power,total=0;
           number=sc.nextInt();
           String str=String.valueOf(number);
           int digit=str.length();
           n=number;
           while(n>0) {
        	   int d=n%10;
        	   total=total+(int)Math.pow(d, digit);
        	   n=n/10;
           }
           if(number==total) {
        	   System.out.println("yes its a armstrong number");
           }
           else System.out.println("no its not a armstrong number");
	}

}
