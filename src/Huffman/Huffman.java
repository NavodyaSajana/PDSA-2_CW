/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Huffman;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author Sajana
 */
public class Huffman {
    
    private static class Node implements Comparable<Node> {
        char c;
        int frequency;
        Node left;
        Node right;

        public Node(char c, int frequency) {
            this.c = c;
            this.frequency = frequency;
            left = right = null;
        }

        @Override
        public int compareTo(Node o) {
            return this.frequency - o.frequency;
        }
    }
    private PriorityQueue<Node> tree;

    private PriorityQueue setTree(String input) {

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        
        PriorityQueue<Node> queue = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            queue.add(new Node(entry.getKey(), entry.getValue()));
        }

        
        while (queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();

            Node parent = new Node('\0', left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;

            queue.add(parent);
        }
        
        
        
        return queue;
    }
    public String encode(String input){

        PriorityQueue<Node> queue = new PriorityQueue<>();
        queue=setTree(input);
        
        Map<Character, String> huffmanCodes = new HashMap<>();
        traverse(queue.peek(), "", huffmanCodes);

        
        String encodedString = "";
        for (char c : input.toCharArray()) {
            encodedString += huffmanCodes.get(c);
        }
        tree=queue;
        /*String decoded = decode(encodedString, queue.peek());

        System.out.println("Input: " + input);
        System.out.println("Encoded: " + encodedString);
        System.out.println("Decoded: " + decoded);*/
        
        
        return encodedString;
    }

    private static void traverse(Node node, String code, Map<Character, String> huffmanCodes) {
        if (node.c != '\0') {
            huffmanCodes.put(node.c, code);
        } else {
            traverse(node.left, code + "0", huffmanCodes);
            traverse(node.right, code + "1", huffmanCodes);
        }
    }
    
    public Node getTree(){
        return tree.peek();
    }
    
    public String decode(String encodedText,Node root) {
        StringBuilder decodeString = new StringBuilder();
        Node current = root;
        for (char c : encodedText.toCharArray()) {
            if (c == '0') {
                current = current.left;
            } else {
                current = current.right;
            }

            if (current.c != '\0') {
                decodeString.append(current.c);
                current = root;
            }
        }
        return decodeString.toString();
    }
}
