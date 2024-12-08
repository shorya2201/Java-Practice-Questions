public class SearchInSortedMatrix {

    public static boolean staircaseSearch(int[][] matrix, int key) {
        int row = 0, col = matrix[0].length - 1;

//STAIRCASE SEARCH IS ONLY POSSIBLE IN SORTED 2D ARRAYS
//O(n+m)

        /*
         * Staircase search means searching in a manner it look likes staircase
         * In this we take either of two base conditions
         * 1. row = 0 & col = matrix.length-1
         * If the key is smaller than cell we traverse left & if key is greater than
         * cell we traverse down
         * 
         * 2. row = matrix.length-1 & col = 0
         * If the key is smaller than cell we traverse top & if key is greater than cell
         * we traverse right
         */
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at Row : " + row + " Column : " + col);
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found!!!!");
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        staircaseSearch(arr, 33);
    }
}
