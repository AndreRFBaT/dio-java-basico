package edu.andre.tiposDeVariáveis;

public class TestandoTiposVariaveis {
    public static void main(String[] args) {
        int idade = 20;
        double salario = 2500.50;
        String nome = "Andre";
        boolean maiorDeIdade = true;
        char letra = 'A';

        System.out.println("Idade: " + idade + "- Type: " + ((Object) idade).getClass().getSimpleName());
        System.out.println("Salario: " + salario + "- Type: " + ((Object) salario).getClass().getSimpleName());
        System.out.println("Nome: " + nome + "- Type: " + ((Object) nome).getClass().getSimpleName());
        System.out.println("Maior de idade: " + maiorDeIdade + "- Type: " + ((Object) maiorDeIdade).getClass().getSimpleName());
        System.out.println("Letra: " + letra + "- Type: " + ((Object) letra).getClass().getSimpleName());
    }
}
