package edu.andre.exercicioSmartTv;

public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("\nNovo status -> TV ligada: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("\nNovo status -> TV ligada: " + smartTv.ligada);
        
        smartTv.aumentarVolume();
        System.out.println("\nAumentar Volume -> Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("\nDiminuir Volume -> Volume atual: " + smartTv.volume);

        smartTv.mudarCanal();
        System.out.println("\nAumentar Canal -> Canal atual: " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("\nAumentar Canal -> Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("\nDiminuir Canal -> Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(10);
        System.out.println("\nMudar Canal -> Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(5);
        System.out.println("\nMudar Canal -> Canal atual: " + smartTv.canal);
    }
}
