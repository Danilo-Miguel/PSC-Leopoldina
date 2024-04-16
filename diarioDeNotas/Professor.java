import java.util.Scanner;

public class Professor {
    String nome;
    int idade;
    String email;


    public void identificarProfessor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        nome = scanner.nextLine();

        System.out.println("Digite a sua idade");
        idade = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Digite o seu email");
        email = scanner.nextLine();

        System.out.println("Seja bem vindo professor " + nome);
        scanner.close();
    }
    
}
