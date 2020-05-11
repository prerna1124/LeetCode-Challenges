/*
You are given an array coordinates, coordinates[i] = [x, y], 
where [x, y] represents the coordinate of a point. Check if these points make a straight line in the XY plane.

Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
Output: false
*/
class Solution
{
    public boolean checkStraightLine(int[][] coordinates)
    {
        int[] p1 = coordinates[1];
        int[] p2 = coordinates[0];
        for(int i=0;i<p1.length;i++)
            System.out.print(p1[i]+" ");
        System.out.println();
        for(int i=0;i<p2.length;i++)
            System.out.print(p2[i]+" ");
        float gslope = slope(p1,p2);
        for(int i=1;i<coordinates.length;i++)
        {
            p1 = coordinates[i];
            p2 = coordinates[0];
            float slop = slope(p1,p2);
            if(gslope!=slop) return false;
        }
        return true;
    }
    static float slope(int[] p1,int[] p2)
    {
        if(p1[0]-p2[0]==0) return 0;
        else
            return (float)(p2[1]-p1[1])/(float)(p2[0]-p1[0]);
    }
}
