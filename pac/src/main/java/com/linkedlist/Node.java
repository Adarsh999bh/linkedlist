package com.linkedlist;

public class Node<T> {

	public T data;
	Node<T> next;

	public Node(T data) {
		super();
		this.data = data;
		this.next = null;
	}
}