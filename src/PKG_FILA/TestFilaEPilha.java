package PKG_FILA;

public class TestFilaEPilha {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//exercicio02();
		exercicio03();
		//testeOrdenar();
		
		

	}

	private static void testeOrdenar() {
		// TODO Auto-generated method stub
		Livro vetor[] = new Livro[4];   
        vetor[0] = new Livro("jPrograma��o cobol", 15);   
        vetor[1] = new Livro("kPrograma��o cobol", 15);   
        vetor[2] = new Livro("BPrograma��o cobol", 15);   
        vetor[3] = new Livro("APrograma��o cobol", 15);
        for (int i=0; i<vetor.length-1; i++){
        	for (int t = 0; t <=vetor.length-2; t++) {   
                                            
                if ((vetor[t+1].getTitulo().toUpperCase().compareTo(vetor[t].getTitulo().toUpperCase()) < 0 )){   
                    Livro temp = vetor[t];  
                	vetor [t] = vetor[t+1];
                	vetor[t+1] = temp;
                         
                }
        	}    
        }
                              
       for (int i = 0; i < vetor.length; i++) {   
            System.out.println(vetor[i]);   
       }  


	
}

	

	private static void exercicio03() throws Exception {
		// TODO Auto-generated method stub
		Fila fila = new Fila(15);
		Pilha pilha  = new Pilha(15);
		
		Livro book = new Livro("Programa��o cobol", 15);
		Livro book01 = new Livro("Programa��o C#", 16);
		Livro book02 = new Livro("Programa��o Java", 18);
		Livro book03 = new Livro("Programa��o Assembly", 18);
		
		fila.adiciona(book);
		fila.adiciona(book01);
		fila.adiciona(book02);
		fila.adiciona(book03);
		fila.adiciona(new Livro("Programa��o Orientada a objetos", 20));
		fila.mostraLivros();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		pilha.push(fila.remove());
		pilha.push(new Livro("Sistemas operacionais", 15));
		System.out.println("Topo "+pilha.peek().toString());
		pilha.push(new Livro("teste unitario C#",5));		
		System.out.println("Topo "+ pilha.peek().toString());
		pilha.push(new Livro("teste unitario Java",5));	
		System.out.println("Topo "+ pilha.peek().toString());
		fila.adiciona(pilha.pop());
		pilha.mostraLivros();
		pilha.push(new Livro("AAAteste unitario Java",5));	
		pilha.ordena();
		System.out.println("Livros Ordenados +++++++++++++++++++++++++++++++++++++++++++");
		pilha.mostraLivros();
		
		


		
		
		
	}

	private static void exercicio02() throws Exception {
		
	   /* Implemente uma classe de teste para a Fila*/
		Livro book = new Livro("Programa��o cobol", 10);
		Livro book01 = new Livro("Programa��o C#", 10);
		Livro book02 = new Livro("Programa��o Java", 10);
		
		Fila fila = new Fila(3);
		
		fila.adiciona(book);
		fila.adiciona(book01);
		fila.adiciona(book02);
		
		fila.mostraLivros();
		
		fila.remove();
		fila.remove();
		fila.remove();
		fila.mostraLivros();
		
	}

}
