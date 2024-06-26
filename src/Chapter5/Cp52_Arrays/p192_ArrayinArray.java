package Chapter5.Cp52_Arrays;

public class p192_ArrayinArray {
    public static void main(String[] args) {

        int[][] mathScores = new int[2][3];
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {
                System.out.println("mathScores["+i+"]["+j+"]="+mathScores[i][j]);
            }
        }
        System.out.println();

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        for (int i = 0; i < englishScores.length; i++) {
            for (int k = 0; k < englishScores[i].length; k++) {
                System.out.println("englishScores["+i+"]["+k+"]="+englishScores[i][k]);
            }
        }
        System.out.println();

        int[][] javaScores = { {95, 80}, {92, 96, 80} };
        for (int i = 0; i < javaScores.length; i++) {
            for (int k = 0; k < javaScores[i].length; k++) {
                System.out.println("javaScores["+i+"]["+k+"]="+javaScores[i][k]);
            }
        }
    }
}
