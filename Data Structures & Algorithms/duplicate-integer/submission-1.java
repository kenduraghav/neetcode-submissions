class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entrySet: freqMap.entrySet()){
            if(entrySet.getValue() > 1){
                return true;
            }
        }
         return false;
    }
   
}