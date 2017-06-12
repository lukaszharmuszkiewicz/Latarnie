/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latarnie;

/**
 *
 * @author Lenovo
 */
public class Pole {
    Integer latarnia;
    Integer pole;
    boolean pokryte;

    public Pole(Integer latarnia, Integer pole, boolean pokryte) {
        this.latarnia = latarnia;
        this.pole = pole;
        this.pokryte = pokryte;
    }

    public Integer getLatarnia() {
        return latarnia;
    }

    public void setLatarnia(Integer latarnia) {
        this.latarnia = latarnia;
    }

    public Integer getPole() {
        return pole;
    }

    public void setPole(Integer pole) {
        this.pole = pole;
    }

    public boolean isPokryte() {
        return pokryte;
    }

    public void setPokryte(boolean pokryte) {
        this.pokryte = pokryte;
    }

   
   
    
    
    
}
