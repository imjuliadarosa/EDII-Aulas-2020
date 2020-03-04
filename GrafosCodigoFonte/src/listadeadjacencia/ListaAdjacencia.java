/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadeadjacencia;

/**
 *
 * @author julia.rosa
 */
public class ListaAdjacencia {
    /* 
        Declaracçao do vertice; 
    */
    public class vertice{
        public int num;
        public vertice prox;
    }
    /*
        Declaraçao do Vetor
        Declaraçao da Lista Encadeda de Vertíces
        Juntos formam o grafo que é composto por um vetor de listas encadeadas
    */
    public vertice listaAdj[];
    public int qtdVertices;
    
    /*
        Construtor do metodos
    */
    public ListaAdjacencia(int qtdVertices){
        this.qtdVertices=qtdVertices;
        listaAdj = new vertice[qtdVertices];
    }
    
    /*
        Metodo de inserção de Aresta Direcionada
        Adciona um vertice na lista encadeada na posição indicada na listaAdj.
    */
    
    public void inserirArestaDire(int origem, int destino){
        vertice inserido = new vertice();
        inserido.num=destino;
        inserido.prox=listaAdj[origem];
        listaAdj[origem]=inserido;
    }
    /*
        Metodo de inserção de Aresta Não Direcionada
        Adciona um vertice na lista encadeada na posição indicada na listaAdj.
    */
    public void inserirAresta(int origem, int destino){
        vertice inserido = new vertice();
        inserido.num=destino;
        inserido.prox=listaAdj[origem];
        listaAdj[origem]=inserido;
        
        vertice novo = new vertice();
        novo.num = origem;
        novo.prox=listaAdj[destino];
        listaAdj[destino]=novo;
    }
    
    /*
        Metodo de remoção
        Remove um vertice na lista encadeada na posição indicada na listaAdj.
    */
    
    public void removerAresta(int origem, int destino){
       vertice aux = listaAdj[origem];
       vertice anterior = new vertice();
       if(aux!=null){
        while(aux!=null){
            if(aux.num == destino){
                
                if(aux==listaAdj[origem]){
                    //é a primeiro aresta
                    listaAdj[origem]=aux.prox;
                    aux=listaAdj[origem];
                    break;
                                   
                }else if(aux.prox==null){
                    //é a ultima aresta
                    anterior.prox=null;
                    break;
                    
                }else{
                    //é uma aresta entre arestas
                    anterior.prox=aux.prox;
                    break;
                }
            }
            anterior=aux;
            aux=aux.prox;
        }
       }
        
    }
    
    /*
        Obter a lista de adjacências de um determinado vértice
    */
    public void mostrarListaVertice(int vertice){
        vertice aux = listaAdj[vertice];
        System.out.print(" "+vertice+" -> ");
            while(aux!=null){
                System.out.print(" "+aux.num+" ; ");
                aux=aux.prox;
            }
            System.out.println();
    }
    /*
        Metodo de exibição da lista completa
    */
    public void mostrarLista(){
    for(int i = 0; i<qtdVertices-1;i++){
            System.out.print(" "+i+" -> ");
            vertice aux = listaAdj[i];
            while(aux!=null){
                System.out.print(" "+aux.num+" ; ");
                aux=aux.prox;
            }
            System.out.println();
        }
    }
    
    /*
        Verificar se a lista de adjacentes de um vértice está vazia. Retorna true se a lista de adjacentes está vazia
    */
    public boolean isVerticeVazio(int vertice){
        vertice aux = listaAdj[vertice];
        return aux == null;
    }
    
    public vertice[] getLista(){
        return this.listaAdj;
    }
    public int getQtdVertices(){
        return this.qtdVertices;
    }
    
    public void buscaLargura ( int buscado){
        int[] controle = new int[listaAdj.length];
        for(int j = 0;j<controle.length-1;j++){
            controle[j]=0;
        }
        int i = 0;
        while(listaAdj[i]!=null){
            
            
            vertice aux = listaAdj[i];
            controle[i]++; // marcado acesso ao vertice
            System.out.println("EM: "+i+" "); // vertice
            
            while(aux!=null){
                
                System.out.println("Aresta " + aux.num + " ; "); //aresta
                
                if(aux.num==buscado){
                    System.out.println("Encontrado");
                }
                
                aux=aux.prox;
            }
            i++;
        }
    }
    
    public void buscaProfundidade (int buscado){
        
        for(int i = 0; i<=listaAdj.length-1;i++){
            //em da vertice
            vertice aux = listaAdj[i];
            System.out.println("EM: "+i+" ");
            while(aux!=null){
                //em cada aresta
                System.out.println("Verificado " + aux.num + " ; ");
                if(aux.num==buscado){
                    System.out.println("Encontrado");
                }
                aux=aux.prox;
            }
        }
    }

    private int MatrizIncidenciaqtdVertices = 0;//coluna
    private int MatrizIncidenciaqtdArestas = 0;  //linha
    private int[][] G;
    
    /*
        Metodo que Transforma uma Lista de Adjacencia em uma Matriz de Incidencia
    */
    
    public void setMatrizIncidenciafromListaAdjacencia(){
        int Arestas = 0;
        for(int i = 0; i<listaAdj.length-1;i++){
            vertice aux = listaAdj[i];
            while(aux!=null){
                Arestas++;
                aux=aux.prox;
            }
        }
        int[][] Matriz = new int[Arestas][listaAdj.length-1];
        for(int i = 0; i<listaAdj.length-1;i++){
            vertice aux = listaAdj[i];
            for(int j = 0; j<Arestas-1;j++){
                if(aux!=null){
                    Matriz[j][i]=1;
                    aux=aux.prox;
                }
            }
        }
        this.G=Matriz;
        this.MatrizIncidenciaqtdArestas=Arestas;
        this.MatrizIncidenciaqtdVertices=listaAdj.length-1;
    }
    
    public void mostrarMatrizIncidencia(){
        for(int i=0; i<MatrizIncidenciaqtdArestas;i++){
            for(int j=0; j<MatrizIncidenciaqtdVertices;j++){
                System.out.print(" "+G[i][j]+" |");
            }
            System.out.println();
        } 
        System.out.println();
    }
    
    /* GrafoCompleto: Verifica se existe uma aresta para cada par de vértices 
    distintos de G. A função retorna true caso o Grafo seja completo, 
    senão retorna false*/
    
    
    public boolean isGrafoCompleto(){
        for (int i = 0; i < listaAdj.length - 1; i++) {
            vertice aux = listaAdj[i];
            for (int j = 0; j < listaAdj.length - 1; j++) {
            while (aux != null) {
                
                aux = aux.prox;
            }
            }
        }
        return true;
    }
    
    

}
