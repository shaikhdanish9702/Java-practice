import java.util.*;

class graph {
    ArrayList<Integer> adj[];

    public graph(int numvertices) {
        adj = new ArrayList[numvertices];
        for (int i = 0; i < numvertices; i++) {
            adj[i] = new ArrayList<>();
        }

    }

    public void addedge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        graph myGraph = new graph(6);
        int edges = sc.nextInt();
        for (int i = 0; i < edges; i++) {
            myGraph.addedge(sc.nextInt(), sc.nextInt());
        }

    }
}
