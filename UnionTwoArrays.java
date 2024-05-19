class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        Set<Integer> S= new HashSet<Integer>(); 
        //Your code here
        for(int i=0;i<n;i++)
        {
            S.add(a[i]);
        }
        for(int i=0;i<m;i++)
        {
            S.add(b[i]);
        }
        return S.size();
    }
}
