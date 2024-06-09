package SolarSystem;

public class solarSystem {
    public static void main(String[] args) {
        solarSystemBase solar = new solarSystemBase();
        solar.sun = "1";
        solar.planet = "2";
        solar.star = "2";
        System.out.println("the solar system is ready");

        featureSun xros = new featureSun();
        xros.color = "pink";
        xros.temp = "24324kv";
        xros.size = "0km";

        planet1 earth = new planet1();
        earth.color = "blue and green";
        earth.size = "7926m";
        earth.radius = "3958m";

        planet2 mars = new planet2();
        mars.color = "orange";
        mars.radius = "4000m";
        mars.size = "8000m";
    }

}
