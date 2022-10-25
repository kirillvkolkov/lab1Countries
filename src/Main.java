
public class Main {
    public static void main(String[] args) {
        Country country = new Country();
        Country[] countries = new Country[5];

        Country russia = new Country("Russia", 17_100_000, 146_700_000, "Moscow", 12_600_000);
        Country finland = new Country("Finland", 338_000, 5_500_000, "Helsinki", 655_000);
        Country france = new Country("France", 643_800, 67_800_000, "Paris", 2_100_000);
        Country andorra = new Country("Andorra", 467, 85_400, "Andorra la Vella", 22_000);
        Country singapore = new Country("Singapore", 725, 5_700_000);

        countries[0] = russia;
        countries[1] = finland;
        countries[2] = france;
        countries[3] = andorra;
        countries[4] = singapore;

        country.printAll(countries);

    }
}