/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IdentifyShortestPath.Controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * 
 * @author Hikma
 */
public class Node {
    private String name;
    private Integer distance = Integer.MAX_VALUE;
    private LinkedList<Node> shortestPath = new LinkedList<>();
//    private final Set<Node> adjacentNodes = new HashSet<>();
    private final Map<Node, Integer> adjacentNodes = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
        destination.adjacentNodes.put(this, distance);
    }

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public LinkedList<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(LinkedList<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }
}
