

package Calculator.Services;

import Calculator.Entities.Rectangulo;

/**
 *
 * @author ajruiz
 */
public class RectanguloServices {

    public double calcularArea(Rectangulo r) {
        return r.getAncho()*r.getLargo();
    }

    public double calcularPerimetro(Rectangulo r) {
        return (r.getAncho()+r.getLargo())*2;
    }
    
}
