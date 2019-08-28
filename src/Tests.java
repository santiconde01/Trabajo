import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Tests {

    @Test
    void ejemploATest(){

        Editorial e2 = Editorial.LAALIANZA;
        Editorial e3 = Editorial.ELATENEO;
        Libreria libre = new Libreria();
        Libro l1 = new Libro(Editorial.LAALIANZA, 23);

    libre.venderLibro( l1, 3 );

    libre.EditorialconMasVendido();


        assertEquals( Editorial.LAALIANZA == e3);
    }


}
