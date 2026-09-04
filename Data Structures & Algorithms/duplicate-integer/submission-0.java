class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(Integer i:nums){
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        for(Integer count: freqMap.values()){
            if(count > 1){
                return true;
            }
        }

        return false;
    }
}