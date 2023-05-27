public class PetStore {
    public static void main(String[] args) {
        Cat Garfield = new Cat("Garfield", "Naranja", 5, "Gato");
        Dog Firulais = new Dog("Firulais", "Manchado", 3, "Perro");
        rooster Claudio = new rooster("Claudio", "Blanco con rojo", 1, "Gallo");
        System.out.println("Ejemplo de polimorfismo: ");
        System.out.println(Garfield.talk());
        System.out.println(Firulais.talk());
        System.out.println(Claudio.talk());
    }


}
