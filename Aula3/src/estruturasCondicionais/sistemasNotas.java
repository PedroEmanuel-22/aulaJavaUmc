package estruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class sistemasNotas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Programa Sistema de Notas");
		System.out.println("Coloque o nome do aluno: ");
		String nome = sc.next();
		System.out.println("Coloque as notas do aluno (2): ");
		double nota1 = sc.nextDouble();
		sc.nextLine();
		double nota2 = sc.nextDouble();
		double media = (nota1 + nota2) / 2;

		if (media >= 7) {
			System.out.println("O Aluno " + nome + " está aprovado!! ");
			System.out.println("Sua média foi: " + media);
		} else if (media >= 5 && media < 7) {
			System.out.println("O Aluno " + nome + " está de recuperação!! ");
			System.out.println("Sua média foi: " + media);

			System.out.println("Coloque a nota do exame: ");
			double notaExame = sc.nextDouble();
			double mediaFinal = (media + notaExame) / 2;
			if (mediaFinal > 7 && mediaFinal < 10) {
				System.out.println("O Aluno " + nome + " foi aprovado no exame!! ");
				System.out.println("Sua média final do exame foi: " + mediaFinal);
			} else {
				System.out.println("O Aluno " + nome + " FOI REPROVADO NOVAMENTE DESISTA!! ");
				System.out.println("Sua média LIXO foi: " + media);

			}
		} else {
			System.out.println("O Aluno " + nome + " está REPROVADO MELHORE!! ");
			System.out.println("Sua média LIXO foi: " + media);
		}

		sc.close();

	}

}
