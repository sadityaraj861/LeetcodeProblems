class Solution {
    public void check(char[][] grid,int i, int j, int m,int n ){
        if(i<0 || j <0|| j>=n||i>=m || grid[i][j]=='0') return;

        grid[i][j] = '0';

        check(grid,i+1,j,m,n);//d
        check(grid,i,j+1,m,n);//r
        check(grid,i-1,j,m,n);//u
        check(grid,i,j-1,m,n);//l
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int an = 0;
        for (int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                if(grid[i][j]=='1'){
                    check(grid,i,j,m,n);
                    an++;
                }
            }
        }
        return an;
    }
}