/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoresavl;

/**
 *
 * @author julia.rosa
 */
public class binariaAVL {
    protected No raiz;

    public binariaAVL() {
    }

    public binariaAVL(No raiz) {
        this.raiz = raiz;
    }
    
    public boolean verificaBinaria(No raiz){
        int alturaD = 0;
        int alturaE = 0;
        alturaD = contarAltura(raiz.getDireita());
        alturaE = contarAltura(raiz.getEsquerda());
        if((alturaD-alturaE)==-2){
            return false;
        }else if((alturaE-alturaD)==-2){
            return false;
        }else{
            return true;
        }
    }
    public int contarAltura(No atual) {
        if(atual == null)  return 0;
        else return ( 1 + maior(contarAltura(atual.getEsquerda()), contarAltura(atual.getDireita())));
   }

    private int maior(int A, int B) {
        if(A>B){
            return A;
        }else{
            return B;
        }
    }
}
