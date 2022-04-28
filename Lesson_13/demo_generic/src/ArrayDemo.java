public class ArrayDemo<E> {
    public static void main(String[] args) {
        String[] sArr = {"a", "b", "c", "d"};

        //showSArr(sArr);
        showArr(sArr);

        Integer[] iArr = {1,2,3,4,5};
        //showIArr(iArr);
        showArr(iArr);


        Double[] dArr = {1.3 , 4.5, 9d, 3.4};
        showArr(dArr);
    }

    //Áp dụng cho mảng kiểu String
    public static void showSArr(String[] arr){
        for(String s: arr){
            System.out.println(s);
        }
    }

    //Áp dụng cho mảng int
    public static void showIArr(int[] arr){
        for (int i : arr){
            System.out.println(i);
        }
    }

    public static <E> void showArr(E[] arr){
        for(E e : arr){
            System.out.println(e);
        }
    }
}
