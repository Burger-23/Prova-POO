package br.com.prova.endereco;

//CLASE\\
public class Estado extends Pais{
	
//ATRIBUTOS\\
	private String NomeDoEstado;
	private String UF;
	
//METODOS\\
	public String getNomeDoEstado() {
		return NomeDoEstado;
	}
	
	public void setNomeDoEstado(String NomeDoEstado) {
		this.NomeDoEstado = NomeDoEstado;
	}
	
	public String getUF() {
		return UF;
	}
	
	public void setUF(String UF) {
		this.UF = UF;
	}
}
