package _5_LinkedList;

public class _206_Reverse_Linked_List {
    public static ListNode reverseList(ListNode head) {
        ListNode curNode = head;
        ListNode result = null;
        while (curNode != null) {
            result = new ListNode(curNode.val, result);
            curNode = curNode.next;
        }
        return result;
    }

    public static void printLinkedList(ListNode head) {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val);
                temp = temp.next;
                if (temp != null) {
                    System.out.print(" -> ");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(3, null);
        ListNode b = new ListNode(2, a);
        ListNode c = new ListNode(1, b);
        printLinkedList(c);
        c = reverseList(c);
        printLinkedList(c);
    }
}
