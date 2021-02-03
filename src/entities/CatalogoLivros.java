package entities;

import java.util.ArrayList;


public class CatalogoLivros {
	
	
	ArrayList<Livro> livros = new ArrayList<Livro>();
	

	public int getQuantidadeLivros(){
		
		return livros.size();				
	}
	
	
	public boolean adicionar(Livro novoLivro){	
		
		livros.add(novoLivro);
		return true;
	}
	
	public boolean remover(int posicao){
		
		livros.remove(posicao);
			
			return	true;
				
		}
	
	
	public void imprimirDadosLivro(int dadosLivro) {
		System.out.println("-------- Listagem de Livros --------");
		
			Livro lv = livros.get(dadosLivro);
			System.out.println("Posicao: " + Integer.toString(dadosLivro + 1));
			System.out.println("Titulo: " + lv.getTitulo());
			System.out.println("Autor: " + lv.getAutor());
			System.out.println("Resumo: " + lv.getResumo());
			System.out.println("Num.Paginas: " + lv.getNumPaginas().toString());
		System.out.println("Palavra cahve: ");
		String palavras = "";
		for(int i = 0; i<lv.getPalavraChave().size(); i++) {

			palavras += lv.getPalavraChave(i) + ";"; 
			
			
		}
		System.out.println(palavras);
	}
	
	public void imprimirLivros() {
		if(livros.isEmpty()) {
			System.out.println("-------- Listagem de Livros --------");
			System.out.println("Nao ha livros cadastrados");
			System.out.println("------------------------------------------");
		}else {
		for(int i= 0; i < livros.size(); i++) {
			
			imprimirDadosLivro(i);
		}
	}
}
}
