class pair
{
    int p1,p2;
    pair(int a,int b)
    {
        p1=a;
        p2=b;
    }
}
class Mycmp implements Comparator<pair>
{
    public int compare(pair pa,pair pb)
    {
        return pa.p1-pb.p1;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        //ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        int res=0,m=intervals.length;
        pair p[]=new pair[m];
        for (int i=0;i<m;i++)
        {
            p[i]=new pair(intervals[i][0],intervals[i][1]);
        }
        Arrays.sort(p,new Mycmp());
        pair ans[]=new pair[m];
        ans[0]=new pair(p[0].p1,p[0].p2);
        for (int i=1;i<m;i++)
        {
            if(p[i].p1<=ans[res].p2)
            {
                ans[res].p1=(int)Math.min(ans[res].p1,p[i].p1);
                ans[res].p2=(int)Math.max(ans[res].p2,p[i].p2);
            }
            else
            {
                res++;
                ans[res]=new pair(p[i].p1,p[i].p2);
            }
        }
        int ans1[][]=new int[res+1][2];
        for (int i=0;i<(res+1);i++)
        {
            ans1[i][0]=ans[i].p1;
            ans1[i][1]=ans[i].p2;
        }
        return ans1;
    }
}
