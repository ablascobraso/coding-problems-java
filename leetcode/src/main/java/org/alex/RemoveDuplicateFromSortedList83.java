import commondatastructures.ListNode;

import java.util.List;

public class RemoveDuplicateFromSortedList83 {
    public static ListNode removeDuplicateFromSortedList83(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        while(head != null && head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode node5 = new ListNode();
        node5.val = 3;
        ListNode node4 = new ListNode();
        node4.val = 3;
        node4.next = node5;
        ListNode node3 = new ListNode();
        node3.val = 2;
        node3.next = node4;
        ListNode node2 = new ListNode();
        node2.val = 1;
        node2.next = node3;
        ListNode head = new ListNode();
        head.val = 1;
        head.next = node2;

        ListNode removed = removeDuplicateFromSortedList83(head);

        while (removed != null) {
            System.out.println(removed.val);
            removed = removed.next;
        }
    }
}
