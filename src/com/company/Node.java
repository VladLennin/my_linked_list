package com.company;


public class Node <E>{
    Node<E> next;
    Node<E> previous;
    E item;
    Node(Node<E> next,Node<E> preview, E item){
        this.item = item;
        this.next = next;
        this.previous = preview;
    }
    Node(){}
}
