package solution.kit.arrays;

import java.util.Arrays;

public class ArrayHelper {

    public static void main(String[] args) {

        int[] test1 = {4,1,7,0};
        System.out.println(Arrays.toString(test1));
        arrangeOrder(test1);
        System.out.println(Arrays.toString(test1));


    }

    public static void arrangeOrder(int[] numbers) {

        boolean swapped = false;
        do {
            swapped = false;
            for(int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1]) {
                    //kann natuerlich auch mit nur einer hilfsvariable leicht gemacht werden
                    int a = numbers[i];
                    int b = numbers[i+1];
                    numbers[i] = b;
                    numbers[i+1] = a;
                    swapped = true;
                }
            }
        } while(swapped==true);


    }

}
