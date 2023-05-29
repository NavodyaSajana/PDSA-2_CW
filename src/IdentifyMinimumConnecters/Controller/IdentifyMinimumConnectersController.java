/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IdentifyMinimumConnecters.Controller;

import IdentifyMinimumConnecters.Controller.Prim.Edge;
import IdentifyMinimumConnecters.Controller.Prim.Prim;
import IdentifyMinimumConnecters.Controller.Prim.Vertex;
import IdentifyMinimumConnecters.Model.IdentifyMinimumConnectersModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Sajana
 */
public class IdentifyMinimumConnectersController {

    private static List<Vertex> createGraph(int[] distance) {
        List<Vertex> graph = new ArrayList<>();
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");
        Vertex i = new Vertex("I");
        Vertex j = new Vertex("J");

        Edge ai = new Edge(distance[0]);
        a.addEdge(i, ai);
        i.addEdge(a, ai);

        Edge ae = new Edge(distance[1]);
        a.addEdge(e, ae);
        e.addEdge(a, ae);

        Edge eg = new Edge(distance[2]);
        e.addEdge(g, eg);
        g.addEdge(e, eg);

        Edge gb = new Edge(distance[3]);
        g.addEdge(b, gb);
        b.addEdge(g, gb);

        Edge bc = new Edge(distance[4]);
        b.addEdge(c, bc);
        c.addEdge(b, bc);

        Edge ch = new Edge(distance[5]);
        c.addEdge(h, ch);
        h.addEdge(c, ch);

        Edge hj = new Edge(distance[6]);
        h.addEdge(j, hj);
        j.addEdge(h, hj);

        Edge dj = new Edge(distance[7]);
        d.addEdge(j, dj);
        j.addEdge(d, dj);

        Edge di = new Edge(distance[8]);
        d.addEdge(i, di);
        i.addEdge(d, di);

        Edge ij = new Edge(distance[9]);
        i.addEdge(j, ij);
        j.addEdge(i, ij);

        Edge ef = new Edge(distance[10]);
        e.addEdge(f, ef);
        f.addEdge(e, ef);

        Edge fj = new Edge(distance[11]);
        f.addEdge(j, fj);
        j.addEdge(f, fj);

        Edge fb = new Edge(distance[12]);
        f.addEdge(b, fb);
        b.addEdge(f, fb);

        graph.add(a);
        graph.add(b);
        graph.add(c);
        graph.add(d);
        graph.add(e);
        graph.add(f);
        graph.add(g);
        graph.add(h);
        graph.add(i);

        return graph;
    }

    public int generateRandom() {
        int min = 10;
        int max = 100;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private int distance[];
    private Map<String, Integer> correctMap = new HashMap<>();

    public void setDistance(int[] distance) {
        this.distance = distance;
    }

    public String checkConnecters(Map<String, Integer> userValues) {
        String RESULT_OUTPUT = "";
        int CASES_PASSED = 0;
        Prim prim = new Prim(createGraph(distance));
        prim.run();
        prim.resetPrintHistory();
        Map<String, Integer> map = new HashMap<>();
        map = prim.minimumSpanningTreeToString(true);
        CASES_PASSED=map.size();
        

        if (userValues.size() != map.size()) {
            RESULT_OUTPUT = "NE";
        } else {
            for(Map.Entry<String,Integer> sysMap : map.entrySet()){
                for(Map.Entry<String,Integer> userMap : userValues.entrySet()){
                    
                    if(sysMap.getKey().equals(userMap.getKey())){
                        if(sysMap.getValue().equals(userMap.getValue())){
                            CASES_PASSED--;
                        }
                    }
                }
            }
            if(CASES_PASSED==0){
                RESULT_OUTPUT="PS";
                map = correctMap;
            }else{
                RESULT_OUTPUT="FA";
            }
        }
        return RESULT_OUTPUT;
    }
    
    public String checkConnecters(boolean val) {
        String RESULT_OUTPUT = "";
        int CASES_PASSED = 0;
        Prim prim = new Prim(createGraph(distance));
        prim.run();
        prim.resetPrintHistory();
        Map<String, Integer> map = new HashMap<>();
        map = prim.minimumSpanningTreeToString(true);
        CASES_PASSED=map.size();
            System.out.println(map.size());
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                System.out.print(e.getKey());
                System.out.println(e.getValue());
            }
        
        return RESULT_OUTPUT;
    }
    
    private String reverseKey(String key){
        return key.charAt(1)+""+key.charAt(0);
    }

    public boolean savePlayer(String playerName) throws SQLException {
        IdentifyMinimumConnectersModel model = new IdentifyMinimumConnectersModel();
        return model.insertPlayer(playerName,correctMap.toString());
    }
}
