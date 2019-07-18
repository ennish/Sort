package app;

/**
 * ListNode
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }

    public void setNext(ListNode node) {
        this.next = node;
    }

    public ListNode setNextReturnThis(ListNode node) {
        this.next = node;
        return this;
    }

    public ListNode setNextReturnNext(ListNode node) {
        this.next = node;
        return this.next;
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder(this.val + "");

        ListNode nextTemp = this.next;
        while (nextTemp != null) {
            sBuilder.append(" > ").append(nextTemp.val);
            nextTemp = nextTemp.next;
        }
        return sBuilder.toString();
    }
}
