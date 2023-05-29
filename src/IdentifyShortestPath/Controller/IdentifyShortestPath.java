/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IdentifyShortestPath.Controller;

import IdentifyShortestPath.Model.IdentifyShortestPathModel;
import java.sql.SQLException;

/**
 *
 *
 * @author Hikma
 */
public class IdentifyShortestPath {

    public int start(int[] distance, String destination) {
        int distanceSum = 0;
        Dijkstra dj = new Dijkstra();

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");
        Node nodeH = new Node("H");
        Node nodeI = new Node("I");
        Node nodeJ = new Node("J");

        nodeA.addDestination(nodeI, distance[0]);
        nodeA.addDestination(nodeJ, distance[1]);
        nodeA.addDestination(nodeF, distance[2]);
        nodeA.addDestination(nodeB, distance[3]);
        nodeA.addDestination(nodeE, distance[4]);

        nodeE.addDestination(nodeG, distance[5]);
        nodeE.addDestination(nodeB, distance[6]);

        nodeB.addDestination(nodeC, distance[7]);

        nodeC.addDestination(nodeH, distance[8]);

        nodeH.addDestination(nodeD, distance[9]);

        nodeD.addDestination(nodeJ, distance[10]);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);
        graph.addNode(nodeG);
        graph.addNode(nodeH);
        graph.addNode(nodeI);
        graph.addNode(nodeJ);

        graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

        switch (destination) {
            case "B": {
                distanceSum=0;
                for (Node node : nodeB.getShortestPath()) {
                    //System.out.println(node.getName());
                    //System.out.println(node.getDistance());
                    distanceSum = distanceSum + node.getDistance()+nodeB.getDistance();
                }
                break;
            }
            case "C": {
                distanceSum=0;
                for (Node node : nodeC.getShortestPath()) {
                    //System.out.println(node.getName());
                    //System.out.println(node.getDistance());
                    distanceSum = distanceSum + node.getDistance()+nodeC.getDistance();
                }
                break;
            }
            case "D": {
                distanceSum=0;
                for (Node node : nodeD.getShortestPath()) {
                    //System.out.println(node.getName());
                    //System.out.println(node.getDistance());
                    distanceSum = distanceSum + node.getDistance()+nodeD.getDistance();
                }
                break;
            }
            case "E": {
                distanceSum=0;
                for (Node node : nodeE.getShortestPath()) {
                    //System.out.println(node.getName());
                    //System.out.println(node.getDistance());                    
                    distanceSum = distanceSum + node.getDistance()+nodeE.getDistance();
                }
                break;
            }
            case "F": {
                distanceSum=0;
                for (Node node : nodeF.getShortestPath()) {
                    //System.out.println(node.getName());
                    //System.out.println(node.getDistance());
                    distanceSum = distanceSum + node.getDistance() + nodeF.getDistance();
                }
                break;
            }
            case "G": {
                distanceSum=0;
                for (Node node : nodeG.getShortestPath()) {
                    //System.out.println(node.getName());
                    //System.out.println(node.getDistance());
                    distanceSum = distanceSum + node.getDistance()+ nodeG.getDistance();
                }
                break;
            }
            case "H": {
                for (Node node : nodeH.getShortestPath()) {
                    //System.out.println(node.getName());
                    //System.out.println(node.getDistance());
                    distanceSum = distanceSum + node.getDistance()+ nodeH.getDistance();
                }
                break;
            }
            case "I": {
                distanceSum=0;
                for (Node node : nodeI.getShortestPath()) {
                    //System.out.println(node.getName());
                    //System.out.println(node.getDistance());
                    distanceSum = distanceSum + node.getDistance()+ nodeI.getDistance();
                }
                break;
            }
            case "J": {
                distanceSum=0;
                for (Node node : nodeJ.getShortestPath()) {
                    //System.out.println(node.getName());
                    //System.out.println(node.getDistance());
                    distanceSum = distanceSum + node.getDistance()+ nodeJ.getDistance();
                }
                break;
            }
            
        }

        return distanceSum;
    }

    public int generateRandom() {
        int random = 0;
        int min = 5, max = 50;

        return (int) (Math.random() * (max - min + 1) + min);
    }

    public boolean savePlayerDetails(String playerName, String cities) throws SQLException {
        IdentifyShortestPathModel model = new IdentifyShortestPathModel();
        return model.insertPlayer(playerName,cities);
    }
}
