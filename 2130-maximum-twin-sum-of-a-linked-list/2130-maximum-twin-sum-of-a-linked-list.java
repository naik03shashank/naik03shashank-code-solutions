class Solution {
    public int pairSum(ListNode head) {

        ArrayList<Integer> arr = new ArrayList<>();

        while (head != null) {
            arr.add(head.val);
            head = head.next;
        }

        int max = 0;
        int i = 0;
        int j = arr.size() - 1;

        while (i < j) {
            max = Math.max(max, arr.get(i) + arr.get(j));
            i++;
            j--;
        }

        return max;
    }
}