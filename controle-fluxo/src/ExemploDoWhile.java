import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando...");

        }while (Tocando());

        System.out.println("Alô, tudo bem?");
    }

    public static boolean Tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        // Negando o ato de continuar o loop
        return !atendeu;
    }
}