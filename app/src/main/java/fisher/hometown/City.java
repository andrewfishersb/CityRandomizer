package fisher.hometown;

/**
 * Created by afisher on 12/12/2017.
 */

public class City {
    private String city;
    private int population;

    public City(String city, int population) {
        this.city = city;
        this.population = population;
    }

    public String getCityName() {
        return this.city;
    }

    public int getPopulation() {
        return this.population;
    }
}
