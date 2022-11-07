package ru.milovtim.springsample;

import java.util.List;

import lombok.Data;

@Data
public class Graph {
    private List<Node> nodes;
    private List<Link> links;

    @Data
    public static class Node {
        private String id;
        private String name;
    }

    @Data
    public static class Link {
        private String source;
        private String target;
    }
}

