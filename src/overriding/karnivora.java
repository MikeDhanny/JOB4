/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author Mikedhanny
 */
public class karnivora {
    public static void main(String[]args){
        System.out.println("<<<===== HEWAN DEFAULT =====>>>");
        hewan h = new hewan();
        h.setName();
        h.setSuara();
        h.setBerat();
        
        System.out.println("<<<===== HEWAN KUCING =====>>>");
        hewan k = new kucing();
        k.setName();
        k.setSuara();
        k.setBerat();
        
        System.out.println("<<<===== HEWAN SINGA =====>>>");
        hewan s = new singa();
        s.setName();
        s.setSuara();
        s.setBerat();
    }
}
