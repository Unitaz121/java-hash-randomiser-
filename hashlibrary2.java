package com.company;

import java.security.MessageDigest;
import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;
import java.util.*;



public class hashlibrary2 {
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
    public static String shuffleString(String string) {
        List<String> letters = Arrays.asList(string.split(""));
        Collections.shuffle(letters);
        StringBuilder builder = new StringBuilder();
        for (String letter : letters) {
            builder.append(letter);
        }
        return builder.toString();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter password");
        String someString = in.nextLine();
        System.out.println(getHash(someString.getBytes(),"SHA-1" +
                ""));
        in.close();
    }


}