class Solution {
    public int totalFruit(int[] fruits) {
        int l=0;
        int r=0;
        int maxLen =0;

        Map<Integer,Integer> map = new HashMap<>();

          //for add
        for(r=0;r<fruits.length;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
          
          //shrink
          while(map.size()>2){
            map.put(fruits[l],map.get(fruits[l])-1);

            if(map.get(fruits[l])==0){
                map.remove(fruits[l]);
            }
            l++;
          }
          maxLen = Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}