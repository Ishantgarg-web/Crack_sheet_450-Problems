class Solution
{
    public int find_fact(int[] arr)
    {
        // Code here
        Arrays.sort(arr);
        int n=arr.length;
        if(n<=1)
        {
            return arr[n-1];
        }
        if(n%2!=0)
        {
            return arr[n/2];
        }
        else
        {
            int u=n/2;
            int v=u-1;
            return (arr[u]+arr[v])/2;
        }
    }
}
