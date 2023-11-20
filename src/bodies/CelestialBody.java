package bodies;

public abstract class CelestialBody {
    private String name;
    private CelestialBodyType celestialBodyType;
    private CelestialBody parent;
    private double distance_km;
    private double mass_kg;
    private double volume_km3;
    private double meanRadius_km;

    public CelestialBody(String name, CelestialBodyType celestialBodyType, CelestialBody parent, double distance_km, double mass_kg, double volume_km3, double meanRadius_km) {
        this.name = name;

        this.celestialBodyType = celestialBodyType;

        this.parent = parent;

        this.distance_km = distance_km;

        this.mass_kg = mass_kg;

        this.volume_km3 = volume_km3;

        this.meanRadius_km = meanRadius_km;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CelestialBodyType getCelestialBodyType() {
        return celestialBodyType;
    }

    public void setCelestialBodyType(CelestialBodyType celestialBodyType) {
        this.celestialBodyType = celestialBodyType;
    }

    public CelestialBody getParent() {
        return parent;
    }

    public void setParent(CelestialBody parent) {
        this.parent = parent;
    }

    public double getDistance_km() {
        return distance_km;
    }

    public void setDistance_km(double distance_km) {
        this.distance_km = distance_km;
    }

    public double getMass_kg() {
        return mass_kg;
    }

    public void setMass_kg(double mass_kg) {
        this.mass_kg = mass_kg;
    }

    public double getVolume_km3() {
        return volume_km3;
    }

    public void setVolume_km3(double volume_km3) {
        this.volume_km3 = volume_km3;
    }

    public double getMeanRadius_km() {
        return meanRadius_km;
    }

    public void setMeanRadius_km(double meanRadius_km) {
        this.meanRadius_km = meanRadius_km;
    }

}
