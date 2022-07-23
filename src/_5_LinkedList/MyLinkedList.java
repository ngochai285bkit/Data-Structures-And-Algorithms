package _5_LinkedList;

public class MyLinkedList {
    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode != null) {
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addToTail(Node headNode, int value) {
        Node newNode = new Node(value);
        if (headNode == null) {
            return newNode;
        } else {
            Node lastNode = headNode;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index) {
        Node newNode = new Node(value);
        if (index == 0) {
            return addToHead(headNode, value);
        } else {
            Node preNode = headNode;
            int count = 0;
            while (preNode != null) {
                count++;
                if (count == index) {
                    break;
                }
                preNode = preNode.next;
            }
            if (preNode == null) {
                return addToTail(headNode, value);
            }
            Node afterNode = preNode.next;
            preNode.next = newNode;
            newNode.next = afterNode;
            return headNode;
        }
    }

    public static Node removeAtHead(Node headNode) {
        if (headNode != null) {
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeAtTail(Node headNode) {
        Node preNode = null;
        Node lastNode = headNode;
        while (lastNode.next != null) {
            preNode = lastNode;
            lastNode = lastNode.next;
        }
        if (preNode == null) {
            return null;
        } else {
            preNode.next = null;
        }
        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index) {
        if (headNode == null || index < 0) {
            return null;
        }
        if (index == 0) {
            removeAtHead(headNode);
        } else {
            Node preNode = null;
            Node curNode = headNode;
            int count = 0;
            while (curNode.next != null) {
                preNode = curNode;
                curNode = curNode.next;
                count++;
                if (count == index) {
                    break;
                }
                
            }
            if (preNode == null) {
                return null;
            } else {
                preNode.next = curNode.next;
            }
        }
        return headNode;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;

        System.out.print("The original single linked list:   ");
        printLinkedList(n1);

        System.out.print("After add value 4 to the head:     ");
        n1 = addToHead(n1, 4);
        printLinkedList(n1);

        System.out.print("After add value 5 to the tail:     ");
        n1 = addToTail(n1, 5);
        printLinkedList(n1);

        System.out.print("After add value 6 to the index 3:  ");
        n1 = addToIndex(n1, 6, 3);
        printLinkedList(n1);

        System.out.print("After remove node at head:         ");
        n1 = removeAtHead(n1);
        printLinkedList(n1);

        System.out.print("After remove node at tail:         ");
        n1 = removeAtTail(n1);
        printLinkedList(n1);
        
        System.out.print("After remove node at index 2:      ");
        n1 = removeAtIndex(n1, 2);
        printLinkedList(n1);
    }
}