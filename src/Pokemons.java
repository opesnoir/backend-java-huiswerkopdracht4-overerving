
//abstracte class Pokemons
public abstract class Pokemons {

    //variabelen
    private String name;
    private int level;
    private String food;
    private String sound;
    private String type;

    //constructors
    //lege constructor
    public Pokemons(){
    }

    //gevulde constructor
    public Pokemons(String name, int level, String food, String sound, String type) {
        this.name = name;
        this.level = level;
        this.food = food;
        this.sound = sound;
        this.type = type;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //methoden
    public void nameType(){
        System.out.println(name + " is a " + type);
    }

    //abstracte methoden
    public abstract void eats();
    public abstract void speaks();

}
