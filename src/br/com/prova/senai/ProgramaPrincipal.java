package br.com.prova.senai;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import br.com.prova.aluno.Aluno;
import br.com.prova.aluno.AlunoController;
import br.com.prova.curso.Curso;
import br.com.prova.curso.CursoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		List<Aluno> alunos = new ArrayList<Aluno>();
		List<Curso> cursos = new ArrayList<Curso>();

		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();

		boolean sair = false;

		do {
			System.out.print("\n");
			System.out.println("|-------------- MENU ---------------|");
			System.out.println("|1 -> MENU ALUNOS                   |");
			System.out.println("|2 -> MENU CURSOS                   |");
			System.out.println("|0 -> SAIR                          |");
			System.out.println("|-----------------------------------|");
			System.out.print("Informe a Opção Desejada -> ");

			int opcao = tec.nextInt();
			switch (opcao) {

			case 1:
				alunoController.menuAluno(alunos);
				break;

			case 2:
				cursoController.menu(cursos);
				break;

			case 0:
				sair = true;
				break;

			default:
				System.out.print("\n");
				System.out.println("Opção Inválida!!");

			}

		} while (!sair);
		System.out.print("\n");
		System.out.println("Sistema Finalizado!!!");

	}

}
