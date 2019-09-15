package arvoreBinaria;

public interface ArvoreGenerica {
	
	/** Torna a árvore vazia */
	public void makeEmpty();
	
	/** Retorna "true" se a árvore estiver vazia, ou "false" se não estiver */
	public boolean isEmpty();
	
	/** Insere o "valor" na árvore */
	public void insert(int valor);
	
	/** Remove da árvore o elemento "valor" */
	public void remove(int valor);
	
	/** Retorna o menor valor da árvore */
	public int findMin();
	
	/** Retorna o maior valor da árvore */
	public int findMax();
	
	/** Imprime todos os elementos contidos na árvore */
	public void printTree();
	
	/** Verifica se o "valor" se encontra na árvore */
	public boolean find(int valor);
}

