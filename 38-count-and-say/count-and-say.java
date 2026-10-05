class Solution {
    public String countAndSay(int n) {

        String s = "1";

        for (int k = 1; k < n; k++) {
            StringBuilder next = new StringBuilder();

            int i = 0;

            while (i < s.length()) {
                int j = i;

                // Count consecutive identical digits
                while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                    j++;
                }

                int count = j - i;

                // Append count followed by the digit
                next.append(count);
                next.append(s.charAt(i));

                i = j;
            }

            s = next.toString();
        }

        return s;
        
    }
}