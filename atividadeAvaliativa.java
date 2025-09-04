import java.util.Scanner;

public class atividadeAvaliativa {
    public static void main(String[] args) {
        Scanner lerTeclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = lerTeclado.nextLine();

        System.out.print("Digite seu Gênero: ");
        char genero = lerTeclado.nextLine().charAt(0);

        System.out.print("Digite sua altura: ");
        double altura = lerTeclado.nextDouble();
        lerTeclado.nextLine();// limpar buffer teclado

        System.out.print("Digite seu peso: ");
        double peso = lerTeclado.nextDouble();
        lerTeclado.nextLine();// limpar buffer teclado

        double imc = peso / (altura * altura);

        switch (genero) {
            case 'M', 'm':
                if (imc >= 40)
                    System.out.printf("Nome: %s \nGênero: %s \nIMC: %.1f \nClassificação: Obesidade Mórbida", nome,
                            genero, imc);
                else if (imc >= 30)
                    System.out.printf("Nome: %s \nGênero: %s \nIMC: %.1f \nClassificação: Obesidade Moderada", nome,
                            genero, imc);
                else if (imc >= 25)
                    System.out.printf("Nome: %s \nGênero: %s \nIMC: %.1f \nClassificação: Obesidade Leve", nome, genero,
                            imc);
                else if (imc >= 20)
                    System.out.printf("Nome: %s \nGênero: %s \nIMC: %.1f \nClassificação: Normal", nome, genero, imc);
                else
                    System.out.printf("Nome: %s \nGênero: %s \nIMC: %.1f \nClassificação: Abaixo do Normal", nome,
                            genero, imc);
                break;
            case 'F', 'f', 'N', 'n':
                if (imc >= 39)
                    System.out.printf("Nome: %s \nGênero: %s \nIMC: %.1f \nClassificação: Obesidade Mórbida", nome,
                            genero, imc);
                else if (imc >= 29)
                    System.out.printf("Nome: %s \nGênero: %s \nIMC: %.1f \nClassificação: Obesidade Moderada", nome,
                            genero, imc);
                else if (imc >= 24)
                    System.out.printf("Nome: %s \nGênero: %s \nIMC: %.1f \nClassificação: Obesidade Leve", nome, genero,
                            imc);
                else if (imc >= 19)
                    System.out.printf("Nome: %s \nGênero: %s \nIMC: %.1f \nClassificação: Normal", nome, genero, imc);
                else
                    System.out.printf("Nome: %s \nGênero: %s \nIMC: %.1f \nClassificação: Abaixo do Normal", nome,
                            genero, imc);
                break;
        }
    }
}
