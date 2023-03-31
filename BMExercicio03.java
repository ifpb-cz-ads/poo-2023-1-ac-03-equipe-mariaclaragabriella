public class BMExercicio03 {
    public static void main(String[] args) {
        double item1 = 2.95;
        double item2 = 3.50;

        System.out.println("O item 1 custa R$ " + item1 + " e o item 2 custa R$ " + item2 );

        double totalItens = item1 + item2;
        System.out.println("O valor total foi de R$ " + totalItens);

        final double taxa = 0.0825;
        double taxaCalculada = totalItens * taxa;
        System.out.printf("O valor total aplicado da taxa é de R$ %.2f \n", taxaCalculada);

        item1 += taxaCalculada;
        item2 += taxaCalculada;
        double novoCusto = item1 + item2;
        System.out.printf("O novo valor total é de R$ %.2f \n", + novoCusto);

        boolean muitoCaro = novoCusto > 10;
        System.out.println(muitoCaro);



    }
}
