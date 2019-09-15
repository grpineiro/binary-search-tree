package arvoreBinaria;

public class Node {
	public int info; // Informação contida no nó da árvore
	public Node esq; // Ponteiro para subárvore esquerda
	public Node dir; // Ponteiro para subárvore direita
	
	public Node(int info) {
		this.info = info;
		esq = dir = null;
	}
	
	
}
