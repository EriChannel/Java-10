import java.util.Arrays;

public class TestSystem {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 1;
        arr[2] = 8;
        arr[3] = 9;
        arr[4] = 2;

        System.out.println("Số phần tử có trong mảng: " + arr.length);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println("Dùng foreach");
        for(int i : arr){
            if(i%2==0){
                System.out.println(i);
            }
        }

        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp");
        for(int i : arr){
            System.out.println(i);
        }

        int[] copy = Arrays.copyOf(arr, 10);
        System.out.println("Mảng sao chép: ");
        for(int i : copy){
            System.out.println(i);
        }

        String s = Arrays.toString(copy);
        System.out.println(s);
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == 8){
//                System.out.println("index : " + i);
//            }
//        }
//
//        int count = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] % 2 == 0){
//                System.out.println(arr[i]);
//                count++;
//            }
//        }
//        System.out.println("Số phần tử chẵn: " + count);
//
//        int max = arr[0];
//        for(int i = 0; i < arr.length; i++){
//            if (max < arr[i]){
//                max = arr[i];
//            }
//        }
//
//        System.out.println("Phần tử lơn nhất là: " + max);
//
//        System.out.println("Sắp xếp");
//        for(int i = 0 ; i < arr.length; i++){
//            for(int j = i+1; j < arr.length; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("Mảng sau khi sắp xếp : ");
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

//        String[] languages = new String[5];
//        languages[0] = "HTML/CSS";
//        languages[1] = "Java";
//        languages[4] = "JS";
//        languages[2] = "Kotlin";
//        languages[3] = "Ruby";
//
//        for(int i = 0 ; i < languages.length; i++){
//            System.out.println(languages[i]);
//        }
//
//        String[] name = {"Ngọc", "Linh", "Tuấn"};
//
//        for(int i = 0 ; i < name.length; i++){
//            System.out.println(name[i]);
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số phần tử mảng: ");
//        int n = sc.nextInt();
//
//        double[] points = new double[n];
//        for(int i = 0; i < n; i++){
//            System.out.printf("Nhập phần tử thứ %d: ", (i+1));
//            points[i] = sc.nextDouble();
//        }
//
//        System.out.println("Mảng số thực: ");
//        for(int i = 0; i < n; i++){
//            System.out.print(points[i] + " \t");
//        }

//        String str = "nó chỉ dừng vòng lặp bên trong đó";
//        String[] s = str.split("\\s");
//        System.out.println("Trong chuỗi có bao nhiêu từ: " + s.length);
//        for(int i = 0 ; i < s.length; i++){
//            System.out.println(s[i]);
//        }



    }
}
