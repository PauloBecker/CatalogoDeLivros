package entities;

import java.util.Scanner;


public class SistemaCatalogoLivros {

	private CatalogoLivros catalogoLivros;

	private Scanner teclado;
	
	
	public SistemaCatalogoLivros() {
		catalogoLivros = new CatalogoLivros();
		teclado = new Scanner(System.in);
	}
	
	public void iniciarSistema(){
		int op = -1;
		while(op != 0){
			op = menuPrincipal();
			switch(op){
			case 1:
				adicionarLivro();
				break;
			case 2:
				catalogoLivros.imprimirLivros();
				break;
			case 3:
				removerLivro();
				
				break;
			case 0:
				System.out.println("Finalizando o sistema");
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
		}	
	}
	
	private void removerLivro() {
		if(catalogoLivros.livros.isEmpty()) {
			System.out.println("-------- Listagem de Livros --------");
			System.out.println("Nao ha livros cadastrados");
			System.out.println("------------------------------------------");
		}else {
		System.out.println("Digite a posicao do livro: " );
		int posicao = Integer.parseInt(teclado.nextLine());
		catalogoLivros.remover(posicao - 1);
		
		}
	}

	private void adicionarLivro() {
		String titulo, autor, resumo; 
		int numPaginas;
		Livro livro;
		System.out.println("------Adicionando Livro------");
		System.out.print("Digite título: ");
		titulo = teclado.nextLine();
		System.out.print("Digite Autor: ");
		autor = teclado.nextLine();
		System.out.print("Digite o Resumo: ");
		resumo = teclado.nextLine();
		System.out.print("Digite Num Paginas: ");
		numPaginas = Integer.parseInt(teclado.nextLine());
		livro = new Livro(titulo, autor, resumo, numPaginas);
		String palavraChave;
		int opcao = 1;
		
		while(opcao == 1) {
			
			System.out.print("Digite as palavras chave: ");
			palavraChave = teclado.nextLine();
			livro.adicionarPalavra(palavraChave);
			System.out.println("Deseja adicionar uma nova palavra chave? ");
			System.out.println("0 - Nao");
			System.out.println("1 - Sim");
			opcao = Integer.parseInt(teclado.nextLine());
		}
		
		catalogoLivros.adicionar(livro);
		
	}

	public int menuPrincipal(){
		System.out.println("---------------MENU-----------------");
		System.out.println("  1 - Adicionar Livro");
		System.out.println("  2 - Imprimir Livros");
		System.out.println("  3 - Remover livro (por posição)");
		System.out.println("  0 - Sair");
		System.out.println("------------------------------------");
		System.out.println("Digite opção:");
		int op = Integer.parseInt(teclado.nextLine());
		return op;

	}
	
}
