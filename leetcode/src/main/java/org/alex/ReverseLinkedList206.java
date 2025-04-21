import commondatastructures.ListNode;

import java.util.Stack;

public class ReverseLinkedList206 {
    private static final ListNode listNode = new ListNode();

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);
        ListNode result = ReverseLinkedList206.reverseRecursively(listNode1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode reverseIteratively(ListNode head) {
        if (head == null) return head;
        Stack<ListNode> listNodes = new Stack<>();
        while (head.next != null) {
            listNodes.push(head);
            head = head.next;
        }
        ListNode dummy = head;
        while (!listNodes.isEmpty()) {
            head.next = listNodes.pop();
            head = head.next;
        }
        head.next = null;
        return dummy;
    }


    private static ListNode reverseRecursively(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseRecursively(head.next); // Reverse rest of the list
        head.next.next = head; // Make the next node point to current node
        head.next = null; // Cut the current node's link to the next node
        return newHead; // Return the new head of the reversed list
    }
}

