import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[100];
        int qtdAlunos = 0;
        String continuar = "";

        while(!continuar.equals("1") && qtdAlunos < alunos.length){
            Aluno aluno1 = new Aluno();
            System.out.print("Qual seu nome: ");
            aluno1.setNome(sc.nextLine());
            System.out.print("Qual sua idade: ");
            aluno1.setIdade(sc.nextInt());
            System.out.print("Coragem: ");
            aluno1.setCoragem(sc.nextDouble());
            System.out.print("Inteligencia: ");
            aluno1.setInteligencia(sc.nextDouble());
            System.out.print("Ambicao: ");
            aluno1.setAmbicao(sc.nextDouble());
            System.out.print("Lealdade: ");
            aluno1.setLealdade(sc.nextDouble());
            System.out.print("Estrategia: ");
            aluno1.setEstrategia(sc.nextDouble());
            System.out.print("Criatividade: ");

            aluno1.setCriatividade(sc.nextDouble());

            //sc.nextLine();

            String casa = aluno1.calcularCasa();
            aluno1.setCasa(casa);

            alunos[qtdAlunos] = aluno1;
            qtdAlunos++;

            System.out.println("Deseja sair? (Digite 1) Caso Contrario envie qualquer tecla");
            continuar = sc.nextLine();
            System.out.println();
            System.out.println("===== ALUNOS CADASTRADOS =====");

            for (int i = 0; i < qtdAlunos; i++) {

                System.out.println(alunos[i].exibirInformacoes());
            }


        }
        sc.close();
    }
}