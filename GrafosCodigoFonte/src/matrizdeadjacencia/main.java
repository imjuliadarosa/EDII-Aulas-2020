/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrizdeadjacencia;

/**
 *
 * @author julia.rosa
 */
public class main {
    public static void main (String args[]){
    MatrizAdjacencia matriz = new MatrizAdjacencia(4);
    matriz.mostrarMatriz();
    matriz.inserirArestaDire(1, 2);
    matriz.mostrarMatriz();
    matriz.removerAresta(1, 2);
    matriz.mostrarMatriz();
    }
}
