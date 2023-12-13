package Interview_programs;

import java.util.Arrays;

public class UniqDupValue {

    public static void main(String[] args) {
        int[] a = {1, 3, 1, 2, 1, 3, 4, 2, 1, 5, 2}; // | 1 | 3 | 1 | 2 | 1 | 3 | 4 | 2 | 1 | 5 | 2 |
        int[] dupArray = new int[a.length];          // | 4 | 2 | -1| 3 | -1| -1| 1 | -1| -1| 1 | -1|
        int[] nonDupArray = new int[a.length];
        int[] uniqueArray = new int[a.length];
        int[] Freq = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int no = a[i];                        //no=a[i]={1,3,2,1,.....,3}
            int count = 1;

            for (int j = i + 1; j < a.length; j++) {
                if (no == a[j]) {
                    count++;
                    Freq[j] = -1;
                }
            }
            if (Freq[i] != -1) {
                Freq[i] = count;
                System.out.println("The number in the array " + a[i] + " has repeated " + count + " times ");
            }
        }
        System.out.println("************************************************************************");
        int j = 0;
        for (int i = 0; i < Freq.length; i++) {
            if (Freq[i] > 1) {
                dupArray[j] = a[i];
                j++;
            }
        }System.out.println("Freq:"+ Arrays.toString(Freq));
        System.out.println("DupArray :"+ Arrays.toString(dupArray));

        System.out.println('\n' + "Duplicate values in the array : ");
        for (int i = 0; i < dupArray.length; i++) {
            int value = dupArray[i];
            if (Freq[i] > 1)
                System.out.println(value + " ");
        }

        System.out.println('\n'+"************************************************************************");

        for (int i = 0; i < Freq.length; i++) {
            if (Freq[i] == 1) {
                nonDupArray[j] = a[i];
                j++;
            }
        }

        System.out.println('\n' + "Non Duplicate values in the array : ");
        for (int i = 0; i < nonDupArray.length; i++) {
            int value = nonDupArray[i];
            if (value > 0)
                System.out.println(value + " ");
        }

        System.out.println('\n'+"************************************************************************");

        for (int i = 0; i < Freq.length; i++) {
            if (Freq[i] > 0) {
                uniqueArray[j] = a[i];
                j++;
            }
        }
        System.out.println('\n' + "Unique values in the array : ");
        for (int i = 0; i < uniqueArray.length; i++) {
            int value = uniqueArray[i];
            if (value > 0)
                System.out.println(value + " ");
        }
        System.out.println("************************************************************************");
    }
}

