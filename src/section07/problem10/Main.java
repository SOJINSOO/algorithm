package section07.problem10;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    Node root;
    public static class Node {
        int data;
        Node lt;
        Node rt;

        public Node(int data) {
            this.data = data;
        }
    }

    public int BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                if (current.lt == null && current.rt == null) {
                    return level;
                }
                queue.offer(current.lt);
                queue.offer(current.rt);
            }
            level++;
        }

        return level;
    }

    public static void main(String args[]) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);

        System.out.print(tree.BFS(tree.root));
    }

}
