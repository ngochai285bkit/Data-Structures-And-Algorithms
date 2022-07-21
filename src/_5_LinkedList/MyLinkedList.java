package _5_LinkedList;

public class MyLinkedList {
    public static void printLinkedList(Node head){
        if(head == null){
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.value);
                temp = temp.next;
                if(temp!=null){
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }
    
    public static Node addToHead(Node headNode, int value){
        Node newNode = new Node(value);
        if(headNode!=null){
            newNode.next = headNode;
        }
        return newNode;
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        printLinkedList(n1);
        n1 = addToHead(n2, 4);
        printLinkedList(n1);
    }
}
