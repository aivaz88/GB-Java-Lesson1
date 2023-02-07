/*
 * Вывести все простые числа от 1 до 1000
 */
public class task2 {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        arr[0] = 2;
        for (int i = 3; i <= 1000; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0) {
                    if (i%arr[j] == 0) {
                        break;
                    }
                }
                else {
                    arr[j] = i;
                    break;
                }
            }
        }
        for (int i : arr) {
            if (i != 0){
                System.out.println(i);
            }
        }
    }
}
