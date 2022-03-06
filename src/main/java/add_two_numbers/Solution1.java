package add_two_numbers;

public class Solution1 {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        new Solution1().addTwoNumbers(listNode1, listNode2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(0);
        new Solution1().addTwoNumbers(listNode3, listNode4);
        ListNode listNode5 = new ListNode(9, new ListNode(9, new ListNode(9)));
        ListNode listNode6 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode()))));
        new Solution1().addTwoNumbers(listNode5, listNode6);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new Solution1().addNum(l1, l2, new ListNode());
        return listNode;
    }

    /**
     * 这个计算过程最小逻辑模块就是两个同位的数值相加再加上进位的值
     * @param l1
     * @param l2
     * @param listNode
     * @return
     */
    public ListNode addNum(ListNode l1, ListNode l2, ListNode listNode){
        if(l1 == null && l2 == null && listNode == null){
            return null;
        }
        int value = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + (listNode == null ? 0 :listNode.val);

        listNode = addNum(l1 == null || l1.next == null ? null : l1.next,
                l2 == null || l2.next == null ? null : l2.next,
                value >= 10 ? new ListNode(1):null);

        return new ListNode(value % 10, listNode);


    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

}
