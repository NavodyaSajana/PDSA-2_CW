/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IdentifyMinimumConnecters.Controller.Prim;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.math3.util.Pair;

/**
 *
 * @author Sajana
 */
public class Prim {
    private List<Vertex> graph;

    public Prim(List<Vertex> graph){
        this.graph = graph;
    }

    public void run(){
        if (graph.size() > 0){
            graph.get(0).setVisited(true);
        }
        while (isDisconnected()){
            Edge nextMinimum = new Edge(Integer.MAX_VALUE);
            Vertex nextVertex = graph.get(0);
            for (Vertex vertex : graph){
                if (vertex.isVisited()){
                    Pair<Vertex, Edge> candidate = vertex.nextMinimum();
                    if (candidate.getValue().getWeight() < nextMinimum.getWeight()){
                        nextMinimum = candidate.getValue();
                        nextVertex = candidate.getKey();
                    }
                }
            }
            nextMinimum.setIncluded(true);
            nextVertex.setVisited(true);
        }
    }

    private boolean isDisconnected(){
        for (Vertex vertex : graph){
            if (!vertex.isVisited()){
                return true;
            }
        }
        return false;
    }

    public void resetPrintHistory(){
        for (Vertex vertex : graph){
            Iterator<Map.Entry<Vertex,Edge>> it = vertex.getEdges().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Vertex,Edge> pair = it.next();
                pair.getValue().setPrinted(false);
            }
        }
    }

    /*public String minimumSpanningTreeToString(){
        StringBuilder sb = new StringBuilder();
        for (Vertex vertex : graph){
            sb.append(vertex.includedToString());
        }
        return sb.toString();
    }*/
    
    public Map<String,Integer> minimumSpanningTreeToString(boolean isMapNeed){
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> values = new HashMap<String,Integer>();
        for (Vertex vertex : graph){
            values.putAll(vertex.includedToString(true));
        }
        return values;
    }
}
