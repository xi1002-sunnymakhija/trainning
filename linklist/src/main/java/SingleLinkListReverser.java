public class SingleLinkListReverser {

    public static void main(String[] a)
    {
       // ListNode head= createLinkList();
//        ListNode headPtr= reverseLinkList(head);
//        while(headPtr != null)
//        {
//            System.out.println(headPtr.val);
//            headPtr = headPtr.next;
//        }

       // findMidNode(head);
    }

    private static void findMidNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next.next;

        }

        System.out.println(slow.val);

    }

//    private static ListNode createLinkList() {
//
//        ListNode head= null;
//        head = new ListNode(0, null);
//        ListNode headPtr= head;
//        for(int i=1;i<10; i++)
//        {
//            ListNode nextNode= new ListNode(i, null);
//            head.next = nextNode;
//            head = nextNode;
//
//        }
//        return headPtr;
//
//    }
//
//
//    private static ListNode reverseLinkList(ListNode head) {
//        ListNode dummy= null;
//        while(head != null)
//        {
//            ListNode nextNode = head.next;
//            head.next= dummy;
//            dummy = head;
//            head= nextNode;
//
//        }
//        return dummy;
//
//    }


}
