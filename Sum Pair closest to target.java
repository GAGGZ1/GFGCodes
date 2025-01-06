
class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // Sort the array to apply the two-pointer technique
        Arrays.sort(arr);

        // Step 2: Initialize variables
        int start = 0;
        int end = arr.length - 1;
        int minDifference = Integer.MAX_VALUE;
        int maxAbsDifference = Integer.MIN_VALUE;
        List<Integer> result = new ArrayList<>();

        // Step 3: Use two pointers to find the closest sum
        while (start < end) {
            int sum = arr[start] + arr[end];

            // Calculate the difference from the target
            int difference = Math.abs(target - sum);
            int absDifference = Math.abs(arr[start] - arr[end]);

            // Update the result if the difference is smaller
            if (difference < minDifference || (difference == minDifference && absDifference > maxAbsDifference)) {
                minDifference = difference;
                maxAbsDifference = absDifference;

                // Clear and update the result ArrayList with the pair in sorted order
                result.clear();
                result.add(arr[start]);
                result.add(arr[end]);
            }

            // Move pointers based on the sum
            if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        return result;
    }
}
