import java.util.Scanner;

public class DiarioDeNotas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se você um professor" );
        String usuario  = scanner.nextLine();

         if(usuario.equalsIgnoreCase("Professor")){
         Professor professor = new Professor();
         professor.imprimir();
         professor.identificarProfessor(usuario);

         System.out.println("O que tem aqui Get?"  + professor.getNome());

         //professor.somarNotas(nota1, nota2, nota3);

         }else if(usuario.equalsIgnoreCase("Aluno")){



            Aluno aluno = new Aluno();
            String nome = aluno.identificarAluno(usuario);

            System.out.println("Seja bem vindo " + usuario + nome);

         }else{
            System.out.println("Opção invalida ");

         }
         scanner.close();
    }
  

}