public class MultiArray {
    public static void main(String[] args) {
       // int[][] arr = new int[3][4];
        //arr[0][0] = 4;

        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        System.out.println(arr.length);

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
