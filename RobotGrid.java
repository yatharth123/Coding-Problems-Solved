import java.util.*;
import java.awt.Point;
public class RobotGrid
{
	static int dist = Integer.MAX_VALUE;
	static int mat[][] = new int[100][100];
	static String sol="";
	static ArrayList<Point> solve(boolean mat[][])
	{
		if(mat==null || mat.length == 0)
		return null;
		ArrayList<Point> path = new ArrayList<Point>();
		HashSet <Point> failedPoints = new HashSet<Point>();
		if(getPath(mat, mat.length-1, mat[0].length -1, path, failedPoints))
			return path;

		return null;
	}
	static boolean getPath(boolean[][] mat, int row, int col, ArrayList<Point> path, HashSet<Point> failedPoints)
	{
		if(col<0 || row<0 || !mat[row][col]){
			return false;
		}

		Point p = new Point(row,col);
		if(failedPoints.contains(p))
		{
			return false;
		}

		boolean isAtOrigin = (row==0)&&(col==0);

		if(isAtOrigin || getPath(mat, row-1, col, path) || getPath(mat, row, col-1, path))
		{	
			path.add(p);
			return true;
		}
		
		failedPoints.add(p);
		return false;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j] = sc.nextBoolean();
			}
		}
		solve(mat,r,c);
	}
}