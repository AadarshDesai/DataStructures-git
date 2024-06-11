package Kunals.Assignment_Arrays.Easy;

// import java.util.Arrays;

public class Easy_13 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        for(int[] item: flipAndInvertImage(image) ){
            for(int value: item){
                System.out.print(value+" ");
            }
        }
    }

    static int[][] flipAndInvertImage(int[][] image){
        int[][] reverse = new int[image.length][image.length];
        for(int row=0; row<image.length; row++){
            int temp = image.length;
            for(int col=0; col<image.length; col++){
                reverse[row][col] = image[row][--temp];
                if(reverse[row][col] == 1){
                    reverse[row][col] = 0;
                }else{
                    reverse[row][col] = 1;
                }
            }
        }
        return reverse;

    }
}
