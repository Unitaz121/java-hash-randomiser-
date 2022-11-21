package com.company;

import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class hash {
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

    public static void main(String[] args){
        String someString = "Hello World";
        System.out.println(getHash(someString.getBytes(),"SHA-1" +
                ""));
    }
}
