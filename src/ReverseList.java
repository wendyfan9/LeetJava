/**
 * Created by WendyFan on 10/31/16.
 */
public class ReverseList {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        ListNode dummy = new ListNode(0);
        for(int i : arr){
            dummy.next = new ListNode(i);
        }
        ListNode head = reverseList(dummy.next);
        while(head != null){
            System.out.print(head.val);
            head = head.next;
        }
        return;
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode current = head;
        ListNode next = current.next;
        while(next != null){
            current.next = pre;
            pre = current;
            current = next;
            next = current.next;
        }
        current.next = pre;
        return current;
    }
}
