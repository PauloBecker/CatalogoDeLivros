package application;

import entities.CatalogoLivros;
import entities.Livro;
import entities.SistemaCatalogoLivros;

public class Main {

	public static void main(String[] args) {
		
		
		
		SistemaCatalogoLivros sistema = new SistemaCatalogoLivros();
		@SuppressWarnings("unused")
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		@SuppressWarnings("unused")
		Livro livro = new Livro();
		sistema.iniciarSistema();

	}

}
