import java.util.Scanner;

public class AppIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double idadeCachorro = 0;
        int pesoCachorro = 0;
        
        double portePequeno = 12.5;
        double portemedio = 10.5;
        double porteGrande = 9;
        double idade1 = 0;
        double idade2 = 0;
        String cachorro = "";

        // Pegando as informações do cachorro 

        System.out.println("Qual o peso do cachorro (kl): ");
        pesoCachorro = scan.nextInt();
        System.out.println("Qual a idade do cachorro: ");
        idadeCachorro = scan.nextInt();

        // Separando por peso para saber qual o porte do cachorro

        if (pesoCachorro <= 10){
            cachorro = "Pequeno";
        } else if ( pesoCachorro <= 25){
            cachorro = "Medio";
        } else if (pesoCachorro <= 45){
            cachorro = "Grande";
        }

         // Se a idade do cahorro for de até 2 anos e for porte pequeno 
        if (cachorro == "Pequeno" && idadeCachorro <= 2){
            idade1 = idadeCachorro * 12;
            System.out.println("O seu cachorro é de porte pequeno e sua idade é " + idade1+ " Anos");

        // Se a idade do cachoro for mais de 2 anos  e for porte pequeno
        } else if (cachorro == "Pequeno" && idadeCachorro > 2){
            idade2 = idadeCachorro - 2;
            idade1 = idade2 * 4 + 25;
            System.out.println("O seu cachorro é de porte pequeno e sua idade é " + idade1 +" Anos"  );

        // Se a idade do cahorro for de até 2 anos e for porte medio
        } else if (cachorro == "Medio" && idadeCachorro <=2){
            idade1 = idadeCachorro * 10;
            System.out.println("O seu cachorro é de porte medio e sua idade é " + idade1 +" Anos");
        
        // Se a idade do cahorro for de mais de 2 anos e for porte medio
        } else if (cachorro == "Medio" && idadeCachorro > 2){
            idade2 = idadeCachorro -2;
            idade1 = idade2 * 6 + 21;
            System.out.println("O seu cachorro é de porte medio e sua idade é " + idade1 +" Anos");

        // Se a idade do cahorro for de até 2 anos e for porte grande
        } else if (cachorro == "Grande" && idadeCachorro <=2){
            idade1 = idadeCachorro * 9;
            System.out.println("O seu cachorro é de porte medio e sua idade é " + idade1 +" Anos");

        // Se a idade do cahorro for de mais de 2 anos e for porte grande
        } else if (cachorro == "Grande" && idadeCachorro > 2){
            idade2 = idadeCachorro -2;
            idade1 = idade2 * 8 + 18;
            System.out.println("O seu cachorro é de porte medio e sua idade é " + idade1 +" Anos");
        
        }
}
}
