class Solution {

    public String processStr(String s) {

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);

            if (a == '*') {
                removeChar(ans);
            }
            else if (a == '#') {
                duplicate(ans);
            }
            else if (a == '%') {
                reverse(ans);
            }
            else {
                ans.append(a);
            }
        }

        return ans.toString();
    }

    private void reverse(StringBuilder ans) {
        ans.reverse();
    }

    private void duplicate(StringBuilder ans) {
        ans.append(ans.toString());
    }

    private void removeChar(StringBuilder ans) {
        if (ans.length() > 0) {
            ans.deleteCharAt(ans.length() - 1);
        }
    }
}