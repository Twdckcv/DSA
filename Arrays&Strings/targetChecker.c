#include <stdio.h>
#include <stdbool.h>

bool checkForTarget(int nums[], int n, int target) {
    int left = 0;
    int right = n - 1;

    while (left < right)
    {
        if (nums[left] + nums[right] < target)
        {
            left++;
        }
        else if (nums[left] + nums[right] > target)
        {
            right--;
        }
        
        return  true;
    }
    return false;
}

int main() {
    int n, target;
    
    printf("Enter the number of elements in your array: ");
    scanf("%d", &n);
    int nums[n];

    printf("Enter the elements of the array:\n");
    for (int i = 0; i < n; i++) {
        scanf("%d", &nums[i]);
    }

    printf("Enter the target value: ");
    scanf("%d", &target);

    bool found = checkForTarget(nums, n, target);
    if (!found) {
        printf("Target not found in the array.\n");
    }
    printf("Target found in the array.\n");
    return 0;
}
