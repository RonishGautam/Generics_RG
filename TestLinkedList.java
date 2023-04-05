public class TestLinkedList {

    public static void main(String[] args) {
        
        // Create a LinkedList that holds Node objects
        LinkedList myList = new LinkedList();
        
        Node aNode = new Node();
        aNode.setData("Element 1");
        myList.addNode(aNode);
        aNode = new Node();
        aNode.setData("Element 2");
        myList.addNode(aNode);
        
        Node tempnode = myList.getList();
        do {
            System.out.println(tempnode.getData());
            tempnode = tempnode.getNextNode();
        } while (tempnode != null);
        
    	GenericLinkedList<Integer> intList = new GenericLinkedList<Integer>();
		intList.addNode(new GenericNode<Integer>(100));
		intList.addNode(new GenericNode<Integer>(200));
		
		// GenericLinkedList that can hold Double objects
		GenericLinkedList<Double> doubleList = new GenericLinkedList<Double>();
		doubleList.addNode(new GenericNode<Double>(2.222));
		doubleList.addNode(new GenericNode<Double>(5.32));
		
		// GenericLinkedList that can hold String objects
		GenericLinkedList<String> stringList = new GenericLinkedList<String>();
		stringList.addNode(new GenericNode<String>("Ronish"));
		stringList.addNode(new GenericNode<String>("Gautam"));
		
		// elements in each list
		GenericNode<Integer> intNode = intList.getList();
		while (intNode != null) {
			System.out.println(intNode.getData());
			intNode = intNode.getNextNode();
		}
		
		GenericNode<Double> doubleNode = doubleList.getList();
		while (doubleNode != null) {
			System.out.println(doubleNode.getData());
			doubleNode = doubleNode.getNextNode();
		}
		
		GenericNode<String> stringNode = stringList.getList();
		while (stringNode != null) {
			System.out.println(stringNode.getData());
			stringNode = stringNode.getNextNode();
		}   
    }// end main

}//End TestLinkedList