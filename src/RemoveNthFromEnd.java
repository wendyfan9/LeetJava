import java.util.List;

/**
 * Created by WendyFan on 10/31/16.
 */
class ListNode{
    int val;
    ListNode next;
    ListNode (int x) { val = x ;}
}
public class RemoveNthFromEnd {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int i : arr){
            current.next = new ListNode(i);
        }
        current = removeNthFromEnd(dummy.next, 2);
        while(current != null){
            System.out.println(current.val);
            current = current.next;
        }
        return;
    }
    //Single Pass
    public static ListNode removeNthFromEnd(ListNode head, int n){
        if(n <= 0) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preDelete = dummy;
        for(int i = 0; i < n; i++){
            if(head == null) return null;
            head = head.next;
        }
        while(head != null){
            preDelete = preDelete.next;
            head = head.next;
        }
        preDelete.next = preDelete.next.next;
        return dummy.next;
    }
//Naive soluciont(Two Pass)
//    public static ListNode removeNthFromEnd(ListNode head, int n){
//        if(head == null || n <= 0) return head;
//        int length = getListLength(head);
//        n = n % length;
//        if(n <= 0) return head.next;
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//        ListNode current = dummy;
//        for(int i = 0; i < length - n; i++){
//            current = current.next;
//        }
//        ListNode next = current.next.next;
//        current.next = next;
//        return dummy.next;
//    }
//
//    public static int getListLength(ListNode head){
//        ListNode fast = head;
//        ListNode slow = head;
//        int count = 1;
//        while(fast.next != null && fast.next.next != null){
//            fast = fast.next.next;
//            slow = slow.next;
//            count++;
//        }
//        if(fast.next == null){
//            return count * 2 - 1;
//        }else{
//            return count * 2;
//        }
//    }
}
