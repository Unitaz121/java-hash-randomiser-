package com.company;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//shuffle strings
public class RANDOMHASH {
    public static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        StringBuilder builder = new StringBuilder();
        for (String letter : letters) {
            builder.append(letter);
        }
        return builder.toString();
    }

    public static void main(String args[]) throws Exception {
        String str = "0a4d55a8d778e5022fab701977c5d840bbc486d0";
        String result = shuffleString(str);

        System.out.println("Actual String : " + str);
        System.out.println("Shuffled String : " + result);
    }

}
