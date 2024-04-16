import java.util.Scanner;

public class DiarioDeNotas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 'Aluno' se você for um aluno e 'Professor' se você um professor" );
        String usuario  = sc.nextLine();

         if(usuario.equalsIgnoreCase("Professor")){
         Professor professor = new Professor();
         professor.identificarProfessor();

         }else if(usuario.equalsIgnoreCase("Aluno")){
            Aluno aluno = new Aluno();
            aluno.identificarAluno();

         }else{
            System.out.println("Opção invalida ");

         }

    }

}