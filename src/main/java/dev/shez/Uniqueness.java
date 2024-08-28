package dev.shez;

public class Uniqueness {

    public static boolean checkUniqueness(String word) {
        for(int outer = 0; outer < word.length() -1; outer++) {
            char target = Character.toLowerCase(word.charAt(outer));
            for(int inner = outer + 1; inner < word.length(); inner++) {
                char current = Character.toLowerCase(word.charAt(inner));

                if(target == current) {
                    return false; // not unique
                }
            }
        }

        return true; // unique
    }

    public static boolean checkUniqueness2(String word) {
        boolean[] checker = new boolean[128];
        for(char c : word.toCharArray()) {
            if(checker[c]) {
                return false;
            } else {
                checker[c] = true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "troublesome";
        boolean result = Uniqueness.checkUniqueness2(word);

        System.out.printf("Word %s uniqueness: %b%n", word, result);
    }
}
