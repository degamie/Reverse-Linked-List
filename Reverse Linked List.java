class Solution {
    public ListNode reverseList(ListNode head) {
        //T(C(N)==O(1)) and S(C(N)=O(N)) as it requires Non dynamic Memory allocation in constant time
        ListNode curr=head,prev=null,temp;//ListNode head and Prev Declare and Initialize prev pointer
        while(curr!=null){//Traversing throwugh each LL Node
            temp=curr.next;curr.next=prev; prev=curr;curr=temp;}//Swapping the Temp and Prev Node
        return prev;//printing the reversed LL
    }}
