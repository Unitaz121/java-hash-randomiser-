package HASHAPP;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class MAIN {
    public static void main3() {

        HASH HASHObject = new HASH();
        RANDOMISER RANDOMISERObject = new RANDOMISER();
        HASH.main();
        try {
            RANDOMISER.main2();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }



}
