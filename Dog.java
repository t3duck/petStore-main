public class Dog extends Pets{
    public Dog(String firulais, String manchado, int i, String perro) {
    }

    public Dog(String Name, String type, String race, int age, String vacuna) {
        super(Name, type, race, age, vacuna);
    }

    public String toString() {
        System.out.println("Name:"+getName());
        System.out.println("tipo:"+getType());
        System.out.println("raza:"+getRace());
        System.out.println("edad:"+getAge());
        System.out.println("vacuna:"+getVacuna());
        return "Dog{}";
    }

    public String talk(){
        return "El animal " + super.getName() + "Dice: Guau";
    }


}
