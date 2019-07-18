package app;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class App {
    public static void main(String[] args) {
        App app = new App();
        ListNode l1 = new ListNode(2);
        l1.setNextReturnNext(new ListNode(4)).setNext(new ListNode(3));
        ListNode l2 = new ListNode(5);
        l2.setNextReturnNext(new ListNode(6)).setNext(new ListNode(4));

        System.out.println(l1.toString());
        System.out.println(l2.toString());
        ListNode result = app.addTwoNumbers(l1, l2);

        System.out.println(result.toString());
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            throw new IllegalArgumentException();
        }
        int digit = 0;

        ListNode temp = null;
        ListNode result = null;
        while (true) {
            temp = new ListNode(0);

            int a = 0, b = 0;
            if (l1 != null) {
                a = l1.val;
            }

            if (l2 != null) {
                b = l2.val;
            }

            temp.val = (a + b + digit) % 10;
            if ((a + b) >= 10) {
                digit = 1;
            } else {
                digit = 0;
            }

            if (l1 == null && l2 == null) {
                break;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if (result == null) {
                result = temp;
            } else {
                ListNode next = new ListNode(0);
                next.val = temp.val;
                while (true) {
                    result = result.next;
                    if (result == null) {
                        result.val = next.val;
                    }
                }
            }
        }
        return result;
    }
}