package HASHAPP;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class RANDOMISER {

    public static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        StringBuilder builder = new StringBuilder();
        for (String letter : letters) {
            builder.append(letter);
        }
        return builder.toString();
    }

    public static void main2() throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter hash");
        String str = in.nextLine();
        String result = shuffleString(str);

        System.out.println("Actual String : " + str);
        System.out.println("Shuffled String : " + result);
    }
}
