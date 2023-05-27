public class Cat extends Pets{

    public Cat(String garfield, String naranja, int i, String gato) {
    }

    public Cat(String Name, String type, String race, int age, String vacuna) {
        super(Name, type, race, age, vacuna);
    }

    public String toString() {
        System.out.println("Name"+getName());
        System.out.println("tipo:"+getType());
        System.out.println("raza:"+getRace());
        System.out.println("edad:"+getAge());
        System.out.println("vacuna:"+getVacuna());
        return "Cat{}";
    }
    public String talk(){
        return "El animal " + super.getName() + "Dice: Miauugo";
    }
}
