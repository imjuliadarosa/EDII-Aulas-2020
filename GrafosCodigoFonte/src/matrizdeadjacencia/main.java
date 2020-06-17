package matrizdeadjacencia;

public class main {
    public static void main (String args[]){
    MatrizAdjacencia matriz = new MatrizAdjacencia(4);
    matriz.mostrarMatriz();
    matriz.inserirArestaDire(1, 2);
    matriz.mostrarMatriz();
    matriz.removerAresta(1, 2);
    matriz.mostrarMatriz();
    }
    public void menu(){
        System.out.print("Menu\nSelecione uma opção:\n[1] Inserir arestas\n[2] Remover arestas\n[3] Obter a lista de adjacências de um determinado vértice\n[4] Verificar se a lista de adjacentes de um vértice está vazia\n[5] Gerar matriz\n[6] Verifica se existe uma aresta para cada par de vértices distintos de G.\n [7] Busca em largura\n[8] Busca em Profundidade\n Sua escolha:");
    }

}
