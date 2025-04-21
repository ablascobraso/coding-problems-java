import commondatastructures.ListNode;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class MergeTwoSortedLists21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode curr = prehead;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = l1 != null ? l1 : l2;
        return prehead.next;
    }

    public static void main(String[] args) {
        ListNode node3_1 = new ListNode(4, null);
        ListNode node2_1 = new ListNode(2, node3_1);
        ListNode node1_1 = new ListNode(1, node2_1);

        ListNode node3_2 = new ListNode(4, null);
        ListNode node2_2 = new ListNode(3, node3_2);
        ListNode node1_2 = new ListNode(1, node2_2);
        ListNode head = MergeTwoSortedLists21.mergeTwoLists(node1_1, node1_2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}

