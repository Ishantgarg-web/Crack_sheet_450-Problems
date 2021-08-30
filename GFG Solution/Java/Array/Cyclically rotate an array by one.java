//problem link:https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1

class Compute {
    public static void reverse(int arr[],int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int arr[], int n)
    {
        reverse(arr,0,n-2);
        reverse(arr,0,n-1);
    }
}
