package aut.utcluj.isp.ex1;

/**
 * @author stefan
 */
public class Shop {
    private String name;
    private String city;

    public Shop(String name, String city) {
        this.name=name;
        this.city=city;
    }

    public Shop(String name) {
        this.city = "";
        this.name=name;
    }
    

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }
}
