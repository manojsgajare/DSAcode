package DSAExamples.src.PracticeCode;

// Represent the node of list

// Declaring head and tail pointer as null

// Function to add the new node at the end of the list

// Create Node

// Check if the Node is empty or not

// If node is empty both head and tail will point the new node

// else Tail will point to new node

// New node become new tail

// Since it is circular DSAExamples.linkedList tail will point next head

// Display all the nodes in the list

// Print each node by incrementing the pointer

// Add data to the list

// Display all nodes present in the list


public class circularLkLs {
    public class Node { //Represent the node of list
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    // Declaring head and tail pointer as null
    public Node head = null;
    public Node tail = null;

    // Create a function that will add node to the end of the list
    public void add(int data){
        // Create a new node
        Node newNode = new Node(data);

        // Checks if the list is empty
        if(head == null){

            // If node is empty both head and tail will point the new node
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else{
            // Tail will point the new node
            tail.next = newNode;

            //New node will become new tail
            tail = newNode;

            //Since, it is a circular linked list tail will point to head
            tail.next = head;
        }
    }
    // Display all the nodes in the list
    public void display(){
        Node current = head;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            System.out.println("Nodes of the circular list: ");

            do{
                // Prints each node by incrementing the order
                System.out.println(" " + current.data);
                current = current.next;
            }while(current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        circularLkLs cl = new circularLkLs();

        // Adds data to the list
        cl.add(1);
        cl.add(2);
        cl.add(3);
        cl.add(4);
        cl.add(5);

        // Display all the nodes present in the list
        cl.display();
    }
}