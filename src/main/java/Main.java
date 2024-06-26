import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CombinationCalculator combinationCalculator = new CombinationCalculator();
        PermutationCalculator permutationCalculator = new PermutationCalculator();

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor de r: ");
        int r = scanner.nextInt();

        int combinationResult = combinationCalculator.combination(n, r);
        int permutationResult = permutationCalculator.permutation(n, r);

        System.out.println("C(" + n + ", " + r + ") = " + combinationResult);
        System.out.println("P(" + n + ", " + r + ") = " + permutationResult);

        scanner.close();
    }
}
