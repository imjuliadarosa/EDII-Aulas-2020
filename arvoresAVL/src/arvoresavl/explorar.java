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
public class explorar {
    protected ArvoreAVL arvore;

    public explorar() {
    }

    public explorar(ArvoreAVL arvore) {
        this.arvore = arvore;
    }
    
    public void consulta (No nodo, int Nivel){
        if(nodo==null)
            return;
        else
            System.out.println("Nivel "+Nivel+": "+nodo.getChave());
        consulta(nodo.getDireita(),Nivel+1);
        consulta(nodo.getEsquerda(),Nivel+1);
    }
    
    public void caminhar(){
        System.out.println("Raiz: "+arvore.raiz.getChave());
        System.out.println("Subarvore á Direita: ");
        consulta(arvore.raiz.getDireita(),1);
        System.out.println("Subarvore á Esquerda: ");
        consulta(arvore.raiz.getEsquerda(),1);
    }
    
}
