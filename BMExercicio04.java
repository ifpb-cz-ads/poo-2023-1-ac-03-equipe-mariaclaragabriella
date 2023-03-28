public class BMExercicio04 {
    public static void main(String[] args) {

        long long1 = 100;

        int int1 = 200;

        /*
        int int2 = int1 + long1;

        O erro acima ocorre pela diferença de tipos int e long, pois o primeiro possui
        32 bits e o segundo 64 bits. Logo, para ir de long para int é necessário perder
        algumas informações, o que não é feito automaticamente pelo Java. Assim, para
        corrigir esse problema é necessário fazer um cast.
        */

        int int2 = int1 + (int) long1;

        System.out.println(long1);
        System.out.println(int1);
        System.out.println(int2);



    }
}
