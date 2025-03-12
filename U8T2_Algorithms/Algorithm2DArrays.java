package U8T2_Algorithms;

import java.util.ArrayList;

public class Algorithm2DArrays {
 
    /** Return the sum of all elements of arr that are in the one particular row, 
    *  specified by the row parameter
    *
    *  PRECONDITION:  0 <= row < arr.length (i.e. row is guaranteed to be valid)
    *
    *  @param arr  2D array of ints
    *  @param row  the row to add up
    *  @return  the sum of all elements in row
    */
    public static int sumForRow(int[][] arr, int row) {
        int sum = 0;
        for (int i = 0; i < arr[row].length; i++) {
            sum += arr[row][i];
        }
        return sum;
    }
   
    /** Return the sum of all elements of arr that are in the one particular column 
    *
    *  PRECONDITION:  0 <= col < arr[0].length (i.e. col is valid)
    *
    *  @param arr  2D array of ints
    *  @param col  the column to add up
    *  @return  the sum of all elements in column
    */
    public static int sumForColumn(int[][] arr, int col) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][col];
        }
        return sum;
    }
   
    /** Replaces all even integers in arr with 0; all odd integers are unchanged.
    *  It then returns the number of changes that were made.
    *
    *  Example: if arr is {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}}
    *  then this method modifies arr to be:
    *  {{1, 0, 3, 0, 5}, {0, 7, 0, 9, 0}, {0, 0, 0, 3, 5}}
    *  and returns 8 (the number of even numbers replaced by 0)
    *
    *  POSTCONDITION: this method modifies the original 2D array referenced by arr
    *
    *  @param arr  2D array of ints
    *  @return  the number of changes made
    */
    public static int replaceEvensWithZero(int[][] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    arr[i][j] = 0;
                    count++;
                }
            }
        }
        return count;
    }
   
    /** Searches through the 2D array wordChart and finds all strings with
    *  length len; these strings are added to an ArrayList and returned.
    *  If no strings have that length, return an empty ArrayList
    *
    *  @param wordChart  2D array of Strings
    *  @param len  the length of strings to search for
    *  @return  an ArrayList containing all strings in wordChart with length len
    */
    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < wordChart.length; i++) {
            for (int j = 0; j < wordChart[i].length; j++) {
                if (wordChart[i][j].length() == len) {
                    result.add(wordChart[i][j]);
                }
            }
        }
        return result;
    }
   
    /** Calculates and returns the average class grade as a double for all 
    *  Students in the 2D array seatingChart
    *
    *  PRECONDITION:  seatingChart contains at least one element with at least
    *  one student (i.e. no need to worry about division by 0)
    *  
    *  @param seatingChart  2D array of Student objects
    *  @return  the average grade of all Students in seatingChart, as a double
    */
    public static double classAverage(Student[][] seatingChart) {
        double total = 0;
        int count = 0;
        for (int i = 0; i < seatingChart.length; i++) {
            for (int j = 0; j < seatingChart[i].length; j++) {
                total += seatingChart[i][j].getGrade();
                count++;
            }
        }
        return total / count;
    }
   
    /** Returns true if any two consecutive elements, horizontally or vertically,
    *  are equal, false otherwise.  You do not need to check for "wrap around"
    *  consecutiveness, such as if the last element in a row is the same as
    *  the first.
    *
    *  @param arr  2D array of ints
    */
    public static boolean consecutive(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                if (arr[i][j] == arr[i][j + 1]) {
                    return true;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[i + 1][j]) {
                    return true;
                }
            }
        }
        return false;
    }
   
    /** A "magic square" is a square grid filled with distinct integers such
    *  that each element is a different integer, and the sum of the integers
    *  in each row, column and diagonal is equal.  This method should return true
    *  if arr is a magic square.
    *
    *  PRECONDITION: arr is a square 2D array with the same number of rows and
    *  columns
    *
    *  @param arr  2D array of ints
    */
    public static boolean magicSquare(int[][] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[0][i];
        }
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum != sum) {
                return false;
            }
        }
        for (int i = 0; i < n; i++) {
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                colSum += arr[j][i];
            }
            if (colSum != sum) {
                return false;
            }
        }
        int diag1Sum = 0;
        int diag2Sum = 0;
        for (int i = 0; i < n; i++) {
            diag1Sum += arr[i][i];
            diag2Sum += arr[i][n - 1 - i];
        }
        if (diag1Sum != sum || diag2Sum != sum) {
            return false;
        }
        for (int i = 0; i < n; i++) { // Loop through each row
            for (int j = 0; j < n; j++) { // Loop through each column in the current row
                for (int k = 0; k < n; k++) { // Loop through each row again for comparison
                    for (int l = 0; l < n; l++) { // Loop through each column in the comparison row
                        // Check if the elements are not at the same position and are equal
                        if ((i != k || j != l) && arr[i][j] == arr[k][l]) {
                            return false; // Return false if a duplicate element is found
                        }
                    }
                }
            }
        }
        return true;
    }
}
