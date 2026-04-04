# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        ## 沒有dummy節點，要是刪除對象是head node，將無法成功，因為left 永遠不可能站在 head 的前一個
        ## 這邊left和right要保持的距離，指的是有幾個節點的距離，而不是邊的距離!(left 距離終點還有 n 個節點)
        dummy = ListNode(0,head)
        left = dummy
        right = head

        while n > 0 :
            right = right.next
            n -= 1
        
        while right :
            left = left.next
            right = right.next
        
        left.next = left.next.next
        return dummy.next



        