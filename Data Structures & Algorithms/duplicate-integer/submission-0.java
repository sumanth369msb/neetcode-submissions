class Solution {
    public boolean hasDuplicate(int[] nums) {
      Set dupe = new HashSet<>();
      for(int i=0;i<nums.length; i++){
        if(!dupe.add(nums[i])){
            // System.out.println(!dupe.add(i));
            return true;
        }
      }return false;

    }
}