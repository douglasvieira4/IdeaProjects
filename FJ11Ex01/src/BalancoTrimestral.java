public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiros = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiros + gastosFevereiro + gastosMarco;
        System.out.println(gastosTrimestre);

        double mediaMensal = (gastosJaneiros + gastosFevereiro + gastosMarco)/3;
        System.out.println("Valor da média mensal: " + mediaMensal);
        int media = (int) mediaMensal;
        System.out.println(media);
    }
}
