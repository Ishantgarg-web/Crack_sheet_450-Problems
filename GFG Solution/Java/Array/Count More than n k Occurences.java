class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int ans=0;
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for (int i=0;i<n;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry:hm.entrySet())
        {
            if(entry.getValue()>n/k)
            {
                ans++;
            }
        }
        return ans;
        
    }
}
