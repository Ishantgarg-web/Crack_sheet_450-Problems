class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int pre[]=new int[n];
        pre[0]=arr[0];
        for (int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]+arr[i];
        }
        HashSet<Integer> h=new HashSet<Integer>();
        for (int i=0;i<n;i++)
        {
            if(h.contains(pre[i]) || pre[i]==0)
            {
                return true;
            }
            h.add(pre[i]);
        }
        return false;
    }
}
