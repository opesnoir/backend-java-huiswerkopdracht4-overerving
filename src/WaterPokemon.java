public class WaterPokemon extends Pokemons {
    private double hp; //(health points)
    private double xp; //(experience points)

    public WaterPokemon (){
    }

    public WaterPokemon(double hp, double xp) {
        this.hp = hp;
        this.xp = xp;
    }

    public WaterPokemon(String name, int level, String food, String sound, String type, double hp, double xp) {
        super(name, level, food, sound, type);
        this.hp = hp;
        this.xp = xp;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats " + getFood());
    }
    @Override
    public void speaks() {
        System.out.println(getName() + " makes the sound: " + getSound());
    }

    public void hp(){
        System.out.println(getName() + " has the following health points: " + hp);
    }
    public void xp(){
        System.out.println(getName() + " has the following experience points: " + xp);
    }
}
