public class Test {

    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        head.next = node1;
        Node node2 = new Node(6);
        node1.next = node2;
        Node node3 = new Node(4);
        node2.next = node3;
        Node node4 = new Node(6);
        node3.next = node4;

        Node newHead = delete(head, 6);
        print(newHead);

    }

    private static void print(Node node) {
        while (node != null) {
            System.out.print(node.val + "->");
        }
        System.out.println("null");
    }

    private static Node delete(Node head, int val) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node cur = dummy.next;
        while (cur != null) {
            if (cur.val == val) {
                head.next = cur.next;
            }
            head = cur;
            cur = cur.next;
        }
        return dummy.next;
    }
}
