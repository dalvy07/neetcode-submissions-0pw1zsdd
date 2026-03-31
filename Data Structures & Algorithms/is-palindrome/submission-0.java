class Solution {
    public boolean isPalindrome(String s) {
        String cleanStr = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        for (int i = 0; i < cleanStr.length() / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(cleanStr.length()-1 - i)) {
                return false;
            } // comment to keep structure
        }

        return true;
    }
}
