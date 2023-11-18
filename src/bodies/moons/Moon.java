package bodies.moons;

import bodies.CelestialBody;
import bodies.CelestialBodyType;
import bodies.planets.Planet;

public class Moon extends CelestialBody {

    Planet parentBody;
    double distance_km;

    public Moon(String name, CelestialBodyType celestialBodyType, Planet parentBody, double distance_km, double mass_kg, double volume_km3, double equatorialRadius_km, double polarRadius_km) {
        super(  name,
                celestialBodyType,
                mass_kg, volume_km3,
                equatorialRadius_km,
                polarRadius_km);

        this.parentBody = parentBody; // Name of the Celestial Body that it orbits.
        this.distance_km = distance_km; // Distance to the Celestial Body that it orbits.
    }

    public Planet getParentBody() {
        return parentBody;
    }

    public void setOrbit(Planet parentBody) {
        this.parentBody = parentBody;
    }

    public double getDistanceToParent() {
        return distance_km;
    }

    public void setDistance(double distance_km) {
        this.distance_km = distance_km;
    }
}
