package edu.andre.primeira_semana;
public class BoletinEstudantil {
    public static void main(String[] args) {
        String nomeAluno = "Andre";
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 6.5;
        double nota4 = 9.0;

        double mediaFinal = calcularMedia(nota1, nota2, nota3, nota4);
        System.out.println("A média final de " + nomeAluno + " é: " + mediaFinal);

        if (mediaFinal >= 7) {
            System.out.println(nomeAluno + " está aprovado!");
        } else {
            System.out.println(nomeAluno + " está reprovado.");
        }
    }

    public static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        return media;
    }
}
