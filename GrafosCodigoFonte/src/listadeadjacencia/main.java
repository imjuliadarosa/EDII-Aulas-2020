package listadeadjacencia;

public class main {
    public static void main (String args[]){
        //Criação do grafo
        ListaAdjacencia lista = new ListaAdjacencia(5);
        
        lista.inserirArestaDire(0, 1);
        lista.inserirArestaDire(2, 1);
        lista.inserirArestaDire(2, 0);
        lista.inserirArestaDire(2, 3);
        
        System.out.println("Lista Preenchida Direcionada.");
        lista.mostrarLista();
        
        /*
        
        
        lista.inserirArestaDire(0, 1);
        lista.inserirArestaDire(0, 2);
        lista.inserirArestaDire(0, 3);
        lista.inserirArestaDire(1, 0);
        lista.inserirArestaDire(1, 2);
        lista.inserirArestaDire(1, 3);
        lista.inserirArestaDire(2, 1);
        lista.inserirArestaDire(2, 0);
        lista.inserirArestaDire(2, 3);
        lista.inserirArestaDire(3, 0);
        lista.inserirArestaDire(3, 1);
        lista.inserirArestaDire(3, 2);
        
        
        
        System.out.println("Lista do Vertice 2: ");
        lista.mostrarListaVertice(2);
        
        
        System.out.println("Lista de Adjacencia:");             
        lista.mostrarLista();
        lista.setMatrizIncidenciafromListaAdjacencia();
        System.out.println("Matriz de Incidencia:"); 
        lista.mostrarMatrizIncidencia();
        
        System.out.println("Verifica se vertice está vazio, retorna true se estiver vazia.");
        System.out.println("Vertice verificado: 3 ");
        System.out.println("Retorno: "+lista.isVerticeVazio(3));
        
        System.out.println("Verifica se grafo é completo, retorna true se for completo.");
        System.out.println("Retorno: "+lista.isGrafoCompleto());
        */
        
        
        
    }

}
