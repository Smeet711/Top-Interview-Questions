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
        
        ArrayList<ArrayList<String>> resultList = new ArrayList<>();
        //
        for(int i=0;i<s.length();i++){
            ArrayList<String> tempList = new ArrayList<>();
            String temp = s.substring(0,i+1);
            
            for(int j=0;j<n;j++){
                String t = contact[j];
                if(t.startsWith(temp)){
                    if(!tempList.contains(t)){
                        tempList.add(t);
                    }
                }
            }
            
            Collections.sort(tempList);
            
            if(tempList.isEmpty()){
                tempList.add("0");
            }
            
            resultList.add(tempList);
            
        }
        //
        
        return resultList;
        
    }
}