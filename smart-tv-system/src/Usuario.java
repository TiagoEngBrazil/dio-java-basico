public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();

        smartTv.mudarCanal(30);

        smartTv.ligarTv();

        System.out.println("A tv está ligada: " + smartTv.ligada);
        System.out.println("Volume da tv: " + smartTv.volume);
        System.out.println("Em que canal a tv está: " + smartTv.canal);

    }
}
