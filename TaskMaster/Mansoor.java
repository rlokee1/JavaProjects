//package TaskMaster;
//
//public class Mansoor {
//    public static Integer findThirdMaximum(int[] arr, int index, int first, Integer second, Integer third) {
//        if (index < 0) {
//            return third;
//        }
//        int element = arr[index];
//
//        if (element > first) {
//            third = second;
//            second = first;
//            first = element;
//        } else if (second == null || element > second) {
//            third = second;
//            second = element;
//        } else if (third == null || element > third) {
//            third = element;
//        }
//
//        return findThirdMaximum(arr, index - 1, first, second, third);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {3, 5, 0, 8, 7, 9};
//        Integer thirdMax = findThirdMaximum(arr, arr.length - 1, 0, null, null);
//        System.out.println("The third maximum value is: " + thirdMax);
//    }
//}