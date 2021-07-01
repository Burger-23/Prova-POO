package br.com.prova.aluno;

import java.util.List;
import java.util.Scanner;

public class AlunoController {

	private static Scanner tec;

	public AlunoController() {
		tec = new Scanner(System.in);
	}

	public static int lerOpcao() {
		System.out.print("Informe a opção desejada -> ");
		return tec.nextInt();
	}

	public void menu(List<Aluno> alunos) {

		System.out.print("\n");
		System.out.println("|-------------- MENU ---------------|");
		System.out.println("|1 -> CADASTRAR ALUNOS              |");
		System.out.println("|2 -> LISTAR ALUNOS CADASTRADOS     |");
		System.out.println("|3 -> EDITAR ALUNOS                 |");
		System.out.println("|4 -> EXCLUIR ALUNOS                |");
		System.out.println("|---------------------------------- |");
		System.out.print("Informe a Opção Desejada -> ");
		int opcao = tec.nextInt();

		switch (opcao) {
		case 1:
			alunos.add(cadastrarAlunos());
			break;

		case 2:
			listarAlunos(alunos);
			break;

		case 3:
			editarAlunos(alunos);
			break;

		case 4:
			excluirAlunos(alunos);
		default:
			break;

		}

	}

	public Aluno cadastrarAlunos() {
		Aluno aluno = new Aluno();
		System.out.print("\n");
		System.out.println("----CADASTRAR--ALUNOS----");
		System.out.print("\n");

		System.out.print("Informe o nome do Aluno: ");
		tec.nextLine();
		aluno.setNomeDoAluno(tec.next());

		System.out.print("Informe a Idade do Aluno: ");
		aluno.setIdadeDoAluno(tec.nextInt());

		System.out.print("Informe em qual Pais o Aluno mora: ");
		aluno.setNomeDoPais(tec.next());

		System.out.print("Informe a sigla do pais: ");
		aluno.setSiglaDoPais(tec.next());

		tec.nextLine();
		System.out.print("Informe em qual Estado o Aluno mora: ");
		aluno.setNomeDoEstado(tec.nextLine());

		System.out.print("Informe a Sigla do Estado: ");
		aluno.setUF(tec.next());

		tec.nextLine();
		System.out.print("Informe em qual Cidade o Aluno mora: ");
		aluno.setNomeDaCidade(tec.nextLine());

		return aluno;
	}

	public List<Aluno> listarAlunos(List<Aluno> aluno) {
		if (aluno.isEmpty()) {
			System.out.println("Não existem dados cadastrados");
			return null;
		}

		System.out.print("\n");
		System.out.print("-----------------ALUNOS--CADASTRADADS---------------");
		System.out.print("\n");

		System.out.printf("| %2s | %15s | %20s | %20s | %20s | %30s | %20s | %20s |\n", "ID", "Nome", "Idade", "Pais",
				"Sigla do Pais", "Estado", "Sigla do Estado", "Cidade");

		for (int i = 0; i < aluno.size(); i++) {
			System.out.printf("| %2s | %15s | %20s | %20s | %20s | %30s | %20s | %20s |\n", i + 1,
					aluno.get(i).getNomeDoAluno(), aluno.get(i).getIdadeDoAluno(), aluno.get(i).getNomeDoPais(),
					aluno.get(i).getSiglaDoPais(), aluno.get(i).getNomeDoEstado(), aluno.get(i).getUF(),
					aluno.get(i).getNomeDaCidade());
		}
		System.out.print("\n");

		return aluno;
	}

	public List<Aluno> editarAlunos(List<Aluno> aluno) {

		if (aluno.isEmpty()) {
			System.out.println("Não existem dados cadastrados");
			return null;
		}

		Aluno alunos = new Aluno();
		listarAlunos(aluno);

		System.out.print("Informe o ID do Aluno para editar -> ");
		int idAluno = tec.nextInt() - 1;
		System.out.println("\n");
		System.out.println("|--------EDITAR--ALUNOS---------|");
		System.out.println("|1 -> NOME DO ALUNO             |");
		System.out.println("|2 -> IDADE                     |");
		System.out.println("|3 -> PAIS                      |");
		System.out.println("|4 -> SIGLA PAIS                |");
		System.out.println("|5 -> ESTADO                    |");
		System.out.println("|6 -> SILGA ESTADO              |");
		System.out.println("|7 -> CIDADE                    |");
		System.out.println("|-------------------------------|");

		System.out.print("\n");
		System.out.print("Informe o campo que deseja editar: ");
		int opcao = tec.nextInt();
		System.out.println("\n");
		switch (opcao) {

		case 1:
			System.out.print("----EDITAR--NOME----");
			System.out.print("\n");
			System.out.print("Informe novamente o nome do Aluno -> ");
			alunos.setNomeDoAluno(tec.next());

			alunos.setIdadeDoAluno(aluno.get(idAluno).getIdadeDoAluno());
			alunos.setNomeDaCidade(aluno.get(idAluno).getNomeDaCidade());
			alunos.setUF(aluno.get(idAluno).getUF());
			alunos.setNomeDoEstado(aluno.get(idAluno).getNomeDoEstado());
			alunos.setSiglaDoPais(aluno.get(idAluno).getSiglaDoPais());
			alunos.setNomeDoPais(aluno.get(idAluno).getNomeDoPais());

			aluno.set(idAluno, alunos);
			break;

		case 2:
			System.out.println("----EDITAR--IDADE----");
			System.out.print("\n");
			System.out.print("Informe novamente a idade do Aluno -> ");
			alunos.setIdadeDoAluno(tec.nextInt());

			alunos.setNomeDaCidade(aluno.get(idAluno).getNomeDaCidade());
			alunos.setUF(aluno.get(idAluno).getUF());
			alunos.setNomeDoEstado(aluno.get(idAluno).getNomeDoEstado());
			alunos.setSiglaDoPais(aluno.get(idAluno).getSiglaDoPais());
			alunos.setNomeDoPais(aluno.get(idAluno).getNomeDoPais());
			alunos.setNomeDoAluno(aluno.get(idAluno).getNomeDoAluno());

			aluno.set(idAluno, alunos);
			break;

		case 3:
			System.out.println("----EDITAR--PAIS----");
			System.out.print("\n");
			System.out.print("Informe novamente o nome do Pais -> ");
			alunos.setNomeDoPais(tec.next());

			alunos.setIdadeDoAluno(aluno.get(idAluno).getIdadeDoAluno());
			alunos.setNomeDaCidade(aluno.get(idAluno).getNomeDaCidade());
			alunos.setUF(aluno.get(idAluno).getUF());
			alunos.setNomeDoEstado(aluno.get(idAluno).getNomeDoEstado());
			alunos.setSiglaDoPais(aluno.get(idAluno).getSiglaDoPais());
			alunos.setNomeDoAluno(aluno.get(idAluno).getNomeDoAluno());

			aluno.set(idAluno, alunos);
			break;

		case 4:
			System.out.println("----EDITAR--SIGLA----");
			System.out.print("\n");
			System.out.print("Informe novamente a Sigla do Pais -> ");
			alunos.setSiglaDoPais(tec.next());

			alunos.setIdadeDoAluno(aluno.get(idAluno).getIdadeDoAluno());
			alunos.setNomeDaCidade(aluno.get(idAluno).getNomeDaCidade());
			alunos.setUF(aluno.get(idAluno).getUF());
			alunos.setNomeDoEstado(aluno.get(idAluno).getNomeDoEstado());
			alunos.setNomeDoAluno(aluno.get(idAluno).getNomeDoAluno());
			alunos.setNomeDoPais(aluno.get(idAluno).getNomeDoPais());

			aluno.set(idAluno, alunos);
			break;

		case 5:
			System.out.println("----EDITAR--ESTADO----");
			System.out.print("\n");
			System.out.print("Informe novamente o nome do Estado -> ");
			alunos.setNomeDoEstado(tec.nextLine());

			alunos.setNomeDoAluno(aluno.get(idAluno).getNomeDoAluno());
			alunos.setNomeDoPais(aluno.get(idAluno).getNomeDoPais());
			alunos.setIdadeDoAluno(aluno.get(idAluno).getIdadeDoAluno());
			alunos.setNomeDaCidade(aluno.get(idAluno).getNomeDaCidade());
			alunos.setUF(aluno.get(idAluno).getUF());
			alunos.setSiglaDoPais(aluno.get(idAluno).getSiglaDoPais());

			aluno.set(idAluno, alunos);
			break;

		case 6:
			System.out.println("----EDITAR--SIGLA----");
			System.out.print("\n");
			System.out.print("Informe novamente a Sigla do Estado -> ");
			alunos.setUF(tec.next());

			alunos.setSiglaDoPais(aluno.get(idAluno).getSiglaDoPais());
			alunos.setNomeDoAluno(aluno.get(idAluno).getNomeDoAluno());
			alunos.setNomeDoPais(aluno.get(idAluno).getNomeDoPais());
			alunos.setIdadeDoAluno(aluno.get(idAluno).getIdadeDoAluno());
			alunos.setNomeDaCidade(aluno.get(idAluno).getNomeDaCidade());
			alunos.setNomeDoEstado(aluno.get(idAluno).getNomeDoEstado());

			aluno.set(idAluno, alunos);
			break;

		case 7:
			System.out.println("----EDITAR--CIDADE----");
			System.out.print("\n");
			System.out.print("Informe novamente o nome da Cidade -> ");
			tec.nextLine();
			alunos.setNomeDaCidade(tec.nextLine());

			alunos.setNomeDoEstado(aluno.get(idAluno).getNomeDoEstado());
			alunos.setSiglaDoPais(aluno.get(idAluno).getSiglaDoPais());
			alunos.setNomeDoAluno(aluno.get(idAluno).getNomeDoAluno());
			alunos.setNomeDoPais(aluno.get(idAluno).getNomeDoPais());
			alunos.setIdadeDoAluno(aluno.get(idAluno).getIdadeDoAluno());
			alunos.setUF(aluno.get(idAluno).getUF());

			aluno.set(idAluno, alunos);
			break;

		default:
			System.out.print("Opção Inválida!!!!");
			break;
		}
		return aluno;
	}

	public void excluirAlunos(List<Aluno> alunos) {

		listarAlunos(alunos);

		if (alunos.isEmpty()) {
			return;
		}

		System.out.println("----EXCLUIR--ALUNOS----");

		System.out.print("Informe o ID do Aluno para excluir: ");
		int idPessoa = tec.nextInt() - 1;

		if (alunos.size() <= idPessoa) {
			System.out.println("Pessoa não cadastrada.");
			return;
		}

		alunos.remove(idPessoa);

	}
}