package PKG_FILA;

public class Fila {
	
	private int size;
	private int indice = -1;
	private Livro[] vet;
	
	 public Fila(int tamanho) {
		 this.size = tamanho;
		 vet = new Livro[tamanho];
	 }
		
	
	public void adiciona(Livro elemento) throws Exception {
		
		if(this.indice ==this.size) {
			 throw new Exception("A fila esta cheia");
		}
		this.indice++;
		vet[this.indice] = elemento;		
		
	}
	
	public Livro remove() throws Exception {
		
		if(this.indice == -1) {
			 throw new Exception("A fila esta vazia");
		}
		
		Livro book = vet[0];
		for(int i = 0; i<indice;i++) {
			vet[i] = vet[i+1];
		}
	
		this.indice--;	
		return book;
	}
	
	public int getSize() {
		return this.indice;
	}
	
	public boolean isEmpty() {
		return this.indice ==-1;
	}
	
	public boolean isFull() {
		return this.indice == this.size;
	}

	public void mostraLivros() {
		
		if(!this.isEmpty()) {
			
			for(int i =0; i<=indice;i++) {
				System.out.println(vet[i].toString());
			}
		}
		
	}

}
