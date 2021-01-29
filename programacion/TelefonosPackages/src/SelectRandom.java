import java.util.Random;

public class SelectRandom {
    public static void main(String[] args) {
        Random r = new Random(System.currentTimeMillis());

        String[] alumnos = {
                "Cristina Palacios Vallejo",
//                "Alberto Benito Molina",
                "Jorge De Paz",
                "Alejandro Gómez Fuentes",
                "Alejandro Pardal García",
                "Alejandro Herrero López-Pintor",
//                "Álvaro    Redondo Pérez",
                "Álvaro    Benito Millán",
//                "Carlos José Martínez Blanco",
                "Christian Nicolas Fernández Calderón",
                "Christian Mengibar Castillo",
                "David Pato López",
                "David González San José",
                "Gabriel Juan López Pinedo",
                "Jaime Rodríguez Gutírrez",
                "Jesús Pérez Guerrero",
//                "Julián    Jiménez Guerrero",
                "Julián    Fernández Serrano",
                "Michael Obinna    Ezeh Ero",
//                "Michal    Homenda",
//                "Miguel    Sáchez Muñoz",
                "Miguel Ángel Girona Gómez",
                "Pablo Portela Mulero",
                "Patricia Delgado Hernández",
//                "Raúl Albarrán Regueiro",
//                "Roberto Fernández Deboso",
                "Rubén Martín Sánchez",
                "Sandra Ballestero Ávila",
                "Sergio    Gil Fernández",
                "Teodor Andrei Mardale"
        };

        int i = r.nextInt(alumnos.length);
        System.out.println("Total alumnos: " + alumnos.length);
        System.out.println(alumnos[i]);
    }
}
