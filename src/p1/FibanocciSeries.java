package p1;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int first=0,second=1,next=0;
          for(int i=0;i<n;i++)
          {
        	  System.out.println(first+" ");
        	  next=first+second;
        	  first=second;
        	  second=next;
          }
	}

}
