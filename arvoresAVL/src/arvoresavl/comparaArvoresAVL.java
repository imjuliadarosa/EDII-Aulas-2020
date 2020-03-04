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
public class comparaArvoresAVL {
    protected ArvoreAVL arvoreA;
    protected ArvoreAVL arvoreB;

    public comparaArvoresAVL() {
    }

    public comparaArvoresAVL(ArvoreAVL arvoreA, ArvoreAVL arvoreB) {
        this.arvoreA = arvoreA;
        this.arvoreB = arvoreB;
    }
    public boolean comparaArvores(ArvoreAVL arvoreA, ArvoreAVL arvoreB){
        if(arvoreA.raiz.getChave()==arvoreB.raiz.getChave()){
            ArvoreAVL auxA, auxB;
            auxA = new ArvoreAVL(arvoreA.raiz.getDireita());
            auxB = new ArvoreAVL(arvoreB.raiz.getDireita());
            boolean D = comparaArvores(auxA,auxB);
            auxA = new ArvoreAVL(arvoreA.raiz.getEsquerda());
            auxB = new ArvoreAVL(arvoreB.raiz.getEsquerda());
            boolean E = comparaArvores(auxA,auxB);
            return D && E;
        }else{
            return false;
        }
    }
}
