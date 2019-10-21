package Logica;

import javax.swing.ImageIcon;

/**
 *
 * @author Mateo
 */
public class Duende extends Personaje {

    public Duende() {
        super.setHilo(24, 18, 15, 12, 50);
        super.ancho = 587;
        super.alto = 556;
        super.relacion = true;
        super.caminar = new ImageIcon[24];
        super.saltar = new ImageIcon[18];
        super.morir = new ImageIcon[15];
        super.atacar = new ImageIcon[12];
    }
}
