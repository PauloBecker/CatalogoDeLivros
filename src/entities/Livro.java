package entities;

import java.util.ArrayList;

public class Livro {
	
	private String resumo;
	private String titulo;
	private String autor;
	private Integer numPaginas;
	
	private ArrayList<String> palavraChave = new ArrayList<String>();
	
	public Livro(String resumo, String titulo, String autor, Integer numPaginas) {
		
		this.resumo = resumo;
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
	}

	public Livro() {
		
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(Integer numPaginas) {
		this.numPaginas = numPaginas;
	}


	public Livro getLivro() {
		this.getLivro();
		return null;
	}

	
	public ArrayList<String> getPalavraChave() {
		return palavraChave;
	}

	public void setPalavraChave(ArrayList<String> palavraChave) {
		this.palavraChave = palavraChave;
	}
	
	public void adicionarPalavra(String palavraChave) {
		this.palavraChave.add(palavraChave);
	}
	
	public String getPalavraChave(int posicao) {
		return this.palavraChave.get(posicao).toString();
	}

}
