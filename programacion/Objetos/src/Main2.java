public class Main2 {

    public static void main(String[] args) {
        Persona mikel = new Persona("mikel", "san Vicente", "56543545875", 30);
        mikel.saluda();
        mikel.despedida();
        mikel.setEdad(39);

        System.out.println(mikel.getEdad());
    }
}
