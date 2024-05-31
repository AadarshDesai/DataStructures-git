package PracticeQuestions;

public class FlippingImage {
    public static void main(String[] args){
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };
        for(int[] values: flipAndInvertImage(image)){
            for(int value: values){
                System.out.print(value+" ");
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] image){
        int[][] result = new int[image.length][image.length];
        for(int row=0; row<image.length; row++){
            int temp = image.length;
            for(int col = 0; col<image[row].length; col++){
                result[row][col] = image[row][--temp];
                if(result[row][col] == 0){
                    result[row][col] = 1;
                }else{
                    result[row][col] = 0;
                }
            }
        }
        return result;
    }
}
