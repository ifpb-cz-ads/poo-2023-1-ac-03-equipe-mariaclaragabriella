public class OrcamentoPiscina{
    public static void main (String[] args){
        int precoMetroCub = 100;
        int metrosCubicos = 54;
        int valorTotal = metrosCubicos * precoMetroCub;
        System.out.print("O orçamento para construção da piscina que tem " + metrosCubicos + "(m3) é: " + valorTotal);
    }
}