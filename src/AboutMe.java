
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args) {
        //criando o objeto scanner
        try {
            
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobre nome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        //imprimindo pelo usuario
        System.out.println("Ola, me chamo "+nome+" "+sobrenome);
        System.out.println("Tenho "+idade+" anos.");
        System.out.println("Minha altura eh "+altura+"cm");
        } 
        catch (java.util.InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numéricos!!");
        } 

    }
    
}
