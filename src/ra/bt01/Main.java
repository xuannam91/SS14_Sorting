package ra.bt01;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

    }


    //	sắp xếp nổi bọt sort
//    public static void bubbleSort(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // hoán đổi 2 phần tử
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//    }

    //	sắp xếp chọn sort
//    public static void selectionSort(int[] arr) {
//        int min;
//        for (int i = 0; i < arr.length - 1; i++) {
//            min = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[j] < arr[min]) {
//                    min = j;
//                }
//            }
//            if (min != i) {
//                int temp = arr[min];
//                arr[min] = arr[i];
//                arr[i] = temp;
//            }
//        }
//    }
    // săp xếp chèn
    public static void insertionSort(int[] arr) {
        int pos, x;
        for(int i = 1; i < arr.length; i++){
            x = arr[i];
            pos = i;
            while(pos > 0 && x < arr[pos-1]){
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = x;
        }
    }
}
