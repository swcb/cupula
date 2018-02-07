/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Willian, Andre e Patrick.
 */

public class Cupula {
    
    Espaco[][] cupula;
    
    
    // Construtor. Cria uma cupula m x m vazia.
    public Cupula (int m) {
        cupula = new Espaco[m][m];
    }   
    
        // Construtor. Cria uma cupula m x m 
        // com elementos espalhados randomicamente.
    public Cupula (int m, int ard, int arma, int escu) {
        cupula = new Espaco[m][m];
        inserirRandom (ard, arma, escu);
    }   
    
    public void inserirRandom (int armadilha, int arma, int escudo) {
        // codigo referente a insersão randomica
    }
    
}
