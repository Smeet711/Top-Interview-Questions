//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int[] ans = ob.twoOddNum(Arr,N);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution
{
    public int[] twoOddNum(int Arr[], int N)
    {
        // code here
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int num : Arr){
            hm.put(num,hm.getOrDefault(num,0)+1);    // adding key with their occurrence in Map
            
        }
        
        int[] ans = new int[2];  // as mentioned only 2 numbers so
        int k=0;
        
        // checking for odd occurence key
        for(int key : hm.keySet()){
            if(hm.get(key)%2 != 0 ){
                ans[k++] = key;
            }
        }
        // simply swapping because we the output in decrease order
        if(ans[0] < ans[1]){
            int num = ans[0];
            ans[0] = ans[1];
            ans[1] = num;
        }
        
        return ans;
    }
}