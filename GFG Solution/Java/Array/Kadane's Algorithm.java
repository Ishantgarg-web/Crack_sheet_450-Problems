// Problem url: https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1#

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        //use kadanes Algorithm
        long a[]=new long[arr.length];
        for (int i=0;i<n;i++)
        {
            a[i]=arr[i];
        }
        long max=a[0];
        for (int i=1;i<n;i++)
        {
            a[i]=(long)Math.max(a[i-1]+a[i],a[i]);
            max=(long)Math.max(max,a[i]);
        }
        return max;
    }
    
}

