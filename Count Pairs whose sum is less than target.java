class Solution {
    int countPairs(int arr[], int target) {
        Arrays.sort(arr);
        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        // Two-pointer technique
        while (left < right) {
            if (arr[left] + arr[right] < target) {
                // All pairs between left and right are valid
                count += (right - left);
                left++; // Move left pointer to the right
            } else {
                // Sum is too large, move the right pointer to the left
                right--;
            }
        }

        return count;
    }
}
