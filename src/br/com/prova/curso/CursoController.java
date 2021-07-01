package br.com.prova.curso;

import java.util.List;
import java.util.Scanner;

public class CursoController {

	private static Scanner tec;

	public CursoController() {
		tec = new Scanner(System.in);
	}

	public static int lerOpcao() {
		System.out.print("Informe a opção desejada -> ");
		return tec.nextInt();
	}

	public void menu(List<Curso> cursos) {
		System.out.print("\n");
		System.out.println("|-------------- MENU ---------------|");
		System.out.println("|1 -> CADASTRAR CURSOS              |");
		System.out.println("|2 -> LISTAR CURSOS CADASTRADOS     |");
		System.out.println("|3 -> EDITAR CURSOS                 |");
		System.out.println("|4 -> EXCLUIR CURSOS                |");
		System.out.println("|---------------------------------- |");
		System.out.print("Informe a Opção Desejada -> ");
		int opcao = tec.nextInt();

		switch (opcao) {

		case 1:
			cursos.add(cadastrarCursos());
			break;

		case 2:
			listarCursos(cursos);
			break;

		case 3:
			editarCursos(cursos);
			break;

		case 4:
			excluirCursos(cursos);
		default:
			break;

		}

	}

	public Curso cadastrarCursos() {
		Curso curso = new Curso();
		System.out.print("\n");
		System.out.println("-----CADASTRAR--CURSOS-----");

		System.out.print("Informe o nome do Curso: ");
		tec.nextLine();
		curso.setNomeDoCurso(tec.nextLine());

		return curso;
	}

	public List<Curso> listarCursos(List<Curso> cursos) {
		if (cursos.isEmpty()) {
			System.out.println("Não existem dados cadastrados");
			return null;
		}
		System.out.print("\n");
		System.out.print("-----CURSOS-CADASTRADADS-----");
		System.out.print("\n");

		System.out.printf("| %2s | %20s |\n", "ID", "Nome do Curso");

		for (int i = 0; i < cursos.size(); i++) {
			System.out.printf("| %2s | %20s | \n", i + 1, cursos.get(i).getNomeDoCurso());
		}
		System.out.print("\n");

		return cursos;
	}

	public List<Curso> editarCursos(List<Curso> curso) {

		if (curso.isEmpty()) {
			System.out.print("Não existem dados cadastrados.");
			return null;
		}

		Curso cursos = new Curso();
		listarCursos(curso);

		System.out.print("Informe o ID do Curso para editar -> ");
		int idCurso = tec.nextInt() - 1;
		System.out.println("\n");
		System.out.println("|--------EDITAR--CURSOS---------|");
		System.out.println("|1 -> NOME DO CURSO             |");
		System.out.println("|-------------------------------|");

		System.out.print("\n");
		System.out.print("Informe o campo que deseja editar: ");
		int opcao = tec.nextInt();
		System.out.println("\n");
		switch (opcao) {

		case 1:
			System.out.print("----EDITAR--NOME----");
			System.out.print("\n");
			System.out.print("Informe novamente o nome do Curso -> ");
			tec.nextLine();
			cursos.setNomeDoCurso(tec.nextLine());

			curso.set(idCurso, cursos);
			break;

		default:
			System.out.print("Opção Inválida!!");
			break;
		}
		return curso;
	}

	public void excluirCursos(List<Curso> cursos) {

		listarCursos(cursos);

		if (cursos.isEmpty()) {
			return;
		
		}
		System.out.println("----EXCLUIR--CURSOS----");

		System.out.print("Informe o ID do Aluno para excluir: ");
		int idCurso = tec.nextInt() - 1;

		if (cursos.size() <= idCurso) {
			System.out.println("Curso não cadastrado");
			return;
		}
		cursos.remove(idCurso);
	}
}