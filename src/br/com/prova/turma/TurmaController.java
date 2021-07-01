package br.com.prova.turma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.prova.aluno.Aluno;
import br.com.prova.aluno.AlunoController;

import br.com.prova.curso.Curso;
import br.com.prova.curso.CursoController;

public class TurmaController {

	private Scanner tec;
	private CursoController cursoController;
	private AlunoController alunoController;

	List<Turma> turmas = new ArrayList<>();

	public TurmaController() {
		Scanner tec = new Scanner(System.in);

		cursoController = new CursoController();
		alunoController = new AlunoController();
	}

	public int LerOpcao() {
		System.out.print("Informe a opção desejada -> ");
		return tec.nextInt();
	}

	public void menu(List<Curso> cursos, List<Aluno> alunos) {
		System.out.print("\n");
		System.out.println("|-------------- MENU ---------------|");
		System.out.println("|1 -> CADASTRAR TURMA               |");
		System.out.println("|2 -> LISTAR TURMAS CADASTRADAS     |");
		System.out.println("|-----------------------------------|");
		System.out.print("Informe a Opção Desejada -> ");

		int opcao = tec.nextInt();
		switch (opcao) {
		case 1:
			turmas.add(cadastrarTurma(cursos, alunos));
			break;
		case 2:
			listarTurmas(turmas);
			break;
		default:
			break;
		}
	}

	public List<Turma> listarTurmas(List<Turma> turmas) {
		
		System.out.println("---TURMAS--CADASTRADAS---");
		System.out.printf("| %15s | %20s | \n",
				"Nome do Aluno", "Nome do Curso");
		
		for(int i = 0; i < turmas.size(); i++){
			System.out.printf("| %15s | %20s | \n",
					turmas.get(i).get
		}

		return turmas;
	}

	private Turma cadastrarTurma(List<Curso> cursos, List<Aluno> alunos) {
		return null;
	}
}
