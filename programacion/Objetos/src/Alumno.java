public class Alumno {
    private String nombre;
    private String apellidos;
    private String curso;
    private int edad;

    public Alumno(String nombre, String apellidos, String curso, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.curso = curso;
        this.edad = edad;
    }

    public Alumno(String nombre, String apellidos) {
        this(nombre, apellidos, "No especificado", 18);
    }

    public Alumno() {
        this("No especificado", "No especificado");
    }

    public void saluda() {
        System.out.println("Hola soy " + nombre + " " + apellidos + " del curso " + curso + " y tengo " + edad);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
