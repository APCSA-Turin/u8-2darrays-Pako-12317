import java.util.Arrays;

public class runner{
    public static void main(String[] args) {
        String[][] seatingChart = {
            {"Abby", "Don", "George", "Kim"} ,
            {"Brian", "Elenor", "Harry", "Lenny"} ,
            {"Cathy", "Fred", "Jill", "Matt"}
        };
         for (String[] row : seatingChart) {
            for (String string : row) {
                System.out.print(string + " ");
            }
            System.out.println();
         }

        seatingChart[1][2] = "Paul";
        for (String[] row : seatingChart) {
            for (String string : row) {
                System.out.print(string + " ");
            }
            System.out.println();
         }

        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;
        for (String[] row : seatingChart) {
            for (String string : row) {
                System.out.print(string + " ");
            }
            System.out.println();
         }
        
        String[] temp2 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp2;
        for (String[] row : seatingChart) {
            for (String string : row) {
                System.out.print(string + " ");
            }
            System.out.println();
         }

        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        int[][] arr1 = new int[2][3];
        String[][] arr2 = new String[4][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        for (int[] element : arr1) {
            for (int integer : element) {
                System.out.print(integer);
            }
            System.out.println();
        }


        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";
        arr2[3][0] = "g";
        arr2[3][1] = "h";
        for (String[] element : arr2) {
            for (String string : element) {
                System.out.print(string);
            }
            System.out.println();
        }

        System.out.println(arr1[0][2] + arr2[2][0]);


            // TEST CODE FOR totalElements
        int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
        System.out.println(FunWith2DArrays.totalElements(testArr1));
        int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
        System.out.println(FunWith2DArrays.totalElements(testArr2));
        int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.totalElements(testArr3));
        int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.totalElements(testArr4));
        int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
        System.out.println(FunWith2DArrays.totalElements(testArr5));
        int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
        System.out.println(FunWith2DArrays.totalElements(testArr6));
        int[][] testArr7 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.totalElements(testArr7));
        int[][] testArr8 = {{4}};
        System.out.println(FunWith2DArrays.totalElements(testArr8));
        int[][] testArr9 = {{}};
        System.out.println(FunWith2DArrays.totalElements(testArr9));


            //TEST CODE FOR fourCorners
        System.out.println("-------TEST 1-------");
        String[][] words = {
                {"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}
        };
        FunWith2DArrays.fourCorners(words);
        
        System.out.println("-------TEST 2-------");
        String[][] words2 = {
                {"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}
        };
        FunWith2DArrays.fourCorners(words2);
        
        System.out.println("-------TEST 3-------");
        String[][] words3 = {{"phone", "mouse", "keyboard"}};
        FunWith2DArrays.fourCorners(words3);
        
        System.out.println("-------TEST 4-------");
        String[][] words4 = {
                {"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}
        };
        FunWith2DArrays.fourCorners(words4);
        
        System.out.println("-------TEST 5-------");
        String[][] words5 = {{"time"}};
        FunWith2DArrays.fourCorners(words5);
        

        // TEST CODE FOR swapFrontAndBackRows
        System.out.println("-------TEST 1-------");
        String[][] w1 = {
                {"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}
        };
        System.out.println("--Original:");
        for (String[] row : w1) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w1);
        for (String[] row : w1) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("-------TEST 2-------");
        String[][] w2 = {
                {"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}
        };
        System.out.println("--Original:");
        for (String[] row : w2) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w2);
        for (String[] row : w2) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("-------TEST 3-------");
        String[][] w3 = {{"phone", "mouse", "keyboard"}};
        System.out.println("--Original:");
        for (String[] row : w3) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w3);
        for (String[] row : w3) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("-------TEST 4-------");
        String[][] w4 = {
                {"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}
        };
        System.out.println("--Original:");
        for (String[] row : w4) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w4);
        for (String[] row : w4) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("-------TEST 5-------");
        String[][] w5 = {{"time"}};
        System.out.println("--Original:");
        for (String[] row : w5) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("--Modified:");
        FunWith2DArrays.swapFrontAndBackRows(w5);
        for (String[] row : w5) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }


                // TEST CODE FOR average
        int[][] TestArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(FunWith2DArrays.average(TestArr1));
        int[][] TestArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.average(TestArr2));
        int[][] TestArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.average(TestArr3));
        int[][] TestArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.average(TestArr4));
        int[][] TestArr5 = {{4}};
        System.out.println(FunWith2DArrays.average(TestArr5));


                // TEST CODE for edgeSum
        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(FunWith2DArrays.edgeSum(numbers));
        int[][] numbers2 = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}, {13, 14, 15}, {18, 19, 20}};
        System.out.println(FunWith2DArrays.edgeSum(numbers2));
        int[][] numbers3 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(FunWith2DArrays.edgeSum(numbers3));
        int[][] numbers4 = {{1, 2}, {5, 6}};
        System.out.println(FunWith2DArrays.edgeSum(numbers4));


                // TEST CODE FOR indexFound
        System.out.println("--------------");
        String[][] letters = {{"a", "b", "c"}, {"c", "d", "e"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "c")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "a")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "e")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(letters, "g")));
        System.out.println("--------------");
        String[][] words0 = {{"hi", "time", "stuff", "hi"}, {"bye", "hi", "time", "up"}, {"time", "low", "time", "hi"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words0, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words0, "hi")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words0, "up")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words0, "cat")));
        System.out.println("--------------");

        String[][] words1 = {{"time", "up", "bye"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words1, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words1, "up")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words1, "bye")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words1, "cat")));

        // TEST CODE FOR split
        System.out.println("-------test1--------");
        int[][] testArr12 = {{1, 2, 3}, {4, 5, 6}};
        int[][] t1 = FunWith2DArrays.split(testArr12, 1, 1);
        for (int[] row : t1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("-------test2--------");
        int[][] testArr10 = {{10, 11, 12, 13}, {20, 21, 22, 23}, {30, 31, 32, 33}};
        int[][] t2 = FunWith2DArrays.split(testArr10, 2, 1);
        for (int[] row : t2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("-------test3--------");
        int[][] testArr11 = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24}
        };
        int[][] t3 = FunWith2DArrays.split(testArr11, 3, 2);
        for (int[] row : t3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("-------test4--------");
        int[][] t4 = FunWith2DArrays.split(testArr11, 2, 5);
        for (int[] row : t4) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("-------test5--------");
        int[][] t8 = FunWith2DArrays.split(testArr11, 0, 4);
        for (int[] row : t8) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("-------test6--------");
        int[][] t9 = FunWith2DArrays.split(testArr11, 0, 0);
        for (int[] row : t9) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("-------test7--------");
        int[][] t5 = FunWith2DArrays.split(testArr11, 3, 5);
        for (int[] row : t5) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("-------test8--------");
        int[][] t10 = FunWith2DArrays.split(testArr11, 3, 0);
        for (int[] row : t10) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("-------test9--------");
        int[][] t6 = FunWith2DArrays.split(testArr11, 4, 2);
        for (int[] row : t6) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("-------test10-------");
        int[][] t7 = FunWith2DArrays.split(testArr11, 2, 6);
        for (int[] row : t7) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // TEST CODE FOR invert
        System.out.println("---invert test1---");
        int[][] test1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] ts1 = FunWith2DArrays.invert(test1);
        for (int[] row : ts1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("orig array not modified:");
        for (int[] row : test1) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("\n---invert test2---");
        int[][] test2 = {
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 10, 11, 12},
            {13, 14, 15, 16, 17, 18},
            {19, 20, 21, 22, 23, 24}
        };
        int[][] ts2 = FunWith2DArrays.invert(test2);
        for (int[] row : ts2) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("\n---invert test3---");
        int[][] test3 = {{10}};
        int[][] ts3 = FunWith2DArrays.invert(test3);
        for (int[] row : ts3) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}