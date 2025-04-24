public class VefificarNota {
    public static void main(String[] args) throws Exception{
       double nota = 5.0;

        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println("Resultado: " + resultado);
    }
}