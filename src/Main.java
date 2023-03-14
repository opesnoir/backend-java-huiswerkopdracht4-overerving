public class Main {
    public static void main(String[] args) {
        //initialisatie en attributen
        WaterPokemon hydro = new WaterPokemon("Hydro", 7, "bananas", "blub", "waterpokemon", 12.5, 10.9);
        FirePokemon fire = new FirePokemon("Fire", 8, "air", "knisper", "firepokemon", 80);
        FirePokemon burny = new FirePokemon("Burny", 8, "air", "knisper", "firepokemon", 120);
        GrassPokemon grassy = new GrassPokemon("Grassy", 12, "minerals", "whoos", "grasspokemon", 15.8);
        GrassPokemon greeny = new GrassPokemon("Greeny", 12, "minerals", "whoos", "grasspokemon", 60.98);
        ElectricPokemon bulb = new ElectricPokemon("Bulb", 9, "ligtheningstrips", "krak", "electricpokemon", false, true, false);
        ElectricPokemon windy = new ElectricPokemon("Windy", 9, "wind", "wind", "electricpokemon", false, false, true);

        System.out.println("Let's get to know some pokemon:");
        System.out.println("starting with: " + hydro.getName());
        hydro.nameType();
        hydro.eats();
        hydro.speaks();
        hydro.hp();
        hydro.xp();

        System.out.println("next up is: '" + fire.getName() + "', who is a level: " + fire.getLevel() + " pokemon");
        fire.nameType();
        fire.eats();
        fire.speaks();

        System.out.println("his cousin is named: '" + burny.getName() + "' he makes the following sound: " + burny.getSound());
        burny.nameType();
        burny.eats();
        burny.speaks();

        System.out.println("the following two pokemon, are: '" + grassy.getType() + "'. They go by the names: " + grassy.getName() + " and " + greeny.getName());
        grassy.nameType();
        grassy.eats();
        grassy.speaks();

        greeny.nameType();
        greeny.eats();

        System.out.println(grassy.getName() + " and " + greeny.getName() + " are followed by: '" + bulb.getName() + "' he is a true eye catcher, that is now at level: " + bulb.getLevel() );
        bulb.nameType();
        bulb.eats();
        bulb.speaks();

        System.out.println("at last, but not at least we have the gracious: " + windy.getName() + " she is a breath of fresh air ");
        windy.nameType();
        windy.eats();
        windy.speaks();
    }
}
