/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspratikum1;

/**
 *
 * @author Mikedhanny
 */
class Laki_Laki extends Manusia{
   

public Laki_Laki(double TB){
        this.Tinggibadan=TB;
    }
    @Override
    public double htgbbi(){
        return ((Tinggibadan - 100) - ((Tinggibadan - 100) * 10/100));
        
    }
}
