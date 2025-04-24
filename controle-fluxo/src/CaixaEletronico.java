public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25.00;
        double valorSolicitado = 24.00;

        // if(valorSolicitado <= saldo){
        //     saldo = saldo - valorSolicitado;
        //     System.out.println("Seu saldo é: " + saldo);
        // }else
        //     System.out.println("Saldo insuficiente");

        //  Condicional Ternário
        double saldoFinal = saldo >= valorSolicitado ? saldo - valorSolicitado : saldo;
        System.out.println("Seu saldo é: " + saldoFinal);

    }
}

