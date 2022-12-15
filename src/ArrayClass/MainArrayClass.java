package ArrayClass;

import java.util.Arrays;
import java.util.Random;

public class MainArrayClass {
    public static void main(String[] args) {
        //generate random number array
        Random number = new Random();
        int [] age = new int[15];
        for (int i = 0; i < age.length; i++) {
            age[i] = number.nextInt(60);
            System.out.print(age[i]+"\t");
        }
        System.out.println("\n");
        int tes[] = {11,43,56,1,3,23,45,5,62,65,89,65,23,1,12,4};
        for(int i=0;i<tes.length;i++){
            System.out.print(tes[i]+"\t");
        }
        System.out.println("\n");
        //membandingkan array
        System.out.println("Integer Arrays on comparison: "
                + Arrays.compare(age, tes)+"\n");
        // mencopy array dengan length berbeda
        System.out.println("Interger array random :"+Arrays.toString(
                Arrays.copyOf(age,25)
        ));

        // mengurutkan array random
        Arrays.sort(age);
        System.out.println("Integer sort Array: "
                + Arrays.toString(age));

        //mencari angka di array random
        System.out.println("found in random array at index = "+ Arrays.binarySearch(age,28));
        // mencari angka di array statis
        System.out.println("found at index = "+Arrays.binarySearch(tes,65));
    }
}
