class Solution {
    boolean visited[];
    public int findCircleNum(int[][] isConnected) {
        visited=new boolean[isConnected.length];
        int cnt=0;
        for(int i=0;i<visited.length;i++)
        {
            if(!visited[i]) 
            {
                dfs(isConnected, i);
                cnt++;
            }
        }
        return cnt;
    }

    private void dfs(int[][] isConnected, int curr)
    {
        visited[curr]=true;
        for(int i=0;i<isConnected[curr].length;i++)
        {
            if(isConnected[curr][i]==1 && !visited[i]) dfs(isConnected, i);
        }
    }
}
