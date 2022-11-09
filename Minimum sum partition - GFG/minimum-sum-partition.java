//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //
    
    public int findDiff(int[] arr,int n,int sum,int currsum,int[][] grid){
        
        if(n == 0){
            return Math.abs((sum-currsum)-currsum);
        }
        
        if(grid[n][currsum]!=-1){

            return grid[n][currsum];

        }

        return grid[n][currsum]=Math.min(findDiff(arr,n-1,sum,currsum+arr[n-1],grid),findDiff(arr,n-1,sum,currsum,grid));
    }
    
    
//
	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    
	    int sum = 0;
	    
	    for(int i=0;i<n;i++){
	        sum += arr[i];
	    }
	    
	    int[][] grid = new int[n+1][sum+1];
	    
	    for(int[] i : grid){
	        Arrays.fill(i,-1);
	    }
	    
	    return findDiff(arr,n,sum,0,grid);
	    
	} 
}
