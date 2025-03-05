public class MainMethod {
    public static void main(String[] args) {
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        System.out.println("---------");
        // Write code below that uses nested ENHANCED for loops
        // to print each element in nums in ROW-MAJOR order again;
        // print all the numbers in a row on the same line
        // with a space in between

        // Using enhanced for loop
        for (int[] row : nums) {
            for (int num : row) {
                System.out.print(num + " ");
            }
        }
        System.out.println(); // move to the next line

        // Now, write code below that uses nested INDEX-BASED for loops
        // to print each element in nums in ROW-MAJOR order;
        // print all the numbers in a row on the same line
        // with a space in between

        // Using index-based for loop
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
        }
        System.out.println(); // move to the next line

        System.out.println("---------");
        // Finally, write code below that uses nested for loops
        // to print each element in nums in COLUMN-MAJOR order;
        // print all the numbers in a COLUMN on the same line
        // with a space in between

        // Using nested for loop for column-major order
        int numColumns = nums[0].length;
        int numRows = nums.length;
        for (int j = 0; j < numColumns; j++) {
            for (int i = 0; i < numRows; i++) {
                System.out.print(nums[i][j] + " ");
            }
        }
        System.out.println(); // move to the next line


        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] animals = {
                {"anteater", "bird"},
                {"camel", "dog"},
                {"elephant", "giraffe"},
                {"hyena", "jackal"}
        };

        // Write code below using a nested loop to update each element
        // in animals to its plural form, e.g. bird --> birds;
        // (no printing yet)

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                animals[i][j] = animals[i][j] + "s"; // Making the animal plural
            }
        }

        // Next, write code below to print out the 2D
        // array in column-major order, showing each
        // animal inside a bracketed "enclosure"
        // using "|" (like fences separating animal pens
        // in a zoo)

        // Printing in column-major order with fences
        for (int j = 0; j < animals[0].length; j++) {
            for (int i = 0; i < animals.length; i++) {
                System.out.print("|" + animals[i][j]);
            }
            System.out.println("|"); // End the row after printing all columns for that j
        }
    }
}
