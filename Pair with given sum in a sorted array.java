class Solution {

    int countPairs(int arr[], int target) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            
            if (map.containsKey(complement)) {
                ans += map.get(complement);
            }
            
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        return ans;
    }
}
