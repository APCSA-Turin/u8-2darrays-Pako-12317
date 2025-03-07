package U8T2_Algorithms;

import java.util.ArrayList;

public class tests {
    public static void main(String[] args) {
        // TEST CODE for sumForRow:
        int[][] testArrA = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        System.out.println(Algorithm2DArrays.sumForRow(testArrA, 0));
        System.out.println(Algorithm2DArrays.sumForRow(testArrA, 1));
        System.out.println(Algorithm2DArrays.sumForRow(testArrA, 2));
        System.out.println();
        int[][] testArrB = {{3, 4, 5}, {8, 9, 10}, {8, 3, 5}, {1, 2, 3}};
        System.out.println(Algorithm2DArrays.sumForRow(testArrB, 0));
        System.out.println(Algorithm2DArrays.sumForRow(testArrB, 1));
        System.out.println(Algorithm2DArrays.sumForRow(testArrB, 2));
        System.out.println(Algorithm2DArrays.sumForRow(testArrB, 3));

        // TEST CODE for sumForColumn:
        int[][] testArrC = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        System.out.println(Algorithm2DArrays.sumForColumn(testArrC, 0));
        System.out.println(Algorithm2DArrays.sumForColumn(testArrC, 1));
        System.out.println(Algorithm2DArrays.sumForColumn(testArrC, 2));
        System.out.println(Algorithm2DArrays.sumForColumn(testArrC, 3));
        System.out.println(Algorithm2DArrays.sumForColumn(testArrC, 4));
        System.out.println();
        int[][] testArrD = {{3, 4, 5}, {8, 9, 10}, {8, 3, 5}, {1, 2, 3}};
        System.out.println(Algorithm2DArrays.sumForColumn(testArrD, 0));
        System.out.println(Algorithm2DArrays.sumForColumn(testArrD, 1));
        System.out.println(Algorithm2DArrays.sumForColumn(testArrD, 2));

        // TEST CODE for replaceEvensWithZero:
        int[][] testArrE = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {4, 6, 8, 3, 5}};
        int changesE = Algorithm2DArrays.replaceEvensWithZero(testArrE);
        System.out.println("Number of changes: " + changesE);
        System.out.println("2D Array modified:");
        for (int[] row : testArrE) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        int[][] testArrF = {{2, 2, 4, 4}, {6, 8, 8, 10}, {4, 6, 8, 2}, {4, 2, 4, 6}};
        changesE = Algorithm2DArrays.replaceEvensWithZero(testArrF);
        System.out.println("\nNumber of changes: " + changesE);
        System.out.println("2D Array modified:");
        for (int[] row : testArrF) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        int[][] testArrG = {{1, 3, 5}, {7, 5, 9}};
        changesE = Algorithm2DArrays.replaceEvensWithZero(testArrG);
        System.out.println("\nNumber of changes: " + changesE);
        System.out.println("2D Array not modified:");
        for (int[] row : testArrG) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // TEST CODE for findStringsOfLength:
        String[][] wordsA = {{"hi", "bye", "stuff", "goo"}, {"time", "up", "you", "map"}, {"good", "low", "bow", "mom"}};
        ArrayList<String> returnedListA = Algorithm2DArrays.findStringsOfLength(wordsA, 3);
        System.out.println(returnedListA);
        ArrayList<String> returnedListB = Algorithm2DArrays.findStringsOfLength(wordsA, 4);
        System.out.println(returnedListB);
        ArrayList<String> returnedListC = Algorithm2DArrays.findStringsOfLength(wordsA, 5);
        System.out.println(returnedListC);
        ArrayList<String> returnedListD = Algorithm2DArrays.findStringsOfLength(wordsA, 6);
        System.out.println(returnedListD);
        System.out.println();
        String[][] wordsB = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, {"j", "k", "l"}};
        returnedListA = Algorithm2DArrays.findStringsOfLength(wordsB, 1);
        System.out.println(returnedListA);
        returnedListB = Algorithm2DArrays.findStringsOfLength(wordsB, 2);
        System.out.println(returnedListB);

        // TEST CODE for classAverage:
        Student s1 = new Student("Abby", 95);
        Student s2 = new Student("Barb", 98);
        Student s3 = new Student("Cole", 91);
        Student s4 = new Student("Dave", 92);
        Student s5 = new Student("Ellie", 98);
        Student s6 = new Student("Frank", 87);
        Student s7 = new Student("George", 93);
        Student s8 = new Student("Jim", 92);
        Student s9 = new Student("Kara", 95);
        Student s10 = new Student("Lenny", 98);
        Student s11 = new Student("Mona", 100);
        Student s12 = new Student("Nancy", 99);
        Student[][] chartA = {{s1, s2, s3}, {s4, s5, s6}, {s7, s8, s9}, {s10, s11, s12}};
        double avgA = Algorithm2DArrays.classAverage(chartA);
        System.out.println(avgA);
        Student[][] chartB = {{s1, s2}, {s4, s5}, {s8, s9}};
        avgA = Algorithm2DArrays.classAverage(chartB);
        System.out.println(avgA);
        Student[][] chartC = {{s6}};
        avgA = Algorithm2DArrays.classAverage(chartC);
        System.out.println(avgA);

        // TEST CODE for consecutive:
        int[][] testArrH = { // true
            {1, 2, 3, 4},
            {1, 3, 4, 5},
            {3, 4, 5, 6}
        };
        int[][] testArrI = { // true
            {1, 2, 3, 4},
            {2, 3, 4, 6},
            {3, 4, 5, 6}
        };
        int[][] testArrJ = { // true
            {7, 7, 3, 4},
            {2, 3, 4, 5},
            {3, 4, 5, 6}
        };
        int[][] testArrK = { // true
            {1, 2, 3, 4},
            {2, 3, 4, 5},
            {3, 4, 2, 2}
        };
        int[][] testArrL = { // true
            {1, 2, 3, 4, 5},
            {2, 3, 9, 5, 6},
            {3, 4, 9, 6, 7},
            {4, 5, 6, 7, 8}
        };
        int[][] testArrM = { // true
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 6},
            {3, 4, 1, 1, 7},
            {4, 5, 6, 7, 8}
        };
        int[][] testArrN = { // true
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 6},
            {3, 4, 5, 6, 8},
            {4, 5, 6, 7, 8}
        };
        int[][] testArrO = { // true
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 6},
            {3, 4, 5, 6, 7},
            {4, 5, 6, 8, 8}
        };
        int[][] testArrP = { // false
            {1, 2, 3, 4},
            {2, 3, 4, 5},
            {3, 4, 5, 6}
        };
        int[][] testArrQ = { // false
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5, 6},
            {3, 4, 5, 6, 7},
            {4, 5, 6, 7, 8}
        };
        boolean testConsecutive1 = Algorithm2DArrays.consecutive(testArrH);
        System.out.println(testConsecutive1);
        boolean testConsecutive2 = Algorithm2DArrays.consecutive(testArrI);
        System.out.println(testConsecutive2);
        boolean testConsecutive3 = Algorithm2DArrays.consecutive(testArrJ);
        System.out.println(testConsecutive3);
        boolean testConsecutive4 = Algorithm2DArrays.consecutive(testArrK);
        System.out.println(testConsecutive4);
        boolean testConsecutive5 = Algorithm2DArrays.consecutive(testArrL);
        System.out.println(testConsecutive5);
        boolean testConsecutive6 = Algorithm2DArrays.consecutive(testArrM);
        System.out.println(testConsecutive6);
        boolean testConsecutive7 = Algorithm2DArrays.consecutive(testArrN);
        System.out.println(testConsecutive7);
        boolean testConsecutive8 = Algorithm2DArrays.consecutive(testArrO);
        System.out.println(testConsecutive8);
        boolean testConsecutive9 = Algorithm2DArrays.consecutive(testArrP);
        System.out.println(testConsecutive9);
        boolean testConsecutive10 = Algorithm2DArrays.consecutive(testArrQ);
        System.out.println(testConsecutive10);
        if (testConsecutive1 && testConsecutive2 && testConsecutive3 && testConsecutive4 && testConsecutive5 && testConsecutive6 && testConsecutive7 && testConsecutive8 && !testConsecutive9 && !testConsecutive10) {
            System.out.println("\n--- ALL TESTS PASS! ---");
        } else {
            System.out.println("\n!!!!!! TEST FAIL!!!!!!!");
        }

        // TEST CODE for magicSquare:
        int[][] testArrR = {{7, 2, 3}, {0, 4, 8}, {5, 6, 1}};
        int[][] testArrS = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        int[][] testArrT = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 15}};
        int[][] testArrU = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 17, 13, 9, 2}, {20, 8, 19, 12, 6}, {5, 3, 10, 22, 25}};
        int[][] testArrV = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 15}, {14, 4, 1, 6}};
        int[][] testArrW = {{2, 16, 13, 3}, {11, 5, 8, 10}, {7, 9, 12, 6}, {14, 4, 1, 8}};
        int[][] testArrX = {{7, 3, 2}, {0, 4, 8}, {5, 6, 1}};
        int[][] testArrY = {{3, 3, 3}, {3, 3, 3}, {3, 3, 3}};
        int[][] testArrZ = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        int[][] testArrAA = {{0, 4, 8}, {7, 2, 3}, {5, 6, 1}};
        int[][] testArrAB = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 26, 13, 9, 2}, {20, 8, 19, 12, 6}, {5, -6, 10, 22, 25}};
        int[][] testArrAC = {{1, 23, 16, 4, 21}, {15, 14, 7, 18, 11}, {24, 27, 13, -1, 2}, {20, 8, 19, 12, 6}, {5, 3, 10, 22, 25}};
        int[][] testArrAD = {{1, 2, 9}, {4, 15, -7}, {7, -5, 10}};
        int[][] testArrAE = {{2, 7, 6}, {9, 5, 1}, {4, 3, 5}};

        boolean testMagicSquare1 = Algorithm2DArrays.magicSquare(testArrR);
        System.out.println(testMagicSquare1);
        boolean testMagicSquare2 = Algorithm2DArrays.magicSquare(testArrS);
        System.out.println(testMagicSquare2);
        boolean testMagicSquare3 = Algorithm2DArrays.magicSquare(testArrT);
        System.out.println(testMagicSquare3);
        boolean testMagicSquare4 = Algorithm2DArrays.magicSquare(testArrU);
        System.out.println(testMagicSquare4);
        boolean testMagicSquare5 = Algorithm2DArrays.magicSquare(testArrV);
        System.out.println(testMagicSquare5);
        boolean testMagicSquare6 = Algorithm2DArrays.magicSquare(testArrW);
        System.out.println(testMagicSquare6);
        boolean testMagicSquare7 = Algorithm2DArrays.magicSquare(testArrX);
        System.out.println(testMagicSquare7);
        boolean testMagicSquare8 = Algorithm2DArrays.magicSquare(testArrY);
        System.out.println(testMagicSquare8);
        boolean testMagicSquare9 = Algorithm2DArrays.magicSquare(testArrZ);
        System.out.println(testMagicSquare9);
        boolean testMagicSquare10 = Algorithm2DArrays.magicSquare(testArrAA);
        System.out.println(testMagicSquare10);
        boolean testMagicSquare11 = Algorithm2DArrays.magicSquare(testArrAB);
        System.out.println(testMagicSquare11);
        boolean testMagicSquare12 = Algorithm2DArrays.magicSquare(testArrAC);
        System.out.println(testMagicSquare12);
        boolean testMagicSquare13 = Algorithm2DArrays.magicSquare(testArrAD);
        System.out.println(testMagicSquare13);
        boolean testMagicSquare14 = Algorithm2DArrays.magicSquare(testArrAE);
        System.out.println(testMagicSquare14);
        if (testMagicSquare1 && testMagicSquare2 && testMagicSquare3 && testMagicSquare4 && !testMagicSquare5 && !testMagicSquare6 && !testMagicSquare7 && !testMagicSquare8 && !testMagicSquare9 && !testMagicSquare10 && !testMagicSquare11 && !testMagicSquare12 && !testMagicSquare13 && !testMagicSquare14) {
            System.out.println("\n--- ALL TESTS PASS! ---");
        } else {
            System.out.println("\n!!!!!! TEST FAIL!!!!!!!");
        }
    }
}
