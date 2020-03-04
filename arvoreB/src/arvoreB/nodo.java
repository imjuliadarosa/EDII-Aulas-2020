/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvoreB;

/**
 *
 * @author julia.rosa
 */
public class nodo extends raiz {
    nodo pai;
    int dado;
    
    public nodo(){
        
    }
    public nodo(nodo pai, int dado){
        this.pai=pai;
        this.dado=dado;
    }
    
}
