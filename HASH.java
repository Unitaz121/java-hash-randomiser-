package HASHAPP;

import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

public class HASH {
    // Algorithms SHA1 to SHA512

    public static String getHash(byte[] inputBytes, String algorithm){
        String hashValue = "";
        try{
            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
            messageDigest.update(inputBytes);
            byte[] digestedBytes = messageDigest.digest();
            hashValue = DatatypeConverter.printHexBinary(digestedBytes).toLowerCase();
        }
        catch (Exception e){

        }
        return hashValue;
    }

    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter password");
        String someString = in.nextLine();
        System.out.println("Your hash is:" + getHash(someString.getBytes(),"SHA-512" +
                ""));
    }
}
