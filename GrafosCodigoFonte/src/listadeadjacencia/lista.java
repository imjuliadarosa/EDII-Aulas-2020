package listadeadjacencia;

public class lista {
    public Vertice lista[];
    public int nVertices;
    private int MatrizIncidenciaqtdVertices = 0;//coluna
    private int MatrizIncidenciaqtdArestas = 0;  //linha
    private int[][] G;
    
    public lista(int qtdVertices){
        this.nVertices=qtdVertices;
        lista = new Vertice[qtdVertices];
    }
    
    public void inserirArestaDire(int origem, int destino){
        Vertice inserido = new Vertice();
        inserido.num = destino;
        inserido.prox = lista[origem];
        lista[origem] = inserido;
    }
    
    public void inserirAresta(int origem, int destino){
        Vertice inserido = new Vertice();
        inserido.num = destino;
        inserido.prox = lista[origem];
        lista[origem] = inserido;
        Vertice novo = new Vertice();
        novo.num = origem;
        novo.prox = lista[destino];
        lista[destino] = novo;
    }
    
    public void removerAresta(int origem, int destino){
       Vertice aux = lista[origem];
       Vertice anterior = new Vertice();
       if ( aux != null ){
        while( aux != null ){
            if ( aux.num == destino){ 
                if ( aux == lista[origem] ){
                    lista[origem] = aux.prox;
                    aux = lista[origem];
                    break;
                }else if( aux.prox == null ){
                    anterior.prox = null;
                    break;
                }else{
                    anterior.prox = aux.prox;
                    break;
                }
            }
            anterior=aux;
            aux=aux.prox;
        }
       }
        
    }

    public void mostrarListaVertice(int Vertice){
        Vertice aux = lista[Vertice];
        System.out.print(" "+Vertice+" -> ");
            while ( aux != null){
                System.out.print(" "+aux.num+" ; ");
                aux = aux.prox;
            }
            System.out.println();
    }
    
    public void mostrarLista(){
    for(int i = 0; i < nVertices - 1; i++){
            System.out.print(" "+i+" -> ");
            Vertice aux = lista[i];
            while ( aux != null){
                System.out.print(" "+aux.num+" ; ");
                aux = aux.prox;
            }
            System.out.println();
        }
    }
    
    public boolean isVerticeVazio(int Vertice){
        Vertice aux = lista[Vertice];
        return aux == null;
    }
    
    public Vertice[] getLista(){
        return this.lista;
    }
    public int getQtdVertices(){
        return this.nVertices;
    }
    
    public void buscaLargura ( int buscado){
        int[] controle = new int[lista.length];
        for( int j = 0; j < controle.length-1; j++ ){
            controle[j] = 0;
        }
        int i = 0;
        while( lista[i] != null ){
            Vertice aux = lista[i];
            controle[i]++; 
            System.out.println("EM: "+i+" "); 
            while( aux != null){
                System.out.println("Aresta " + aux.num + " ; "); 
                if(aux.num == buscado){
                    System.out.println("Encontrado");
                }
                aux=aux.prox;
            }
            i++;
        }
    }
    
    public void buscaProfundidade (int buscado){
        for(int i = 0; i<=lista.length-1; i++){
            Vertice aux = lista[i];
            System.out.println("EM: "+i+" ");
            while(aux != null){    
                System.out.println("Verificado " + aux.num + " ; ");
                if(aux.num == buscado){
                    System.out.println("Encontrado");
                }
                aux = aux.prox;
            }
        }
    }

    public void setMatrizIncidenciafromListaAdjacencia(){
        int Arestas = 0;
        for(int i = 0; i<lista.length-1;i++){
            Vertice aux = lista[i];
            while(aux != null){
                Arestas++;
                aux = aux.prox;
            }
        }
        int[][] Matriz = new int[Arestas][lista.length-1];
        for(int i = 0; i<lista.length-1;i++){
            Vertice aux = lista[i];
            for(int j = 0; j<Arestas-1;j++){
                if(aux != null){
                    Matriz[j][i] = 1;
                    aux = aux.prox;
                }
            }
        }
        this.G = Matriz;
        this.MatrizIncidenciaqtdArestas = Arestas;
        this.MatrizIncidenciaqtdVertices = lista.length-1;
    }
    
    public void mostrarMatrizIncidencia(){
        for(int i = 0; i < MatrizIncidenciaqtdArestas; i++){
            for(int j = 0; j < MatrizIncidenciaqtdVertices; j++){
                System.out.print(" "+G[i][j]+" |");
            }
        System.out.println();
        } 
    System.out.println();
    }
       
    public boolean isGrafoCompleto(){
        for (int i = 0; i < lista.length - 1; i++) {
            Vertice aux = lista[i];
            for (int j = 0; j < lista.length - 1; j++) {
                while (aux != null) {
                    
                    aux = aux.prox;
                }
            }
        }
        return true;
    }
}
