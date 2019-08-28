import java.util.*;

public class Libreria {

    private HashMap<Editorial, Integer> cantlibrosVendidos = new HashMap<Editorial, Integer>();

    public Libreria(){
    }


    public void venderLibro(Libro libro,Integer cantVendidos){

        cantlibrosVendidos.put( libro.geteditorial() ,cantVendidos);
    }

    public Editorial EditorialconMasVendido(){
        Editorial mayor = Editorial.LAALIANZA;
        int integer = 0;
        for(Map.Entry<Editorial, Integer> edit: cantlibrosVendidos.entrySet() ){
            if( edit.getValue()> integer){
                mayor = edit.getKey();
            }
        }
        return mayor;
    }

}

