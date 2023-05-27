public class rooster extends Pets {

    public rooster(String claudio, String blanco_con_rojo, int i, String gallo) {
    }

    public rooster(String Name, String type, String race, int age, String vacuna) {
        super(Name, type, race, age, vacuna);
    }


    public String toString() {
        System.out.println("Name:"+getName());
        System.out.println("tipo:"+getType());
        System.out.println("raza:"+getRace());
        System.out.println("edad:"+getAge());
        System.out.println("vacuna:"+getVacuna());
        return "rooster{}";
    }
    public String talk(){
        return "El animal " + super.getName() + "Dice: Kikiriki";
    }
}
