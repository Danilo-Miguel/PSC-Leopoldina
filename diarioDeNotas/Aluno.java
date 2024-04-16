import java.util.Scanner;

public class Aluno{

    String nome;
    int idade;
    int ra;
    String email;
    String telefone;

    public void identificarAluno(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        nome = scanner.nextLine();

        System.out.println("Digite a sua idade");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a seu ra");
        ra = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o seu email");
        email = scanner.nextLine();

        System.out.println("Digite o seu telefone");
        telefone = scanner.nextLine();

        System.out.println("Seja bem vindo aluno " + nome);
        scanner.close();
    }
    

}