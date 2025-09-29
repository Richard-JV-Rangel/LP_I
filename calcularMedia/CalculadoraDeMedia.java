public class CalculadoraDeMedia {

    public static void main(String[] args) {
        double[][] cenarios = {
                { 0, 8, 7, 9, 0, 0 },
                { 10, 10, 10, 10, 0, 0 },
                { 8, 6, 7, 8, 0, 1 },
                { 5, 5, 5, 5, 0, 0 },
        };

        System.out.println("Cálculo da Média para 10 Cenários:\n");
        for (int i = 0; i < cenarios.length; i++) {
            double p1 = cenarios[i][0];
            double e1 = cenarios[i][1];
            double e2 = cenarios[i][2];
            double api = cenarios[i][3];
            double sub = cenarios[i][4];
            double x = cenarios[i][5];

            double media = calcularMedia(p1, e1, e2, api, sub, x);
            System.out.printf("Cenário %d: P1=%.1f, E1=%.1f, E2=%.1f, API=%.1f, SUB=%.1f, X=%.1f -> Média = %.2f\n",
                    (i + 1), p1, e1, e2, api, sub, x, media);
        }
    }

    public static double calcularMedia(double p1, double e1, double e2, double api, double sub, double x) {
        double termoA = (p1 * 0.5 + e1 * 0.2 + e2 * 0.3 + x + sub * 0.15);
        double termoB = termoA - 5.9;
        double termoC = 0;

        if (termoB > 0) {
            termoC = termoB / termoB;
        }

        double media = (termoA * 0.5) + (termoC * api * 0.5);
        return media;
    }
}