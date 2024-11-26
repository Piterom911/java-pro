package com.telran.lessons.lesson8.custom;

public class CustomListApp {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.addFirst(7);
        list.addFirst(25);
        list.addFirst(4);
        list.addFirst(1);
        list.addFirst(10);
        list.addFirst(5);
        list.addLast(43);
        list.print();

//        Node three = new Node(1, null);  // NOTE: CREATE LINKED LIST WITHOUT  CLASS
//        Node two = new Node(10, three);
//        Node one = new Node(5, two);
//
//        Node current = one;
//        while (current != null) {
//            System.out.print(current.getData() + " -> ");
//            current = current.getNext();
//        }
    }
}
