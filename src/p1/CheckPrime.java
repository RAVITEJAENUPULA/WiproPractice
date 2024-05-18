package p1;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int counter=0;
      for(int i=2;i<n/2;i++) 
      {
    	  if(n%i==0)counter=counter+1;
      }
      if(counter==2)System.out.println("prime number");
      else System.out.println("not a prime number");
	}

}
