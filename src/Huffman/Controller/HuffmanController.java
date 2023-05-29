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

    public String findTheCode(String input,String custText) {
        
        String RESULT = "";
        String encodedCustomString = hf.encode(custText);        
        System.out.println(encodedCustomString);

        if (encodedCustomString.equals(input)) {
            RESULT = "MATCH";
        } else {
            RESULT = "NOT";
        }
        
        return RESULT;
    }
    
    public String findTheCode(String custText) {
        return hf.encode(custText);
    }

    public String findTheString(String input,String custString) {
        String RESULT = "";
        String customString = custString;
        String customEncode = hf.encode(customString);
        System.out.println(customEncode);

        String customDecode = hf.decode(customEncode, hf.getTree());

        if (customDecode.equals(input)) {
            RESULT = "MATCH";
        } else {
            RESULT = "NOT";
        }
        
        return RESULT;
    }
    
    public String findTheString(String custString) {
        String customEncode = hf.encode(custString);
        return hf.encode(custString);
    }
    
    public String findTheString(String custString,boolean isAnswer) {
        String customEncode = hf.encode(custString);
        return hf.decode(customEncode, hf.getTree());
    }

    public String genrateCustText() {

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
