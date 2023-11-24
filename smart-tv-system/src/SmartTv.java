public class SmartTv {
    boolean ligada = false;
    int volume = 25;
    int canal = 2;

    public void ligarTv() {
        ligada = true;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void baixarVolume() {
        volume--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
