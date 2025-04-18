
public class AboutME {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Argumentos insuficientes. Certifique-se de passar todos os parâmetros.");
            return;
        }
    
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ");
    
    }
}
