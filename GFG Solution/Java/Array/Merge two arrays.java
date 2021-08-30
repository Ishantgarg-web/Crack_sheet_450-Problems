class Solution {

    public void merge(int arr1[], int arr2[], int n, int m) {
        // code here
        int ans[]=new int[n+m];
        int idx=0;
        for (int i=0;i<n;i++)
        {
            ans[idx++]=arr1[i];
        }
        for (int i=0;i<m;i++)
        {
            ans[idx++]=arr2[i];
        }
        Arrays.sort(ans);
        idx=0;
        for (int i=0;i<n;i++)
        {
            arr1[i]=ans[i];
        }
        for (int i=0;i<m;i++)
        {
            arr2[i]=ans[n+i];
        }
    }
}
