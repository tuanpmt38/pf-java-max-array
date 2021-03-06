import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        //input size
        do {
            System.out.print("Enter size:");
            size = sc.nextInt();
            if (size > 10)
                System.out.println("Size should not exceed 10");
        } while (size > 10);
        //input element array
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i) + ":");
            array[i] = sc.nextInt();
        }
        //display list
        System.out.print("Property list:" + "\n");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //find max
        int max = array[0];
        int index = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j+1 ;
            }
        }
        System.out.println("\n" + "The largest property value in the list is " + max + " ,at position " + index);
    }
}
