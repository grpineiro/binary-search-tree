package arvoreBinaria;

public class ArvoreBinariaBusca implements ArvoreGenerica {

	//ATRIBUTOS*********************************************************
	public Node raiz; // Apontador para o nó raiz da árvore
	public int size; // A quantidade total de nós na árvore
	
	//CONSTRUTORES******************************************************
	public ArvoreBinariaBusca() {
		makeEmpty();
	}
	
	//MÉTODOS***********************************************************
	private void print(Node node) {
		// Caso base
		if (node == null)
			return;
		// Passo recursivo
		print(node.esq);
		System.out.print(node.info+"-");
		print(node.dir);
	}
	
	private Node insert(int valor, Node node) {
		// Caso base
		if (node == null) {
			node = new Node(valor); // Um novo nó na árvore
			size++; // A árvore ganhou mais um nó
			return node;
		}
		// Passo recursivo
		if (valor < node.info) { // Verifica a navegaçaõ à esquerda
			node.esq = insert(valor, node.esq);
			
		} else if (valor > node.info) { // Navegação à direita
			node.dir = insert(valor, node.dir);
			
		} else { // São iguais
			 // Faço nada pois não permiteremos inserção de valores repetidos
			
		}
		return node;
	}
	
	//MÉTODOS ABSTRATOS*************************************************
	@Override
	public void makeEmpty() {
		// TODO Auto-generated method stub
		raiz = null;
		size = 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (size == 0) return true;
		else return false;
			
	}

	@Override
	public void insert(int valor) {
		// TODO Auto-generated method stub
		raiz = insert(valor, raiz); // Chamada recursiva da inserção
		
	}

	@Override
	public void remove(int valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int findMin() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int findMax() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printTree() {
		// TODO Auto-generated method stub
		if (isEmpty() == true) {
			System.out.println("Árvore vazia");
		} else {
			System.out.println("----------------------");
			print(raiz);
			System.out.println("\n----------------------");
		}
	}

	@Override
	public boolean find(int valor) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
