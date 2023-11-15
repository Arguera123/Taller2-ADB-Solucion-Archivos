package entities;

public class Empleado {
    String carnet;
    String nombre;
    String correo;
    int id_tipo_empleado;

    public Empleado() {

    }

    public Empleado(String carnet, String nombre, String correo) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Empleado(String carnet, String nombre, String correo, int id_tipo_empleado) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.correo = correo;
        this.id_tipo_empleado = id_tipo_empleado;
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

    public int getId_tipo_empleado() {
        return id_tipo_empleado;
    }

    public void setId_tipo_empleado(int id_tipo_empleado) {
        this.id_tipo_empleado = id_tipo_empleado;
    }

    @Override
    public String toString() {
        return "INSERT INTO EMPLEADO (CARNET, NOMBRE, CORREO, ID_TIPO_EMPLEADO) VALUES('" +
                carnet + "', '" +
                nombre + "', '" +
                correo + "', " +
                id_tipo_empleado + ");";
    }
}
