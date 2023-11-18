package bodies;

public abstract class CelestialBody {
    private String name;
    private CelestialBodyType celestialBodyType;
    private double mass_kg;
    private double volume_km3;
    private double equatorialRadius_km;
    private double polarRadius_km;

    public CelestialBody(String name, CelestialBodyType celestialBodyType, double mass_kg, double volume_km3, double equatorialRadius_km, double polarRadius_km) {
        this.name = name;

        this.celestialBodyType = celestialBodyType;

        this.mass_kg = mass_kg;

        this.volume_km3 = volume_km3;

        this.equatorialRadius_km = equatorialRadius_km;

        this.polarRadius_km = polarRadius_km;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CelestialBodyType getType() {
        return celestialBodyType;
    }

    public void setType(CelestialBodyType celestialBodyType) {
        this.celestialBodyType = celestialBodyType;
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

    public double getEquatorialRadius_km() {
        return equatorialRadius_km;
    }

    public void setEquatorialRadius_km(double equatorialRadius_km) {
        this.equatorialRadius_km = equatorialRadius_km;
    }

    public double getPolarRadius_km() {
        return polarRadius_km;
    }

    public void setPolarRadius_km(double polarRadius_km) {
        this.polarRadius_km = polarRadius_km;
    }
}
