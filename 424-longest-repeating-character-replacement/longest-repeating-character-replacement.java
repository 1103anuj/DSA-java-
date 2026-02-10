class Solution {
    public int characterReplacement(String s, int k) {

        int l = 0;
        int maxLen = 0;
        int maxFreq = 0;

        int[] freq = new int[26];

        for (int r = 0; r < s.length(); r++) {

            // add current char
            freq[s.charAt(r) - 'A']++;

            // update max frequency
            maxFreq = Math.max(maxFreq,
                               freq[s.charAt(r) - 'A']);

            // shrink window if invalid
            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            // update answer
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}
