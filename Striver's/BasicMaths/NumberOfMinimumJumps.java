package BasicMaths;

public class NumberOfMinimumJumps{
    public static void main(String[] args){
        int[] arr = {1,3,5,8,9,6,7,6,8,9};
        System.out.println(minJumps(arr));
    }

    public static int minJumps(int[] arr){  
        int n = arr.length;
        if(n==0 || n == 1){
            return 0;
        }
        if(arr[0] == 0){
            return -1;
        }
        
        int jump = 0;
        int curr = 0;
        int des = 0;
        
        for(int i=0; i<n; i++){
            des = Math.max(des, arr[i]+i);
            
            if(i==curr){
                jump++;
                curr = des;
            }
            
            if(curr>= n-1){
                return jump;
            }
        }
        return -1;
    }
}