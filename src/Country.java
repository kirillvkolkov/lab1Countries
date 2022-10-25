public class Country {
    private String name;
    private Integer square;
    private Integer population;
    private String capital;
    private Integer capitalPopulation;

    public Country(String name, Integer square, Integer population, String capital, Integer capitalPopulation) {
        this.name = name;
        this.square = square;
        this.population = population;
        this.capital = capital;
        this.capitalPopulation = capitalPopulation;
    }

    public Country(String name, Integer square, Integer population) {
        this.name = name;
        this.square = square;
        this.population = population;
    }

    public Country() {
    }

    public String getName() {
        return name;
    }

    public Integer getSquare() {
        return square;
    }

    public Integer getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }

    public Integer getCapitalPopulation() {
        return capitalPopulation;
    }

    public Integer getPopulationDensity() {
        return population/square;
    }

    public void setName(String name) {
        if (name.isEmpty() || name == null) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }
    }

    public void setSquare(Integer square) {
        if (square < 0) {
            throw new IllegalArgumentException();
        } else {
            this.square = square;
        }
    }

    public void setPopulation(Integer population) {
        if (population < 0) {
            throw new IllegalArgumentException();
        } else {
            this.population = population;
        }
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setCapitalPopulation(Integer capitalPopulation) {
        if (capitalPopulation < 0) {
            throw new IllegalArgumentException();
        } else {
            this.capitalPopulation = capitalPopulation;
        }
    }

    public void clearCapitalPopulation() {
        capitalPopulation = 0;
    }

    public void print(Country country) {
        if (!(country.capital == null) && !(country.capitalPopulation == null)) {
            System.out.printf(name + " " + square + " " + population + " " + capital);
        } else {
            System.out.printf(name + " " + square + " " + population);
        }
    }

    public void printAll(Country[] country) {
        for (int i = 0; i < country.length; i++) {
            if(country[i].capital == null || country[i].capitalPopulation == null) {
                System.out.printf(country[i].getName() + ", " + "население " + country[i].getPopulation() + ", " + "площадь " + country[i].getSquare());
            } else {
                System.out.printf(country[i].toString() + "\n");

            }
        }
    }

    @Override
    public String toString() {
        return name +
                ", площадь " + square +
                ", население " + population +
                ", столица '" + capital + '\'' +
                ", население столицы " + capitalPopulation;
    }
}
