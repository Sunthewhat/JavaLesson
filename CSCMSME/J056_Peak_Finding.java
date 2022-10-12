import java.util.Scanner;

public class J056_Peak_Finding {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[size];
        int output[] = new int[size];
        for (int i = 0; i < size; i++) {
            int a = input.nextInt();
            array[i] = a;
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (size == 1) {
                output[0] = array[i];
                count++;
                break;
            }
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    output[count] = array[i];
                    count++;
                }
            } else if (i == (size - 1)) {
                if (array[i] > array[i - 1]) {
                    output[count] = array[i];
                    count++;
                }
            } else if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                output[count] = array[i];
                count++;
            }
        }
        System.out.println(count);
        for (int j : output) {
            if (j == 0)
                break;
            System.out.print(j + " ");
        }
        input.close();
    }
}
