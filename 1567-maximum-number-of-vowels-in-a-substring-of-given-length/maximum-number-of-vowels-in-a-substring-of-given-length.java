
class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int l = 0;
        int max = 0;

        for (int r = 0; r < s.length(); r++) {
            char ch1 = s.charAt(r);

            if ("aeiou".indexOf(ch1) != -1) {
                count++;
            }

            if (r - l + 1 > k) {
                char ch2 = s.charAt(l);

                if ("aeiou".indexOf(ch2) != -1) {
                    count--;
                }

                l++;
            }

            if (r - l + 1 == k) {
                max = Math.max(max, count);
            }

            if (max == k) {
                return max;
            }
        }

        return max;
    }
}
