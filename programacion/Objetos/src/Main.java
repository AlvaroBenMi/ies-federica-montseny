public class Main {

    public static void main(String[] args) {
        Alumno mikel = new Alumno("Mikel", "San Vicente", "1º DAM", 39);

        Alumno raul = new Alumno("Raul", "Albarran");

        Alumno alumno = new Alumno();

        mikel.saluda();
        raul.saluda();
        alumno.saluda();

        System.out.println("La edad de Raul es: " + raul.getEdad());
//        System.out.println(mikel.nombre);

        Telefono iphone = new Telefono("Iphone", 1000);
        Telefono motorola = new Telefono("MotoG", 1000, 5 );
    }
}
