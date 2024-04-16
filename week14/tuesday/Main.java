import java.util.*;

public class Main {
    public static void main(String[] args) {
        GraphAdjMatrixUU gr = new GraphAdjMatrixUU();
        gr.addEdge(99, 5);

        GraphGenericAdjListUU2<String> cities = new GraphGenericAdjListUU2<>();
        cities.addNode("Wilmington");
        cities.addNode("Dover");
        cities.addNode("Claymont");
        cities.addEdge("Wilmington", "Dover");
        cities.addEdge("Dover", "Claymont");
    }
}
class GraphGenericAdjListUU2<T> {
    HashMap<T, LinkedList<T>> adjList = new HashMap<>();

    public void addNode(T node) {
        adjList.put(node, new LinkedList<T>());
    }

    public void addEdge(T src, T dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
    }

    public void printNeighbors(T src) {
        
    }

}
class GraphGenericAdjListUU<T> {
    // what if we want to be able to store
    // something other than integers...
    // ???? > integer
    private LinkedList<T>[] adjList = new LinkedList[100];
    private HashMap<T, Integer> genericToInteger = new HashMap<>();
    private int count=0;
    public void addNode(T node) {
        genericToInteger.put(node, count++);
    }

    public void addEdge(T src, T dest) {
        int srcIndex = genericToInteger.get(src);
        if (adjList[srcIndex] == null) {
            // if there isn't a linked list there...
            adjList[srcIndex] = new LinkedList<>();
        }
        adjList[srcIndex].add(dest);
    }


}

class GraphAdjListUU {
    // adjacency list
    // it's an array of linked lists
    private LinkedList<Integer>[] adjList = new LinkedList[100];
}

class GraphAdjMatrixUU {


    // undirected, unweighted...
    // adj matrix
    private int[][] adjMatrix = new int[100][100];
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1;
    }
}
