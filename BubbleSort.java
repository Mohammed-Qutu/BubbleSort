/* 
Bubble sort is the simplest sorting algorithm
Mohammed Qutu
03/03/24
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
*/

public class BubbleSort {

    public static void main(String[] args) {
        int[] number = {8, 5, 3, 2, 9};
        boolean swap = true;
        int temp;

        // Perform bubble sort
        while (swap) {
            swap = false;
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    temp = number[i + 1];
                    number[i + 1] = number[i];
                    number[i] = temp;
                    swap = true;
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
