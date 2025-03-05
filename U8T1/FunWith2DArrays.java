public class FunWith2DArrays {
    public static int totalElements(int[][] array){
        int len = 0;
        for (int[] i : array) {
            len += i.length;
        }
        return len;
    }

    public static void fourCorners(String[][] strings){
        int y = 0;
        int x = strings[0].length - 1;
        for (String[] stringL : strings) {
            y++;
        }
        y--;
        System.out.println(strings[0][0]);
        System.out.println(strings[0][x]);
        System.out.println(strings[y][0]);
        System.out.println(strings[y][x]);
    }

    public static void swapFrontAndBackRows(String[][] strings){
        String[] temp = strings[0];
        strings[0] = strings[strings.length-1];
        strings[strings.length-1] = temp;
    }
    
        // Static method to calculate the average of all elements in the 2D array

    public static double average(int[][] array) {
        double totalSum = 0;
        double totalCount = 0;
    
        // Loop through the 2D array to sum up all elements and count the total elements
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                totalSum += array[i][j];  // Add the element to the total sum
                totalCount++;              // Increment the total element count                }
            }
        }
        // Calculate and return the average as a double
        return totalSum / totalCount;
    }

    public static int edgeSum(int[][] array) {
        int sum = 0;

        // Add the elements of the first and last row
        for (int j = 0; j < array[0].length; j++) {
            sum += array[0][j];          // First row
            sum += array[array.length - 1][j]; // Last row
        }

        // Add the elements of the first and last column, excluding the already counted corners
        for (int i = 1; i < array.length - 1; i++) {
            sum += array[i][0];          // First column (excluding corners)
            sum += array[i][array[i].length - 1]; // Last column (excluding corners)
        }

        return sum;
    }

    public static int[] indexFound(String[][] array, String target) {
        // Iterate over the columns first (column-major order)
        for (int j = 0; j < array[0].length; j++) {
            for (int i = 0; i < array.length; i++) {
                // Check if the current element matches the target
                if (array[i][j].equals(target)) {
                    return new int[]{i, j}; // Return the row and column index
                }
            }
        }
        // Return [-1, -1] if the target is not found
        return new int[]{-1, -1};
    }

    public static int[][] split(int[][] array, int row, int col) {
        // Check if the row or column exceeds the boundaries of the 2D array
        if (row >= array.length || col >= array[0].length) {
            return new int[0][0]; // Return a 2D array with no elements
        }

        // Create a new 2D array to store the portion of the original array
        int[][] result = new int[row + 1][col + 1];

        // Copy the elements up to the specified row and column
        for (int i = 0; i <= row; i++) {
            for (int j = 0; j <= col; j++) {
                result[i][j] = array[i][j];
            }
        }

        return result;
    }

    public static int[][] invert(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] invertedArray = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                invertedArray[j][i] = array[i][j];
            }
        }

        return invertedArray;
    }
}