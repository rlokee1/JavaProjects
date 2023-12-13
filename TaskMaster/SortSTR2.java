package TaskMaster;

import java.util.Arrays;
import java.util.Comparator;

class SortSTR2 {
    public static void main(String[] args) {
        String[] a = {"leo", "Ar", "Pisces", "Sabaridas"};
        // Sort the array 'a' in descending order by character count
        Arrays.sort(a, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });

        // Print the sorted array
        for (String str : a) {
            System.out.println(str);
        }
    }
}