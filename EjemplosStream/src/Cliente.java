public class Cliente {

    private String nombre;
    private String documento;
    private String genero;


    public Cliente(String nombre, String documento, String genero) {
        this.nombre = nombre;
        this.documento = documento;
        this.genero = genero;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDocumento() {
        return documento;
    }


    public void setDocumento(String documento) {
        this.documento = documento;
    }


    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

    

    
    
}