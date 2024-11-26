public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 7;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("element was not found in the array");
        } else {
            System.out.println("element is found at index " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int first = 0, last = arr.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
}
