class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashSet<Long> h=new HashSet<Long>();
        for (int i=0;i<n;i++)
        {
            h.add(a1[i]);
        }
        for (int i=0;i<m;i++)
        {
            if(h.contains(a2[i])==false)
            {
                return "No";
            }
        }
        return "Yes";
    }
}
