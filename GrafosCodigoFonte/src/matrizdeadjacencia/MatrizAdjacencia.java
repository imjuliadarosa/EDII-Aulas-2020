package matrizdeadjacencia;

public class MatrizAdjacencia {
    
    private int qtdVertices = 0;
    private int[][] G;
    
    /*
       Construtor da Classe sem atributos
    */
    public MatrizAdjacencia(){
        int [][]G = new int[qtdVertices][qtdVertices];
        for(int i=0; i<=qtdVertices;i++){
            for(int j=0; j<=qtdVertices;j++){
                G[i][j]=0;
            }
        } 
    }
     /*
       Construtor da Classe com 1 atributos
    */
    public MatrizAdjacencia(int qtdVertices){
        this.qtdVertices = qtdVertices;
        G = new int[qtdVertices][qtdVertices];
        for(int i=0; i<qtdVertices;i++){
            for(int j=0; j<qtdVertices;j++){
                G[i][j]=0;
            }
        }
    }
     /*
       Construtor da Classe com 2 atributos
    */
    public MatrizAdjacencia(int qtdVertices, int[][] G) {
        this.qtdVertices = qtdVertices;
        this.G = G;
    }
    /*
        Metodo de insersão direcionado
    */
    public void inserirArestaDire( int origem, int destino){
            G[origem][destino]=1;
    }
    /*
        Metodo de insersão não direcionado
    */
    public void inserirAresta( int origem, int destino){
            G[origem][destino]=1;
            G[destino][origem]=1;
    }
    /*
        Metodo de remoção 
    */
    public void removerAresta(int origem, int destino){
        G[origem][destino]=0;
    }
    
    /*
        Obter a lista de adjacências de um determinado vértice
    */
    
     public void mostrarMatrizVertice(int vertice){
         for(int j=0; j<qtdVertices;j++){
                System.out.print(" "+G[vertice][j]+" |");
            }
     }
    
    /*
        Metodo de exibição da lista completa
     */
    
    public void mostrarMatriz(){
        for(int i=0; i<qtdVertices;i++){
            for(int j=0; j<qtdVertices;j++){
                System.out.print(" "+G[i][j]+" |");
            }
            System.out.println();
        } 
        System.out.println();
    }
    
}
