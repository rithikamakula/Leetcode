class Solution {
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        Integer[] jumpsToEnd = new Integer[nums.length];
        jumpsToEnd[jumpsToEnd.length - 1] = 0;

        Deque<Integer> posStack = new ArrayDeque<Integer>();
        Set<Integer> visited = new HashSet<Integer>(nums.length);
        visited.add(0);
        posStack.push(0);

        while(posStack.size() > 0) {
            // System.out.println(posStack.toString());
            int currentPos = posStack.peek();
            int maxJump = nums[currentPos];

            boolean resolved = true;
            Integer minJumps = null;
            for(int i = currentPos + 1; i < nums.length && i <= currentPos + maxJump; i++) {
                if (jumpsToEnd[i] != null) {
                    if (minJumps == null || jumpsToEnd[i] < minJumps - 1) {
                        if (jumpsToEnd[i] < Integer.MAX_VALUE) {
                            minJumps = jumpsToEnd[i] + 1;
                        }
                    }
                } else {
                    resolved = false;
                    if (!visited.contains(i)) {
                        posStack.push(i);
                        visited.add(i);
                    }
                }
            }
            if (resolved) {
                posStack.pop();
                jumpsToEnd[currentPos] = (minJumps == null ? Integer.MAX_VALUE : minJumps);
            }
        }
        return jumpsToEnd[0];
    }
}