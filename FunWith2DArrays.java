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
}
