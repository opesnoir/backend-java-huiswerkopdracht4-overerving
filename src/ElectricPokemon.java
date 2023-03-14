public class ElectricPokemon extends Pokemons {
    //variabelen
    boolean solar;
    boolean gas;
    boolean wind;

    //constructs
    public ElectricPokemon() {
    }

    public ElectricPokemon(String name, int level, String food, String sound, String type, boolean solar, boolean gas, boolean wind) {
        super(name, level, food, sound, type);
        this.solar = solar;
        this.gas = gas;
        this.wind = wind;
    }

    //getters and setters
    public boolean isSolar() {
        return solar;
    }

    public void setSolar(boolean solar) {
        this.solar = solar;
    }

    public boolean isGas() {
        return gas;
    }

    public void setGas(boolean gas) {
        this.gas = gas;
    }

    public boolean isWind() {
        return wind;
    }

    public void setWind(boolean wind) {
        this.wind = wind;
    }

    //abstracte methoden
    @Override
    public void eats() {
        switch (getFood()){
            case "solar":
                if (solar){
                    System.out.println(getName() + " eats sunrays");
                }
                break;
            case "gas":
                if (gas){
                    System.out.println(getName() + " eats gasfumes");
                }
                break;
            case "wind":
                if (wind){
                    System.out.println(getName() + " eats fresh air");
                }
                break;
            default:
                System.out.println(getName() + " is on a diet");
        }
    }

    @Override
    public void speaks() {
        switch (getSound()){
            case "solar":
                if (solar){
                    System.out.println(getName() + "  makes no sound");
                }
                break;
            case "gas":
                if (gas){
                    System.out.println(getName() + " makes a gas sound");
                }
                break;
            case "wind":
                if (wind){
                    System.out.println(getName() + " makes a blowing sound");
                }
                break;
            default:
                System.out.println(getName() + " makes an unknown sound");
        }
    }
}
