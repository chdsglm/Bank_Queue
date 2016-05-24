
package vya_odev_2;

public class Queue {
    private class Node {
        public Client client;
        public Node next;
        public Node(Client client, Node next) {
            this.client = client;
            this.next = next;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void enqueue(Client client) {
        Node newNode = new Node(client, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public Client dequeue() {
        Client client = head.client;
        if (tail == head) {
            tail = null;
        }
        head = head.next;
        return client;
    }

    public Client peek() {
        return head.client;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        for (Node node = head; node != null; node = node.next) {
            count++;
        }
        return count;
    }
    
    public void listClients() {
        int count = 0;
        for (Node node = head; node != null; node = node.next) {
            count++;
            System.out.println(count + ". sirada: " + node.client.getName() + ". ID = " + node.client.getID());
        }
    }
}
