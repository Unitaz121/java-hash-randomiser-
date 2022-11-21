package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;



// create a menu
// options if else
//saving function
// view function
// delete function
// type password, generate hash(from sha1 to sha512), generate randomiser.

public class HASHLIBRARY {
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

    public String someString;//password
    public int yes;
            public int no;
     // i need to have an option that the results from the previous operation will be used in the next automatically.
    String str = this.someString;
    String result = shuffleString(str);
    Scanner input = new Scanner(System.in);
    Scanner scanchoice = new Scanner(System.in);
    public HASHLIBRARY(){
        System.out.println("Enter any password:");
        this.someString = input.nextLine();
        System.out.println("Do you want to decrypt existing hash?:");
        System.out.println("Enter \"1\", or \"2\"");
        int choiceentry = scanchoice.nextInt();
        while (choiceentry != 2) {
            if (choiceentry < 2) {

            }
        }

    }
// System.out.println(getHash(someString.getBytes(),"SHA-1" +
//                ""));
//        in.close();


}
