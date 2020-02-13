public class Method {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5,6,7,8,9,10,
        11,12,13,14,15,16,17,18,19,20};
        int array2[] = {5,9,12,4,16,1,19,13,2,3,10};

        int num1 = 24;
        int num2 = 31;
        int num3 = 8;
        int num4 = 45;
        int num5 = 17;

        System.out.println("test#1");
        returnIndex(array1, num1);
        returnIndex(array1, num2);
        returnIndex(array1, num3);
        returnIndex(array1, num4);
        returnIndex(array1, num5);

        System.out.println("\ntest#2");
        returnIndex(array2, num1);
        returnIndex(array2, num2);
        returnIndex(array2, num3);
        returnIndex(array2, num4);
        returnIndex(array2, num5);
    }

    static void returnIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    System.out.println(num + " = index #1: " + i + " + index #2: " + j);
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
}
