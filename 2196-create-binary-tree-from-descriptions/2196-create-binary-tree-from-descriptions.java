class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {

        TreeNode[] nodes = new TreeNode[100001];
        boolean[] isChild = new boolean[100001];

        for (int[] d : descriptions) {

            int parent = d[0];
            int child = d[1];
            int isLeft = d[2];

            if (nodes[parent] == null) {
                nodes[parent] = new TreeNode(parent);
            }

            if (nodes[child] == null) {
                nodes[child] = new TreeNode(child);
            }

            if (isLeft == 1) {
                nodes[parent].left = nodes[child];
            } else {
                nodes[parent].right = nodes[child];
            }

            isChild[child] = true;
        }

        for (int[] d : descriptions) {
            int parent = d[0];

            if (!isChild[parent]) {
                return nodes[parent];
            }
        }

        return null;
    }
}