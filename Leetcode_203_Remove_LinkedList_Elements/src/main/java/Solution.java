
public class Solution {

    public ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val) { // 删除开始部分的结点
            head = head.next; // 跳过当前节点
        }

        if (head == null)
            return null;

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next; // 跳过prev的下一个节点
            } else {
                prev = prev.next;
            }
        }
        return head;
    }
}
