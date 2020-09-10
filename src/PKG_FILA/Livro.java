package PKG_FILA;

public class Livro {
	
   private int quantidade;
	
	private String titulo;
	
	public Livro(String titulo,int quantidade) {
		this.titulo =titulo;
		this.quantidade = quantidade;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
     @Override
    	public String toString() {
    		// TODO Auto-generated method stub
    		return  "Nome "+this.titulo+" Quantidade  " + this.quantidade;
    	}

}
