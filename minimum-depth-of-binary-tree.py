# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def minDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        if root == None: return 0
        if root.left == None or root.right == None: return 1 + self.minDepth(root.left) + self.minDepth(root.right)
        return 1 + min(self.minDepth(root.left), self.minDepth(root.right))
