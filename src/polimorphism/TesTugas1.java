/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphism;

/**
 *
 * @author Mikedhanny
 */
public class TesTugas1 {
    public static void main (String args[]){
        RerataNilai rn = new RerataNilai();
        System.out.println("Rerata Nilai 21 dan 13 adalah :"+rn.avarage(21, 13));
        System.out.println("Rerata Nilai 19.3 dan 39.5 adalah :"+rn.avarage(19.3, 39.5));
        System.out.println("Rerata Nilai 123,574 dan 744 adalah :"+rn.avarage(123, 574, 744));
    }
}
