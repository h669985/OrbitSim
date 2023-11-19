package physics.formulas;

import bodies.CelestialBody;
import physics.constants.Constants;

public class CelestialBodyFormulas {

    public static double convert_km_to_m(double km){
        return km*1000;
    }

    public static double volumetricMeanRadius(CelestialBody celestialBody) {
        double equatorialRadiusMeters = celestialBody.getEquatorialRadius_km();
        double polarRadiusMeters = celestialBody.getPolarRadius_km();

        return (2 * equatorialRadiusMeters + polarRadiusMeters) / 3;
    }

    public static double surfaceGravity(CelestialBody celestialBody) {
        double M = celestialBody.getMass_kg();
        double R = convert_km_to_m(volumetricMeanRadius(celestialBody)); // Assume surface at 1 atmosphere if there is no solid surface

        return Constants.G * M / (R * R);
    }

    public static double gravitationalForce(CelestialBody celestialBody1, CelestialBody celestialBody2, double distance_km) {
        double m1 = celestialBody1.getMass_kg();
        double m2 = celestialBody2.getMass_kg();
        double r = convert_km_to_m(distance_km);

        return Constants.G * (m1 * m2 / (r*r) );
    }

}
