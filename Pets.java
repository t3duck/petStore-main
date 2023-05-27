public class Pets {

    private String Name;
    private String Type;
    private String Race;
    private int Age;
    private String Vacuna;



    public Pets() {

    }

    public Pets(String Name,String type, String race, int age, String vacuna) {
        this.Type = type;
        this.Race = race;
        this.Age = age;
        this.Vacuna = vacuna;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getRace() {
        return Race;
    }

    public void setRace(String race) {
        Race = race;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getVacuna() {
        return Vacuna;
    }

    public void setVacuna(String vacuna) {
        Vacuna = vacuna;
    }

    public String talk(){
        String s = "El animal " + this.getName() + "dice: ";
        return s;

    }
}
