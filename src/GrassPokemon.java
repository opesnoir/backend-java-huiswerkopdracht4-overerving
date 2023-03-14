public class GrassPokemon extends Pokemons {
    //variabelen
    double height;

    //constructors
    public GrassPokemon() {
    }

    public GrassPokemon(String name, int level, String food, String sound, String type) {
        super(name, level, food, sound, type);
    }

    public GrassPokemon(String name, int level, String food, String sound, String type, double height) {
        super(name, level, food, sound, type);
        this.height = height;
    }

    //methodes
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //abstract methods
    @Override
    public void eats() {
        if (height < 10.5){
            System.out.println(getName() + " is " + getHeight() + "cm tall, and he takes up water and minerals from the ground");
        } else if ( height > 10.5 && height < 30.5  ) {
            System.out.println(getName() + " is "+ getHeight() + " cm tall, and he takes up water, minerals from the ground and the leaves take up small amounts of carbon dioxide");
        } else if (height > 30.5) {
            System.out.println(getName() + " is "+ getHeight() + " cm tall, and he takes up water, minerals and the leaves take up large amounts of carbon dioxide");
        }
    }

    @Override
    public void speaks() {
        System.out.println(getName() + " makes a whoos sound");
    }
}
