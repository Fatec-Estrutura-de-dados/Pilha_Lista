package PKG_FILA;

public class Pilha {
	
	private int size;
	private int indice = -1;
	private Livro[] vet;
	
	 public Pilha(int tamanho) {
		 this.size = tamanho;
		 vet = new Livro[tamanho];
	 }
		
	public void push(Livro elemento) throws Exception {
		
		if(this.indice ==this.size) {
			 throw new Exception("A Pilha esta cheia");
		}
		this.indice++;
		vet[this.indice] = elemento;
		
		
	}
	
	public Livro peek() throws Exception {
		
		if(this.indice == -1) {
			 throw new Exception("A Pilha esta vazia");
		}
		
		Livro livro = vet[this.indice];
		return livro;
	}
	public Livro pop() throws Exception {
		
		if(this.indice == -1) {
			 throw new Exception("A Pilha esta vazia");
		}
			
		Livro livro  = vet[this.indice];
		this.indice --;
		return livro;
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
	
	public void ordena() {
		
		 for (int i=0; i<=this.indice; i++){
	        	for (int t = 0; t <=this.indice-1; t++) {   
	                                            
	                if ((this.vet[t+1].getTitulo().toUpperCase().compareTo(this.vet[t].getTitulo().toUpperCase()) < 0)){   
	                    Livro temp = this.vet[t];  
	                    this.vet [t] = this.vet[t+1];
	                    this.vet[t+1] = temp;
	                         
	                }
	        	}    
	        }
	}
}
