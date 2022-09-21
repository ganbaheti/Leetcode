class Solution {
    public String convert(String s, int numRows) {
        if (s == null || numRows <= 0) {
            throw new IllegalArgumentException("Input is invalid");
        }
        int len = s.length();
        if (numRows == 1 || len <= numRows) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int cycleLen = 2 * numRows - 2;
        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i + j < len; i += cycleLen) {
                sb.append(s.charAt(i + j));
                if (j != 0 && j != numRows - 1 && i + cycleLen - j < len) {
                    sb.append(s.charAt(i + cycleLen - j));
                }
            }
        }
        return sb.toString();
    }
}