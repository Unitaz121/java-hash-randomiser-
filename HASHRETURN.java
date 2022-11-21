import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HASHRETURN {
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
        String str = "7b502c3a1f48c8609ae212cdfb639dee39673f5e";
        String result = shuffleString(str);

        System.out.println("Actual String : " + str);
        System.out.println("Shuffled String : " + result);
    }

}
