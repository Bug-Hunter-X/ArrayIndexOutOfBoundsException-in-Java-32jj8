public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * 2;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } else {
            System.out.println("Array is null or empty");
        }
    }
}