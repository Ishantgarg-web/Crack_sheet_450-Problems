class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        ArrayList<Integer> al=new ArrayList<Integer>();
        HashSet<Integer> h=new HashSet<Integer>();
        HashSet<Integer> h1=new HashSet<Integer>();
        for (int i=0;i<n1;i++)
        {
            h.add(A[i]);
        }
        for (int i=0;i<n2;i++)
        {
            if(h.contains(B[i]))
            {
                h1.add(B[i]);
            }
        }
        for (int i=0;i<n3;i++)
        {
            if(h1.contains(C[i]))
            {
                if(al.contains(C[i])==false){al.add(C[i]);}
            }
        }
        return al;
    }
}
