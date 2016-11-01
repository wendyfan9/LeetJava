/**
 * Created by WendyFan on 10/31/16.
 */
public class HasCycle {
    public static void main(String[] args){
        System.out.print("test");
    }
    public static boolean hasCycle(ListNode head){
        if(head == null || head.next == null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) return true;
        }
        return false;
    }
}
