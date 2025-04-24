import commondatastructures.ListNode;

public class RemoveLinkedListElements203 {
    private static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node7 = new ListNode(6, null);
        ListNode node6 = new ListNode(5, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(6, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(6, node2);
        ListNode head = RemoveLinkedListElements203.removeElements(node1, 6);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    private static ListNode removeElementsIterative(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode next = RemoveLinkedListElements203.removeElementsIterative(head.next, val);
        if (head.val == val) {
            return next;
        }
        head.next = next;
        return head;
    }
}
