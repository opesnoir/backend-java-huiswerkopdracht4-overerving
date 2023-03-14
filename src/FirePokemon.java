//VRAAG: ik heb hier geen getters en setters, desondanks werkt de code, dat snap ik niet zo goed.

public class FirePokemon extends Pokemons {

    //variabelen
    int fireTemp;

    //constructors
    public FirePokemon(){
    }

    public FirePokemon(int fireTemp) {
        this.fireTemp = fireTemp;
    }

    public FirePokemon(String name, int level, String food, String sound, String type, int fireTemp) {
        super(name, level, food, sound, type);
        this.fireTemp = fireTemp;
    }

    //abstract methoden
    @Override
    public void eats() {
        if (fireTemp < 100){
        System.out.println(getName() + " eats " + getFood());
        } else if (fireTemp > 100) {
            System.out.println(getName() + " eats everything on its path");
        }
    }

        @Override
    public void speaks() {
        if (fireTemp < 100) {
            System.out.println(getName() + " makes a crackling sound");
        } else if (fireTemp > 100) {
            System.out.println(getName()+ " makes a roaring or rushing sound");
        }
    }
}
