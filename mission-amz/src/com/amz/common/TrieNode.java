package com.amz.common;

public class TrieNode {
    boolean isWord;
    TrieNode[] children;
    String word;
    public TrieNode(){
        this.children = new TrieNode[26];
        this.isWord = false;
        this.word = null;
    }
}