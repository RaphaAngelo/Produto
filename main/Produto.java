public class Produto {
    public static Double calcularNovoValor(double valor) {
        if (valor <= 0) return null;
        return valor * 1.10;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        try {
            System.out.print("Informe o valor do produto: ");
            double valor = sc.nextDouble();
            Double novoValor = calcularNovoValor(valor);
            if (novoValor == null) {
                System.out.println("Número inválido, tente novamente.");
            } else {
                System.out.printf("Novo valor do produto: %.2f%n", novoValor);
            }
        } catch (Exception e) {
            System.out.println("Número inválido, tente novamente.");
        }
        sc.close();
    }
}