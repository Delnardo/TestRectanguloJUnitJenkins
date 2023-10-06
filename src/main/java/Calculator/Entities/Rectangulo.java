/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator.Entities;

/**
 *
 * @author ajruiz
 */
public class Rectangulo {
    
    private double Largo;
    private double Ancho;
    private String Color;
    private boolean Active;

    //Constructores
    public Rectangulo() {
    }

    public Rectangulo(double Largo, double Ancho) {
        this.Largo = Largo;
        this.Ancho = Ancho;
        this.Color = "Rojo";
        this.Active = true;
    }
    
    

    public double getLargo() {
        return Largo;
    }

    public void setLargo(double Largo) {
        this.Largo = Largo;
    }

    public double getAncho() {
        return Ancho;
    }

    public void setAncho(double Ancho) {
        this.Ancho = Ancho;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean Active) {
        this.Active = Active;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "Largo=" + Largo + ", Ancho=" + Ancho + ", Color=" + Color + ", Active=" + Active + '}';
    }
    
    
    
    
}
