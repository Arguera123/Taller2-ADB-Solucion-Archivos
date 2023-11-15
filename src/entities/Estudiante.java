package entities;

public class Estudiante {
    String carnet;
    String nombre;
    String correo;

    public Estudiante(){

    }

    public Estudiante(String carnet, String nombre, String correo) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "INSERT INTO ESTUDIANTE (CARNET, NOMBRE, CORREO) VALUES('" +
                carnet + "', '" +
                nombre + "', '" +
                correo + "');";
    }


}
