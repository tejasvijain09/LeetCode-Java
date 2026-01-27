class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean up = false;
        boolean down = false;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) return false;

            if (arr[i] > arr[i - 1]) {
                if (down) return false; // can't go up after down
                up = true;
            } else {
                if (!up) return false; // can't go down before up
                down = true;
            }
        }
        return up && down;
    }
}