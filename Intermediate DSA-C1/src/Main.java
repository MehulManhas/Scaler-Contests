public class Main {
    public static void main(String[] args) {

        //Q1 : -
        int[] A = new int[]{2,4,3,1,5};
        int B = 3;
        LittlePonyAndMaxElement littlePonyAndMaxElement = new LittlePonyAndMaxElement();
        System.out.println(littlePonyAndMaxElement.solve(A, B));

        //Q2 : -
        String A1 = "eaucqt";
        int[][] B1 = new int[][]{{0,2}};
        VowelsInRange vowelsInRange = new VowelsInRange();
        System.out.println(vowelsInRange.solve(A1, B1));
    }
}