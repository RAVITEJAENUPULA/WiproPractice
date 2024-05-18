package p1;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("enter the number");
       int a=s.nextInt();
       int fact=1;
       for(int i=1;i<=a;i++) {
    	   fact=fact*i;
    	   //System.out.println("factorial is :"+i+" "+fact);
       }
       System.out.println("factorial is :"+fact);
	}

}
