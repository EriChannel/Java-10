import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       // Main m = new Main();
        int[] array = createArray();
        show(array);
        System.out.println(findMax(array));
    }

    public static int[] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.printf("Nhập phần tử thứ %d:", (i+1));
            arr[i] = sc.nextInt();
        }

        return arr;

    }

    public static void show(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }


}
