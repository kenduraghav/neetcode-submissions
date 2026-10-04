

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          // 1. Build frequency map
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }

        // 2. Store the top k elements
        int[] result = new int[k];

        // 3. Find the maximum frequency k times
        for (int i = 0; i < k; i++) {

            int maxFrequency = 0;
            int maxKey = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > maxFrequency) {
                    maxFrequency = entry.getValue();
                    maxKey = entry.getKey();
                }
            }

            // 4. Store the key, not the frequency
            result[i] = maxKey;

            // 5. Remove it so it won't be selected again
            map.remove(maxKey);
        }

        return result;
    
    }
}
