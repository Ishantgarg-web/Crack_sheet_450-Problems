// using priority Queue
class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for (int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        while(k-->1)
        {
            pq.poll();
        }
        return pq.poll();
    } 
}
