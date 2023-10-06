package com.mycompany.calculatorjenkinsej03;

import Calculator.Entities.Rectangulo;
import Calculator.Services.RectanguloServices;

/**
 *
 * @author ajruiz
 */
public class CalculatorJenkinsEj03 {

    public static void main(String[] args) {
        System.out.println("<-- .Rectangulo Calculator. -->");

        RectanguloServices rs = new RectanguloServices();
        Rectangulo r = new Rectangulo(2, 6);

        System.out.println("\nAncho= " + r.getAncho() + "\nLargo= " + r.getLargo()
                + "\nColor= " + r.getColor());

        System.out.println("\n-Area= " + rs.calcularArea(r) + "\n-Perimetro= " + rs.calcularPerimetro(r));
    }
}
