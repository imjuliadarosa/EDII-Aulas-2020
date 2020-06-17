package listadeadjacencia;
import java.util.Scanner;
public class main {
    public static void main (String args[]){
        Scanner read = new Scanner(System.in);
        System.out.print("Lista de Adjacencia.\nInforme quantidade de vertices: ");
        int vertices = Integer.parseInt(read.nextLine());
        System.out.print("Informe se deseja que seu grafo ser direcionada[0] ou não[1]: ");
        int dir = Integer.parseInt(read.nextLine());
        if(dir==0){
            
        }
        System.out.println("Informe se o grafo é ponderado[0] ou não[1]: ");
            //informe peso das arestas





        /*
        ListaAdjacencia lista = new ListaAdjacencia(5);
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
        */
    }

    public void menu(){
        System.out.print("Menu\nSelecione uma opção:\n[1] Inserir arestas\n[2] Remover arestas\n[3] Obter a lista de adjacências de um determinado vértice\n[4] Verificar se a lista de adjacentes de um vértice está vazia\n[5] Gerar matriz\n[6] Verifica se existe uma aresta para cada par de vértices distintos de G.\n [7] Busca em largura\n[8] Busca em Profundidade\n Sua escolha:");
    }

}
