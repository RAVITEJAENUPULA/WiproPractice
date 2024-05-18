package p1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       String str="";
       int num=0;
       for(int i=0;i<n;i++) {
    	  int counter=0;
    	  for(num=i;num>=1;num--) {
    		  if(i%num==0)counter=counter+1;
    	  }
    	  if(counter==2)str=str+i+" ";
    	  
       }//for loop
       System.out.println(str);
	}

}
