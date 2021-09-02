class Complete{
    
   
    // Function for finding maximum and value pair
    public static int minSwap (int arr[], int n, int k) {
        //Complete the function
        int count=0;
        int ans=Integer.MAX_VALUE;
        for (int i=0;i<n;i++)
        {
            if(arr[i]<=k)
            {
                count++;
            }
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        for (int i=0;i<count;i++)
        {
            if(arr[i]<=k)
            {
                al.add(arr[i]);
            }
        }
        ans=(int)Math.min(ans,count-al.size());
        for (int i=1;i<=n-count;i++)
        {
            if(arr[i-1]<=k)
            {
                al.remove(new Integer(arr[i-1]));
            }
            if(arr[i+count-1]<=k)
            {
                al.add(arr[i+count-1]);
            }
            ans=(int)Math.min(ans,count-al.size());
        }
        return ans;
    }
    
    
}
