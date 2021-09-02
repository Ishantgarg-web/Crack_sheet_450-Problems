class Solution {

    public static int smallestSubWithSum(int arr[], int n, int x) {
        // Your code goes here 
        int res=0,i=0,sum=0;
        int max=Integer.MAX_VALUE;
        boolean flag=false;
        while(res<n && i<n)
        {
            sum+=arr[i];
            while(sum>x)
            {
                sum=sum-arr[res];
                res++;
                flag=true;
            }
            if(flag)
            {
                max=(int)Math.min(max,i-res+2);
                flag=false;
            }
            i++;
        }
        //max=(int)Math.min(max,n-res);
        return max;
    }
}

