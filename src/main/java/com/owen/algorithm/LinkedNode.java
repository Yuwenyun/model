package com.owen.algorithm;

public class LinkedNode<K, V> {

    private K key;
    private V value;
    private LinkedNode<K, V> preNode;
    private LinkedNode<K, V> nextNode;

    public LinkedNode(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public LinkedNode<K, V> getPreNode() {
        return preNode;
    }

    public void setPreNode(LinkedNode<K, V> preNode) {
        this.preNode = preNode;
    }

    public LinkedNode<K, V> getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkedNode<K, V> nextNode) {
        this.nextNode = nextNode;
    }
}
