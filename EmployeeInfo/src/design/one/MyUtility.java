package design.one;

public class MyUtility {

    public static int countVowel(UserName userName) {
        int response = 0;
        MyUtility myUtility = new MyUtility();
        String fullName = userName.fullName();
        for (int i = 0; i < fullName.length(); i++) {
            char temp = fullName.charAt(i);
            if (myUtility.isVowel(temp)){
                response++;
            }

        }
        return response;


    }

    public boolean isVowel(char character) {
        boolean response = false;
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            response = true;
        }
        return response;
    }
}
