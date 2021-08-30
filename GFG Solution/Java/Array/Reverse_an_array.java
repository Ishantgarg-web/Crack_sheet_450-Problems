import java.util.*;
import java.lang.*;
import java.io.*;
class Main
 {
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
	public static void main (String[] args)
	 {
	 //code
	    Scanner input = new Scanner(System.in);
	    int test=input.nextInt();
	    for (int p=0;p<test;p++)
	    {
	        int n=input.nextInt();
	        int a[]=new int[n];
	        for (int i=0;i<n;i++)
	        {
	            a[i]=input.nextInt();
	        }
	        for (int i=0;i<n/2;i++)
	        {
	            swap(a,i,n-1-i);
	        }
	        for (int i=0;i<n;i++)
	        {
	            System.out.print(a[i]+" ");
	        }
	        System.out.println();
	    }
	 }
}
