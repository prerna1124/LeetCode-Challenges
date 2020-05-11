class Solution 
{
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor)
    {
       if(image[sr][sc] == newColor)
           return image;
        
        floodFillUtil(image,sr,sc,image[sr][sc],newColor);
        
        return image;
    }
    public void floodFillUtil(int[][] image, int sr, int sc,int prevc, int newColor)
    {
       if(sr<0 || sr>= image.length || sc<0 || sc>= image[0].length || image[sr][sc] != prevc)
           return;
        
        image[sr][sc] = newColor;
        floodFillUtil(image,sr+1,sc,prevc,newColor);
        floodFillUtil(image,sr-1,sc,prevc,newColor);
        floodFillUtil(image,sr,sc+1,prevc,newColor);
        floodFillUtil(image,sr,sc-1,prevc,newColor);
    }
}
