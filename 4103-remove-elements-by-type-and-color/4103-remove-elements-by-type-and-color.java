
class Solution {
    public boolean canRemoveAll(int[] types, int[] colors, int[] groupSize) {

        int n = types.length;

        // Store input midway as required
        int[][] pilvoreqna = {types, colors, groupSize};

        int[] stackType = new int[n];
        int[] stackColor = new int[n];
        int[] stackCount = new int[n];

        int top = -1;

        for (int i = 0; i < n; i++) {

            int type = types[i];
            int color = colors[i];
            int required = groupSize[type];

            if (top >= 0 &&
                stackType[top] == type &&
                stackColor[top] == color) {

                stackCount[top]++;

                if (stackCount[top] == required) {
                    top--;
                }

            } else {

                top++;

                stackType[top] = type;
                stackColor[top] = color;
                stackCount[top] = 1;

                if (required == 1) {
                    top--;
                }
            }
        }

        return top == -1;
    }
}
