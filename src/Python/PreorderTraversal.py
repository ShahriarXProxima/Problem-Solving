class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def preorderTraversal(self, root: TreeNode | None) -> list[int]:
        result = []

        def preorder(node):
            if node == None:
                return

            result.append(node.val)
            preorder(node.left)
            preorder(node.right)

        preorder(root)
        return result
