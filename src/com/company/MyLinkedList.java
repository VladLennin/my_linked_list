package com.company;

import java.lang.annotation.Target;

public class MyLinkedList<E> {
    Node<E> tail;
    Node<E> head;
    private int count;

    public void add(E item) {
        Node<E> newElement;

        if (tail == null) {
            newElement = new Node<>(null, null, item);
            head = newElement;
            tail = newElement;
        } else {
            newElement = new Node<>(null, tail, item);
            tail.next = newElement;
            newElement.previous = tail;
            tail = newElement;
        }
        count++;
    }

    public void remove(E object) {
        for (Node<E> x = head; x != null; x = x.next) {
            if (x.item.equals(object)) {
                if (x.previous == null) {
                    x.next.previous = null;
                    this.head = x.next;
                } else {
                    x.previous.next = x.next;
                }
                break;
            }
        }
        count--;
    }

    public int indexOf(E object) {
        int index = 0;
        for (Node<E> x = tail; x != null; x = x.next) {
            if (x.item.equals(object)) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    public void printAll() {
        for (Node<E> x = head; x != null; x = x.next) {
            System.out.println(x.item.toString());
        }
    }

    public void setHead(E object) {
        Node<E> newHead;
        if (tail != null) {
            newHead = new Node<>(head, null, object);
            head.previous = newHead;
            head = newHead;
        } else {
            newHead = new Node<>(null, null, object);
            head = newHead;
            tail = newHead;
        }
        count++;
    }

    public void setTail(E object) {
        Node<E> newTail;
        if (tail != null) {
            newTail = new Node<>(null, tail, object);
            tail.next = newTail;
            tail = newTail;
        } else {
            newTail = new Node<>(null, null, object);
            tail = newTail;
            head = newTail;
        }
        count++;


    }

    public void removeHead() {
        if (head != tail) {
            head.next.previous = null;
            head = head.next;
        } else {
            head = null;
            tail = null;
        }
        count--;

    }

    public void removeTail() {
        if (head != tail) {
            tail.previous.next = null;
            tail = tail.previous;
        } else {
            head = null;
            tail = null;
        }
        count--;
    }


}
