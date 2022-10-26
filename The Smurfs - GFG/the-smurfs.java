//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            
            Solution ob = new Solution();
            System.out.println(ob.minFind(n, a));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int minFind(int n, String a[]){
        // code here
         int r=0;

        int g=0;

        int b=0;

        for(int i=0;i<n;i++){

           if(a[i].charAt(0)=='R'){

               r++;

           }

           else if(a[i].charAt(0)=='G'){

               g++;

           }

           else{

               b++;

           }

        }

        //System.out.println(r+" "+g+" "+b);

        if(r%2==0 && g%2==0 && b%2==0){

            return 2;

        }

        else if(r%2!=0 && g%2!=0 && b%2!=0){

            return 2;

        }
        else{
            return 1;

        }
        
    }
}