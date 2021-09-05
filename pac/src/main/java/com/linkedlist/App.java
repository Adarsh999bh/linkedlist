package com.linkedlist;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
	 * 
	 * This method is the main method Object object of LinkedList is created to
	 * insert integers
	 * 
	 */
    public static void main( String[] args )
    {
        System.out.println( "welcme to linked list program" );
        Linkedlist<Integer> object = new Linkedlist<>();
		object.insert(56);
		object.insert(30);
		object.insert(40);
		object.insert(70);
		object.show();
		if(object.search(40)) {
			object.deleteAt(object.key);
			object.show();
		}
		object.size();

    }
}
