class Solution{
    //Function to partition the array around the range such 
    //that array is divided into three parts.
    public static void swap(int arr[],int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void threeWayPartition(int arr[], int a, int b)
    {
        // code here 
        int idx=0,n=arr.length;
        for (int i=0;i<n;i++)
        {
            if(arr[i]<a)
            {
                swap(arr,idx,i);
                idx++;
            }
        }
        for (int i=0;i<n;i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                swap(arr,idx,i);
                idx++;
            }
        }
        for (int i=0;i<n;i++)
        {
            if(arr[i]>b)
            {
                swap(arr,i,idx);
                idx++;
            }
        }
        /*
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();*/
    }
}
