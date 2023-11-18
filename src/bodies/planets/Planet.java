package bodies.planets;

import bodies.CelestialBody;
import bodies.CelestialBodyType;
import bodies.stars.Star;

public class Planet extends CelestialBody {
    PlanetType planetType;
    Star parentBody;
    double distance_km;

    public Planet(String name, CelestialBodyType type, PlanetType planetType, Star parentBody, double distance_km, double mass_kg, double volume_km3, double equatorialRadius_km, double polarRadius_km) {
        super(  name,
                type,
                mass_kg,
                volume_km3,
                equatorialRadius_km,
                polarRadius_km);

        this.planetType = planetType;
        this.parentBody = parentBody;
        this.distance_km = distance_km;
    }

    public PlanetType getPlanetType() {
        return planetType;
    }

    public void setPlanetType(PlanetType planetType) {
        this.planetType = planetType;
    }

    public Star getParentBody() {
        return parentBody;
    }

    public void setParentBody(Star parentBody) {
        this.parentBody = parentBody;
    }

    public double getDistanceToParent() {
        return distance_km;
    }
}
