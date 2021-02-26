
public class UsaLifo {

	public static void main(String[] args) {
		Lifo minha;
		minha = new Lifo();
		minha.inserir(21);
		minha.inserir(25);
		minha.mostrar();
		System.out.println(minha.quantos());
		
		minha.acharAlguem(21);
	}

}
