package test;

public class Test {

    public static void main(String[] args) {
        
        int resultado =0;
        //try+Ctr+Espacio (autocompleta estructura)
        try { //aquí meto la excepción
            resultado = 10 / 0;
        } catch (Exception e) { //atajo -> pst
            e.printStackTrace(System.out);
        }
        
        
    }
}
