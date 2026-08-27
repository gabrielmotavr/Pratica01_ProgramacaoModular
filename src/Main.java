import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe seu primeiro nome: ");
        pessoa1.setNome(sc.nextLine());
        System.out.print("Informe seu sobrenome: ");
        pessoa1.setSobrenome(sc.nextLine());
        System.out.print("Informe sua idade: ");
        pessoa1.setIdade(sc.nextInt());
        System.out.print("Informe sua altura: ");
        pessoa1.setAltura(sc.nextFloat());
        System.out.print("Informe seu peso: ");
        pessoa1.setPeso(sc.nextDouble());
        pessoa1.setImc(pessoa1.calcularImc(pessoa1.getAltura(), pessoa1.getPeso()));

        System.out.println("Seu imc é: %.2f e sua situação é: %s".formatted(pessoa1.getImc(), pessoa1.informaObesidade(pessoa1.getImc()) ) ); ;
    }
}