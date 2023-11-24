public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.ligarTv();
        smartTv.mudarCanal(30);
        
        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("O volume da tv está em: " + smartTv.volume);
        System.out.println("A tv está no canal: " + smartTv.canal);
    }
}
