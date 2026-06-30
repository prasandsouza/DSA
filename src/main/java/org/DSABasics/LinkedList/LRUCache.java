package org.DSABasics.LinkedList;

class LRUCache {
    class Node {
        int key, value;
        Node prev, next;
        Node(int k, int v) { this.key = k; this.value = v; }
    }

    // You would use a HashMap to find the Node in O(1) time,
    // and then use the Doubly LinkedList to update its position in O(1) time.
    private void moveToHead(Node node) {
        removeNode(node);
        addNodeToHead(node);
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addNodeToHead(Node node) {
        // Logic to attach node right after a dummy head pointer
    }
}