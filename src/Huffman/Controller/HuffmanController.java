/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Huffman.Controller;

import Huffman.Huffman;

/**
 *
 * @author Sajana
 */
public class HuffmanController {

    Huffman hf = new Huffman();

    public void findTheCode(String input) {
        //needs to add validations

        //String customString = "Sajana";
        String customString = genrateCustText();

        System.out.println("Enter the encoded value for below Text");
        System.out.println(customString);

        String encodedCustomString = hf.encode(customString);

        if (encodedCustomString.equals(input)) {
            System.out.println("Values are matching");
        } else {
            System.out.println("Values are not matching");
        }
    }

    public void findTheString(String input) {

        
        //String customString = "Sajana";
        String customString = genrateCustText();
        System.out.println("Enter the decoded value for below Text");
        String customEncode = hf.encode(customString);
        System.out.println(customEncode);

        String customDecode = hf.decode(customEncode, hf.getTree());

        if (customDecode.equals(input)) {
            System.out.println("Values are matching");
        } else {
            System.out.println("Values are not matching");
        }
    }

    static String genrateCustText() {

        String AlphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";

        StringBuilder s = new StringBuilder(30);

        int i;

        for (i = 0; i < 30; i++) {
            int ch = (int) (AlphaNumericStr.length() * Math.random());
            s.append(AlphaNumericStr.charAt(ch));
        }
        return s.toString();
    }
}
