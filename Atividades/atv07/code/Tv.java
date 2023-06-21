package atv07.code;

public class Tv {

    public int volume;
    public int canal;

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarCanal(int canal) {
        this.canal = canal;
    }

    public void mostrar() {
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }
    
}
