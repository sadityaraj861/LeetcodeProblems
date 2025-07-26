class Solution {
    public String longestNiceSubstring(String s) {
        String result = "";
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = s.substring(i, j);

                if (isNice(substring)) {

                    if (substring.length() > result.length()) {
                        result = substring;
                    }
                }
            }
        }

        return result;
    }

    private boolean isNice(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                if (!s.contains(Character.toString(Character.toUpperCase(c)))) {
                    return false;
                }
            } else {
                if (!s.contains(Character.toString(Character.toLowerCase(c)))) {
                    return false;
                }
            }
        }
        return true;
    }
}