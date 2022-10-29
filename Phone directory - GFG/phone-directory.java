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
            String contact[] = in.readLine().trim().split("\\s+");
            String s = in.readLine();
            
            Solution ob = new Solution();
            ArrayList<ArrayList<String>> ans = ob.displayContacts(n, contact, s);
            for(int i = 0;i < ans.size();i++){
                for(int j = 0;j < ans.get(i).size();j++)
                    System.out.print(ans.get(i).get(j) + " ");
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static ArrayList<ArrayList<String>> displayContacts(int n, 
                                        String contact[], String s)
    {
        
        ArrayList<ArrayList<String>> a = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();
        
        Set<String> w = new HashSet<>();
        
        for(int i=1;i<s.length()+1;i++){
            String d = s.substring(0,i);
            
            
            c = new ArrayList<>();
            w = new HashSet<>();
            
            for(int j=0;j<n;j++){
                if( contact[j].contains(d) ){
                    w.add(contact[j]);
                }
            }
            
            for(String x : w ){
                c.add(x);
            }
            
            if(c.size() > 0 ){
                Collections.sort(c);
                a.add(c);
            }else{
                c.add("0");
                a.add(c);
            }
        }
        
        
        return a;
        
    }
}