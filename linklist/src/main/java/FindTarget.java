public class FindTarget {
    public static void main(String[] a1)
    {
        ListNode head= createLinkList();
        ListNode a=addNode("A", head, head);
        ListNode b=addNode("B", a, head);
        ListNode c1=addNode("C", b, head);
        ListNode c2=addNode("C", c1, head);
        ListNode d = addNode("D", c2, head);
        printList(head);
        System.out.println(findTarget(d, "C"));
    }

    private static int findTarget(ListNode head, String c) {
        int rightCounter =0;
        int leftCounter = 0;
        ListNode rightPtr= head;
        ListNode leftPtr= head;
        while(!leftPtr.val.equalsIgnoreCase(c))
        {
            leftCounter= leftCounter+1;
            leftPtr= leftPtr.previous;
        }

        while(!rightPtr.val.equalsIgnoreCase(c))
        {
            rightCounter= rightCounter+1;
            rightPtr= rightPtr.next;
        }
        System.out.println("Left counter {}"+ leftCounter);
        System.out.println("Right counter {}"+ rightCounter);

        if(rightCounter > leftCounter)
            return leftCounter;
        else
            return rightCounter;

    }

    private static ListNode printList(ListNode head) {
        ListNode temp = head;
        while(!(temp.val.equalsIgnoreCase("D")))
        {
            System.out.println(" "+ temp.val);
            temp = temp.next;
        }
        System.out.println(" "+ temp.val);
        return temp;
    }

    private static ListNode addNode(String c, ListNode lastNode, ListNode headNode) {
        ListNode newNode = new ListNode(c,null,null);
        newNode.previous = lastNode;
        lastNode.next = newNode;
        newNode.next = headNode;
        headNode.previous = newNode;
        return newNode;
    }

    private static ListNode createLinkList() {

        ListNode head= head = new ListNode("A", null, null);
        return head;

    }
}
