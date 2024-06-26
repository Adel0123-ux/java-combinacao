public class CombinationCalculator {
    private FactorialCalculator factorialCalculator;

    public CombinationCalculator() {
        this.factorialCalculator = new FactorialCalculator();
    }

    public int combination(int n, int k) {
        return factorialCalculator.factorial(n) / (factorialCalculator.factorial(k) * factorialCalculator.factorial(n - k));
    }
}
