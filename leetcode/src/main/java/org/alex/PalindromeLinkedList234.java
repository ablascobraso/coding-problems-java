package org.alex;

import commondatastructures.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PalindromeLinkedList234 {
    public static void main(String[] args) {
        ListNode node4 = new ListNode(1);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        System.out.println(isPalindrome(node1));
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> nodes = new ArrayList<>();
        while(head != null){
            nodes.add(head.val);
            head = head.next;
        }

        int first = 0;
        int last = nodes.size()-1;
        while(first < last){
            if(!Objects.equals(nodes.get(first), nodes.get(last))){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
