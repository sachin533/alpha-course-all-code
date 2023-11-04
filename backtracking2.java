public class backtracking2 {

    public static void findsubsets(String str, String ans, int i) {
        // base case
        if (i == str.length()) {

            if (ans.length() == 0) {
                System.out.println("null");
            }
            System.out.println(ans);

            return;
        }

        // recursion
        // Yes

        findsubsets(str, ans + str.charAt(i), i + 1);

        // No

        findsubsets(str, ans, i + 1);

    }

    public static void main(String args[]) {
        String str = "abc";
        findsubsets(str, "", 0);
    }

}
