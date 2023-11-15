package filemanagement;

import entities.*;
import java.io.*;

public class FileManagement {
    public static void procesFile(String fileName) {
        Estudiante estudiante;
        Empleado empleado;
        File file = new File(fileName);
        try {
            var entrance = new BufferedReader(new FileReader(file));
            var reading = entrance.readLine();
            while (reading != null) {
                String[] sectionLine = reading.split(";");
                if (sectionLine[1].equals("Estudiante")) {
                    estudiante = new Estudiante(sectionLine[2], sectionLine[0], sectionLine[3]);
                    writeFileEstudiante("Estudiantes.sql", estudiante);
                } else {
                    empleado = new Empleado(sectionLine[2], sectionLine[0], sectionLine[3]);
                    switch (sectionLine[1]) {
                        case "Administrativo" -> empleado.setId_tipo_empleado(0);
                        case "Coordinador" -> empleado.setId_tipo_empleado(1);
                        case "Docente" -> empleado.setId_tipo_empleado(2);
                        default -> empleado.setId_tipo_empleado(3);
                    }
                    writeFileEmpleado("Empleados.sql", empleado);
                }
                reading = entrance.readLine();
            }

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void writeFileEstudiante(String fileName, Estudiante estudiante) {
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file, true));
            output.println(estudiante);
            output.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void writeFileEmpleado(String fileName, Empleado empleado) {
        File file = new File(fileName);
        try {
            PrintWriter output = new PrintWriter(new FileWriter(file, true));
            output.println(empleado);
            output.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
