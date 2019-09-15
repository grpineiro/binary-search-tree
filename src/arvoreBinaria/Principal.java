package arvoreBinaria;

public class Principal {
	public static void main(String[] args) {
		ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
		arvore.insert(50);
		arvore.insert(10);
		arvore.insert(40);
		arvore.insert(30);
		arvore.insert(70);
		arvore.insert(90);
		arvore.insert(60);
		
		arvore.printTree();
	}
}
