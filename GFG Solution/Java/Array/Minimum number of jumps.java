class Solution{
    static int minJumps(int[] arr){
        // your code here
        int n=arr.length;
        if(arr[0]==0){return -1;}
        int maxreach=arr[0];
        int jump=1;
        int step=arr[0];
        for (int i=1;i<n;i++)
        {
            if(i==n-1)
            {
                return jump;
            }
            maxreach=(int)Math.max(maxreach,i+arr[i]);
            step--;
            if(step==0)
            {
                jump++;
                if(i>=maxreach)
                {
                    return -1;
                }
                step=maxreach-i;
            }
        }
        return -1;
    }
}
