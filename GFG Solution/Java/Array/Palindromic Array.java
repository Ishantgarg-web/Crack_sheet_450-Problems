class GfG
{
    public static boolean ispalin(int n)
    {
        String s=String.valueOf(n);
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
	public static int palinArray(int[] arr, int n)
    {
        //add code here.
        for (int i=0;i<n;i++)
        {
            if(ispalin(arr[i])==false)
            {
                return 0;
            }
        }
        return 1;
    }
}
