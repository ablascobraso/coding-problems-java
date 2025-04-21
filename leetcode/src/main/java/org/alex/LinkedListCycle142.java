import commondatastructures.ListNode;

import java.util.HashSet;

public class LinkedListCycle142 {

    public static ListNode detectCycle(ListNode head) {
        HashSet<ListNode> seen = new HashSet<>();

        while (head != null) {
            if (seen.contains(head)) {
                return head;
            } else {
                seen.add(head);
            }
            head = head.next;
        }
        return null;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        node2.next = node1;
        System.out.println(detectCycle(node1));
    }
}

