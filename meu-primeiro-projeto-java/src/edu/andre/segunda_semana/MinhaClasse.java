package edu.andre.segunda_semana;
public class MinhaClasse {

    public static void main(String[] args) {
        // System.out.println("Olá, Mundo!");
        String primeiroNome = "Andre";
        String segundoNome = "Batista";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }


    public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
