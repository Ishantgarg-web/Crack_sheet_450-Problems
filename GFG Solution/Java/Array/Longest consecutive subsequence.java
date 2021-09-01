class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int n)
	{
	   // add your code here
	   HashSet<Integer> h=new HashSet<Integer>();
	   for (int i=0;i<n;i++)
	   {
	       h.add(arr[i]);
	   }
	   int max=Integer.MIN_VALUE,res=0;
	   for (int x:h)
	   {
	       if(h.contains(x-1)==false)
	       {
	           res=0;
	           while(h.contains(x))
	           {
	               res++;
	               x++;
	           }
	           max=(int)Math.max(max,res);
	           res=0;
	       }
	   }
	   return (int)Math.max(max,res);
	}
}
