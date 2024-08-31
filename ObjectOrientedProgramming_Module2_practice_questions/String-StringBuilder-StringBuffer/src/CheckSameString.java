/*Write a program to check whether two given strings contains same set of characters as well as having same length.

 input
 String s1 = "amar";
 String s2= "rama";

 output : Both contains same characters
 */
public class CheckSameString {
    public static void main(String[] args) {
        String s1 = "amar";
        String s2 = "rama";
        boolean isFound = false;
        if (s1.length() == s2.length()) {

            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        isFound = true;
                    }

                }
            }

        }else {
            System.out.println("length are not equal");
        }
        System.out.println("isFound = " + isFound);
    }
}
