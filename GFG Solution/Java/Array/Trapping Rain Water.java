class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int left[]=new int[n];
        int right[]=new int[n];
        for (int i=0;i<n;i++)
        {
            if(i==0){left[i]=arr[0];}
            else
            {
                left[i]=(int)Math.max(left[i-1],arr[i]);
            }
        }
        for (int i=n-1;i>=0;i--)
        {
            if(i==n-1){right[i]=arr[n-1];}
            else
            {
                right[i]=(int)Math.max(right[i+1],arr[i]);
            }
        }
        long ans=0;
        for (int i=0;i<n;i++)
        {
            ans+=(int)Math.min(left[i],right[i])-arr[i];
        }
        return ans;
    } 
}


