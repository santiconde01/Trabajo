import java.util.HashMap;

public class Libro {

    private Editorial editorial;
    private int precio;


    public Libro(Editorial edit, int prec){
        editorial=edit;
        precio=prec;
    }


    public Editorial geteditorial(){
        return this.editorial;
    }


}


