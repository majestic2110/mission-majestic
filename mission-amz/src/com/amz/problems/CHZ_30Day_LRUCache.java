package com.amz.problems;

import com.amz.common.AbstractQuestion;
import org.junit.Test;

import java.util.HashMap;

public class CHZ_30Day_LRUCache extends AbstractQuestion {
    class LRUCache {

        private HashMap<Integer, Node> cache;
        private Node head;
        private Node tail;
        private int capacity = 0;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.cache = new HashMap<Integer, Node>();
        }

        public int get(int key) {
            Node tempNode = this.cache.get(key);
            if (tempNode == null) {
                return -1;
            }
            removeNode(tempNode);
            offerNode(tempNode);
            return tempNode.value;
        }

        public void put(int key, int value) {
            if (this.cache.containsKey(key)) {
                Node t = this.cache.get(key);
                t.value = value;
                removeNode(t);
                offerNode(t);
            } else {
                if (this.cache.size() >= this.capacity) {
                    this.cache.remove(head.key);
                    removeNode(head);
                }
                Node node = new Node(key, value);
                offerNode(node);
                this.cache.put(key, node);
            }
        }

        private void offerNode(Node node) {
            if (this.tail != null) {
                this.tail.next = node;
            }
            node.previous = this.tail;
            node.next = null;
            this.tail = node;
            if (this.head == null) {
                this.head = this.tail;
            }
        }

        private void removeNode(Node node) {
            if (node.previous != null) {
                node.previous.next = node.next;
            } else {
                this.head = node.next;
            }
            if (node.next != null) {
                node.next.previous = node.previous;
            } else {
                this.tail = node.previous;
            }
        }

        class Node {
            int key;
            int value;
            Node previous;
            Node next;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
                this.previous = null;
                this.next = null;
            }
        }

    }

    @Override
    @Test
    public void evaluate() {
        // to be done
    }
}
