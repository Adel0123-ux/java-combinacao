public class Main {
    public static void main(String[] args) {
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        int n = 9;
        int k = 3;
        int result = combinationCalculator.combination(n, k);
        System.out.println("C(" + n + "," + k + ") = " + result);
    }
}
