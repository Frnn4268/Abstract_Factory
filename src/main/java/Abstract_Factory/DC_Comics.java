package Abstract_Factory;

public abstract class DC_Comics {
    private String Nombre;
    
    public DC_Comics(String Nombre){
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
