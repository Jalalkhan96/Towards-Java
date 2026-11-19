// Find the second largest distinct element in an array.
// e.g. {5, 9, 9, 3} -> 5 (9 is largest, 5 is next distinct value)
// {7, 7, 7} has no second largest element.

public class SecondLargestInArray {

    public static Integer secondLargest(int[] arr) {
        if (arr.length < 2) {
            return null;
        }
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n < largest) {
                second = n;
            }
        }
        return second == Integer.MIN_VALUE ? null : second;
    }

    public static void main(String[] args) {
        int[] a = {5, 9, 9, 3};
        System.out.println("Second largest of {5, 9, 9, 3} = " + secondLargest(a));

        int[] b = {1, 2, 3, 4, 5};
        System.out.println("Second largest of {1, 2, 3, 4, 5} = " + secondLargest(b));

        int[] c = {7, 7, 7};
        System.out.println("Second largest of {7, 7, 7} = " + secondLargest(c));

        int[] d = {-10, -3, -20};
        System.out.println("Second largest of {-10, -3, -20} = " + secondLargest(d));
    }
}
