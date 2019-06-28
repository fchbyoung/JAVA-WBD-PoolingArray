import java.util.Scanner;

public class PoolingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] array3 = new int[10];

        System.out.println("Array List 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Enter an element " + (i + 1));
            array1[i] = scanner.nextInt();
            array3[i] = array1[i];
        }

        int j = 0;
        System.out.println("Array List 2:");
        for (int i = array1.length ; i < array3.length; i++) {
            System.out.println("Enter an element " + (j + 1));
            array2[j] = scanner.nextInt();
            array3[i] = array2[j];
            j++;
        }

        System.out.print("Array List 3 : ");
        for (j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + " \t");
        }

    }
}
