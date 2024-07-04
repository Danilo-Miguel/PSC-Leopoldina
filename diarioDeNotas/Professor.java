import java.util.Scanner;

public class Professor {

    private String nome;
    private int idade;
    private String email;

public void imprimir(){
    System.out.println("Antes" + nome);
}
     
   public String getNome(){
    return nome;
   }

   
   public void setNome(String nome){
    this.nome = nome ;
   }

   public int getIdade(){
    return idade;
   }

   
   public void setIdade(int idade){
    this.idade = idade ;
   }

   public String getEmail(){
    return email;
   }

   
   public void setEmail(String email){
    this.email = email ;
   }

    public void identificarProfessor(String usuario){

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Digite o seu nome");
        setNome(scanner.nextLine());

        System.out.println("Digite a sua idade");
        setIdade(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o seu email");
        setEmail(scanner.nextLine());

        System.out.println("Seja bem vindo " + usuario + nome);
        System.out.println("As informações de cadstro do professor são " + "Nome " +  getNome() + "E-mail " +  getEmail() + "Idade " + getIdade());

      
    }

    public int calucarNotas(int nota1, int nota2, int nota3){

    
        System.out.println("Digite a nota1");
        nota1 = scanner.nextInt();
        scanner.nextLine();
      
        System.out.println("Digite a nota2");
        nota2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a nota3");
        nota3 = scanner.nextInt();
        scanner.nextLine();

        int soma = nota1 + nota2 + nota3;
        System.out.println("Resultado " + soma);

        return (nota1 + nota2 + nota3);
    }
    
}
