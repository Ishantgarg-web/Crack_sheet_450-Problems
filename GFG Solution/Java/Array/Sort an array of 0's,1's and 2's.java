class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int c1=0,c2=0,c3=0;
        for (int i=0;i<n;i++)
        {
            if(a[i]==0){c1++;}
            else if(a[i]==1){c2++;}
            else{c3++;}
        }
        int idx=0;
        while(c1-->0)
        {
            a[idx++]=0;
        }
        while(c2-->0)
        {
            a[idx++]=1;
        }
        while(c3-->0)
        {
            a[idx++]=2;
        }
    }
}
