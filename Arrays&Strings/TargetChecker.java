import java.util.Scanner;

public class TargetChecker {

    public static boolean checkForTarget(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] > target) {
                right--;
            }
            else if (nums[left] + nums[right] < target) {
                left++;
            }
            else{
                System.out.println("Numbers " + nums[left] + " and " + nums[right] + " add up to the target " + target + ".");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting user to enter the number of elements in the array
        System.out.print("Enter the number of elements in your array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        // Reading array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Prompting user to enter the target value
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Checking if the target is in the array
        boolean found = checkForTarget(nums, target);
        if (found) {
            System.out.println("Target found in the array.");
        } else {
            System.out.println("Target not found in the array.");
        }

        scanner.close();
    }
}
