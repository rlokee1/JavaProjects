package Array360;
import java.util.Arrays;

public class compARR {

        // Function to find union
        static void Union(int[] a, int[] b, int n, int m) /*Here n and m are array lengths respectively*/
        {
            int[] result = new int[n + m];
            int index = 0;
            int left = 0, right = 0;

            while(left < n && right < m) {                  //Merely n=9 and m=3
                if (a[left] < b[right]) {
                    if (index != 0
                            && a[left] == result[index - 1]) {
                        left++;
                    }
                    else {
                        result[index] = a[left];
                        left++;
                        index++;
                    }
                }
                else {
                    if (index != 0
                            && b[right] == result[index - 1]) {
                        right++;
                    }
                    else {
                        result[index] = b[right];
                        right++;
                        index++;
                    }
                }
            }System.out.println(right + " " + index);
            //System.out.println(index);

            while (left < n) {
                if (index != 0
                        && a[left] == result[index - 1]) {
                    left++;
                }
                else {
                    result[index] = a[left];
                    left++;
                    index++;
                }
            }

            while (right < m) {
                if (index != 0
                        && b[right] == result[index - 1]) {
                    right++;
                }
                else {
                    result[index] = b[right];
                    right++;
                    index++;
                }
            }

            System.out.print("Union: ");
            for (int k = 0; k < index; k++)
                System.out.print(result[k] + " ");

        }

        // Function to find intersection
        static void intersection(int[] a, int[] b, int n, int m)
        {

            int i = 0, j = 0, k = 0;
            int[] result = new int[n + m];
            while (i < n && j < m) {
                if (a[i] < b[j])
                    i++;
                else if (a[i] > b[j])
                    j++;
                else {
                    if (k != 0 && a[i] == result[k - 1]) {
                        i++;
                        j++;
                    }
                    else {
                        result[k] = a[i];
                        i++;
                        j++;
                        k++;
                    }
                }
            }
            System.out.print("Intersection: ");
            for (int x = 0; x < k; x++)
                System.out.print(result[x] + " ");
        }

        // Driver Code
        public static void main(String[] args)
        {
            int[] a = { 1, 3, 2, 3, 3, 4, 5, 5, 6 };
            int[] b = { 3, 3, 5 };

            int n = a.length;
            int m = b.length;

//            Arrays.sort(a);
//            Arrays.sort(b);

            // Function call
            Union(a, b, n, m);
            System.out.println("");
            intersection(a, b, n, m);
    }
}