
import Calculator.Entities.Rectangulo;
import Calculator.Services.RectanguloServices;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ajruiz
 */
public class RectanguloTest {
    
    RectanguloServices rs;
    
    public RectanguloTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        rs = new RectanguloServices();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void deberiaInicializarConColor(){
        assertNotNull(new Rectangulo(10,10).getColor());
    }
    
    @Test
    public void deberiaInicializarConColorRojo(){
        assertEquals(new Rectangulo(10,10).getColor(),"Rojo");
    }
    
    @Test
    public void deberiaCalcularArea(){
        assertEquals(100, rs.calcularArea(new Rectangulo(10,10)),0);
        assertEquals(6, rs.calcularArea(new Rectangulo(3,3)),0);
        assertEquals(10, rs.calcularArea(new Rectangulo(1,10)),0);
    }
    
    @Test
    public void deberiaCalcularPerimetro(){
        assertEquals(40, rs.calcularPerimetro(new Rectangulo(10,10)),0);
    }
}
