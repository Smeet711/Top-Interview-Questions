//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().removals(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int removals(int[] arr, int n, int k) {
        // code here
        // basically we are doing Sliding Window
        
       Arrays.sort(arr);
       int i=0,j=0,maxRange=0;
       
       // we will traverse linearly 0 to n and check the largest window that satisfy the condition given in question 
       // amax - amin <= k
       
       while(j < n ){
           
           if(arr[j] - arr[i] <= k ){
               // if Difference Less then K increase j and window
               j++;
           }else if( i < j ){
              // if Difference more  then K increase i pointer
               i++;
           }
           
           // now calculate and save the maxrange between j and i
           
           maxRange = Math.max(maxRange,j-i);
       }
       
         // now we will minus largest window from the size of the array
         
         return n - maxRange;
        
    }
}