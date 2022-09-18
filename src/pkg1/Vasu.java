package pkg1;

//Searching in 2d array
public class Vasu {
    public void _500094156() {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 5;
        boolean ans = search(arr, target);
        System.out.println("Answer - " + ans);
    }

    static boolean search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}