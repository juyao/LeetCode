public class Solution {
    //2
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode listNode=null;
        ListNode tempListNode=null;
        int sum=0;
        int p=0;
        boolean step=false;
        while (l1!=null||l2!=null){
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            sum+=p;
            if(sum>9){
                step=true;
                sum-=10;
            }
            if(listNode==null){
                listNode=new ListNode(sum);
                tempListNode=listNode;
            }else{
                tempListNode.next=new ListNode(sum);
                tempListNode=tempListNode.next;
            }

            if(step){
                p=1;
                tempListNode.next=new ListNode(1);
            }else{
                p=0;
            }
            sum=0;
            step=false;
        }
        return listNode;
    }
    //3
    public int lengthOfLongestSubstring(String s) {
        return 0;
    }
}
