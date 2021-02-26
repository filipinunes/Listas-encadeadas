
public class Lifo {
	private NodoLista topo;

	Lifo() {
		topo = null;
	}

	public void inserir(int quem) {
		NodoLista aux;
		aux = new NodoLista(quem);
		aux.vizinho = topo;
		topo = aux;
	}

	public void mostrar() {
		NodoLista aux;
		if (topo == null) {
			System.out.println("A pilha está vazia");
			return;
		}

		aux = topo;
		while (aux != null) {
			System.out.println(aux.idade);
			aux = aux.vizinho;
		}
	}

	public void detonar() {
		topo = null;
	}

	public int retirar() {
		int aux = -99;
		if (topo != null) {
			aux = topo.idade;
			topo = topo.vizinho;
		}
		return aux;
	}

	public int quantos() {
		NodoLista aux;
		int cont = 0;
		aux = topo;
		while (aux != null) {
			aux = aux.vizinho;
			cont++;
		}
		return cont;

	}

	public void acharAlguem(int quem) {
		NodoLista aux;
		int cont = 0;
		aux = topo;
		while (aux != null) {
			if (aux.idade == quem) {
				System.out.println("Elemento " + aux.idade + " encontrado na posicao " + cont);
				return;
			} else {
				cont ++;
				aux = aux.vizinho;				
			}
		}
		System.out.println("Elemento não encontrado.");
	}

}
