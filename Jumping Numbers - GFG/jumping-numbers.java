//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.jumpingNums(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long jumpingNums(long X) {
        // code here
        
        Queue<Long> q = new LinkedList<>();
        
        for(long i=1;i<=9;i++){
            q.offer(i);
        }
        
        long max = Long.MIN_VALUE;
        
        while(q.size() > 0 ){
            
            long n = q.remove();
            if(n > X){
                continue;
            }else{
                max = Math.max(max,n);
            }
            
            long rem = n%10;
         
         if(rem != 9 ){
             long num = n*10+rem+1;
             q.offer(num);
         }
            
        if(rem != 0){
            long num = n*10+rem-1;
            q.offer(num);
        }    
        }
        return max;
        //
        
    }
};