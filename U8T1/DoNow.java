public class DoNow{
    public static void main(String[] args) {
        int[][] numArray = {{1, 2, 3}, {4, 5, 6}};

        for (int i = 0; i < numArray.length; i++){
            for (int j = 0; j< numArray[i].length; j++){
                System.out.print(numArray[i][j]);
            }
            System.out.println();
        }        
    }
}