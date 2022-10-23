//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int  N = Integer.parseInt(input_line[0]);
            int  M = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            int ans = ob.steppingNumbers(N, M);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    
    int dfs(int currNum, int limit){
        if(currNum > limit){ 
            return 0 ; 
        }
        int ans = 1 ;
        if(currNum == 0){
            for(int i = 1 ; i<=9 ; i++){
                ans += dfs(i , limit); 
            }
        }else{
            int lastdig = currNum % 10 ;
            if(lastdig != 9){ 
                ans += dfs(currNum * 10 + lastdig + 1, limit);
            }
            if(lastdig != 0){ 
                ans += dfs(currNum * 10 + lastdig - 1, limit);
            }
        }
        return ans ; 
    }
   
    
    int steppingNumbers(int n, int m){
        // code here
        return dfs(0 , m) - dfs(0 , n - 1) ; 
        
    }
}
