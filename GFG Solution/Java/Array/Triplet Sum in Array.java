class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int arr[], int n, int sum) { 
    
       // Your code Here
        Arrays.sort(arr);
        for (int p=0;p<n-2;p++)
        {
            int x=sum-arr[p];
            int i=p+1,j=n-1;
            while(i<j)
            {
                if(arr[i]+arr[j]==x)
                {
                    return true;
                }
                else if(arr[i]+arr[j]>x)
                {
                    j--;
                }
                else
                {
                    i++;
                }
            }
        }
        return false;
    }
}
