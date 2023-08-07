package com.learning.datastructures;

class list
{
	private Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	void insertEnd(int data)
	{
		Node newnode = new Node(data);
		if (head == null)
		{
			head = newnode;
		}
		else
		{
			Node current = head;
			while(current.next != null)
			{
				current = current.next;
			}
			current.next = newnode;
		}
	}
	
	void insertStart(int data)
	{
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
	}
	
	void insertMiddle(int data, int position)
	{
		Node current;
		Node newnode = new Node(data);
		
		if(position <= 0)
		{
			System.out.println("Invalid position");
			return;
		}
		if(position == 1)
		{
			newnode.next = head;
			head = newnode;
			return;
		}
		
		current = head;
		int count = 1;
		
		while(current != null && count < position-1)
		{
			current = current.next;
			count++;
		}
		
		if(current == null)
		{
			System.out.println("Invaaaaaaalid position");
			return;
		}
		
		newnode.next = current.next;
		current.next = newnode;
	}
	
	void deleteStart()
	{
		Node current = head;
		current = head.next;
		head = current;
	}
	
	void deleteEnd()
	{
		Node prev = head;
		Node current = prev.next;
		while(current.next != null)
		{
			prev = current;
			current = prev.next;
		}
		prev.next = null;
	}
	
	void display()
	{
		Node current = head;
		while(current != null)
		{
			System.out.print("|"+current.data+"|" +" ---> ");
			current = current.next;
		}
		System.out.println("|null|");
	}
}
public class linkedList 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		list lst = new list();
		lst.insertEnd(10);
		lst.insertEnd(20);
		lst.insertEnd(30);
		lst.insertEnd(40);
		lst.insertEnd(50);
		lst.insertStart(0);
		lst.insertStart(5);
		lst.insertMiddle(100000, 2);
		lst.display();
		lst.deleteStart();
		lst.deleteEnd();
		lst.deleteEnd();
		lst.display();

	}

}
