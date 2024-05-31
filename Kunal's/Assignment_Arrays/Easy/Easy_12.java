package Assignment_Arrays.Easy;

public class Easy_12 {
    public static void main(String[] args) {
        int[] gain = {-4, -3, -3, -1, 4, 3, 2};
        System.out.println(largestAltitude(gain));
    }

    static int largestAltitude(int[] gain){
        int altitude = 0;
        int temp = 0;
        for(int i=0; i<gain.length; i++){
            temp += gain[i];
            if(temp > altitude){
                altitude = temp;
            }
        }
        return altitude;
    }
}
