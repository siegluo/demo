package letcode;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * </>
 */
public class AddTwoNumbers {

    /**
     * 将当前结点初始化为返回列表的哑结点。
     * 将进位carry 初始化为0。
     * 将p 和q 分别初始化为列表l1 和l2 的头部。
     * 遍历列表l1 和l2 直至到达它们的尾端。
     * 将x 设为结点p 的值。如果p 已经到达l1 的末尾，则将其值设置为0。
     * 将y 设为结点q 的值。如果q 已经到达l2 的末尾，则将其值设置为0。
     * 设定sum=x+y+carry。
     * 更新进位的值，carry=sum/10。
     * 创建一个数值为(summod10) 的新结点，并将其设置为当前结点的下一个结点，然后将当前结点前进到下一个结点。
     * 同时，将p 和q 前进到下一个结点。
     * 检查carry=1 是否成立，如果成立，则向返回列表追加一个含有数字1 的新结点。
     * 返回哑结点的下一个结点。
     *
     * @param l1
     * @param l2
     * @return ListNode
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyNode;
        int carry = 0;
        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode listNode = addTwoNumbers(listNode1, listNode4);

        System.out.println(listNode.val + "  " + listNode.next.val + "  " + listNode.next.next.val);
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

}
