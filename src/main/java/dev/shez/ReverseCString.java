package dev.shez;

public class ReverseCString {

    private static String reverse(String word) {
        char[] chars = word.toCharArray();
        char[] reversed = new char[chars.length];
        int index = 0;

        for(int iter = (chars.length - 2); iter >= 0; iter--) {
            reversed[index] = chars[iter];
            index++;
        }

        reversed[index] = '\n';
        return new String(reversed);
    }

    public static void main(String... args) {
        String word = new String(new char[]{'b','e','a','r','d','\n'});
        System.out.println(ReverseCString.reverse(word));
    }
}
