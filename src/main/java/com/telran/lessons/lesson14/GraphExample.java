package com.telran.lessons.lesson14;

import java.util.ArrayList;
import java.util.List;

public class GraphExample {

    public static void main(String[] args) {
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1));
        edges.add(new Edge(1, 2));
        edges.add(new Edge(2, 0));
        edges.add(new Edge(2, 1));
        edges.add(new Edge(3, 1));
        edges.add(new Edge(3, 2));
        edges.add(new Edge(4, 5));
        edges.add(new Edge(5, 4));

        Graph graph = new Graph(edges);
        graph.print();
    }
}
