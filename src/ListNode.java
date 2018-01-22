public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    @Override
    public String toString() {
        String re=val+"";
        ListNode listNode=this;
         while (listNode.next!=null){
             re+="->"+listNode.next.val;
             listNode=listNode.next;
         }
        return re;
    }
}
