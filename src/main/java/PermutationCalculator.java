public class PermutationCalculator {
    private FactorialCalculator factorialCalculator;

    public PermutationCalculator() {
        this.factorialCalculator = new FactorialCalculator();
    }

    public int permutation(int n, int k) {
        return factorialCalculator.factorial(n) / factorialCalculator.factorial(n - k);
    }
}
