class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        long min=Integer.MAX_VALUE;
        for (long i=0;i<=n-m;i++)
        {
            min=(long)Math.min(min,a.get((int)(i+m-1))-a.get((int)i));
        }
        return min;
    }
}
