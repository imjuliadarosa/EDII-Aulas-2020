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
public class main {
    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();
        arvore.inserir(1);
        arvore.inserir(2);
        arvore.inserir(3);
        arvore.inserir(4);
        arvore.inserir(5);
        arvore.inserir(6);
        arvore.inserir(7);
        arvore.inserir(8);
        arvore.inserir(9);
        arvore.inserir(10);
        arvore.remover(10);
        explorar ex = new explorar(arvore);
        ex.caminhar();
    }
}
