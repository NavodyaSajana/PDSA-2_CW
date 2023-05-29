/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IdentifyMinimumConnecters.Controller;

import IdentifyMinimumConnecters.Controller.Prim.Edge;
import IdentifyMinimumConnecters.Controller.Prim.Prim;
import IdentifyMinimumConnecters.Controller.Prim.Vertex;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Sajana
 */
public class IdentifyMinimumConnectersController {

    public static List<Vertex> createGraph() {
        List<Vertex> graph = new ArrayList<>();
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Edge ab = new Edge(2);
        a.addEdge(b, ab);
        b.addEdge(a, ab);
        Edge ac = new Edge(3);
        a.addEdge(c, ac);
        c.addEdge(a, ac);
        Edge bc = new Edge(2);
        b.addEdge(c, bc);
        c.addEdge(b, bc);
        Edge be = new Edge(5);
        b.addEdge(e, be);
        e.addEdge(b, be);
        Edge cd = new Edge(1);
        c.addEdge(d, cd);
        d.addEdge(c, cd);
        Edge ce = new Edge(1);
        c.addEdge(e, ce);
        e.addEdge(c, ce);
        graph.add(a);
        graph.add(b);
        graph.add(c);
        graph.add(d);
        graph.add(e);

        return graph;
    }

    public IdentifyMinimumConnectersController() {
        Prim prim = new Prim(createGraph());

        prim.run();
        prim.resetPrintHistory();
        //System.out.println(prim.minimumSpanningTreeToString());
        //System.out.println(prim.minimumSpanningTreeToString(true));
        Map<String, Integer> map = new HashMap<>();
        map = prim.minimumSpanningTreeToString(true);
        
        for (Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
