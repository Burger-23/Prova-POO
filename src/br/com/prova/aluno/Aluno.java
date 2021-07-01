package br.com.prova.aluno;

import br.com.prova.curso.Curso;
import br.com.prova.endereco.Cidade;

public class Aluno extends Cidade {
	
	private String NomeDoAluno;
	private int IdadeDoAluno;
	private Curso cursos;
	
	public String getNomeDoAluno() {
		return NomeDoAluno;
	}
	public void setNomeDoAluno(String nomeDoAluno) {
		NomeDoAluno = nomeDoAluno;
	}
	public int getIdadeDoAluno() {
		return IdadeDoAluno;
	}
	public void setIdadeDoAluno(int idadeDoAluno) {
		IdadeDoAluno = idadeDoAluno;
	}
	public Curso getCursos() {
		return cursos;
	}
	public void setCursos(Curso cursos) {
		this.cursos = cursos;
	}
	
}
	
	
	
	
	


