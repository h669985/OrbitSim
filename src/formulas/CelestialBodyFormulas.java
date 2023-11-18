package formulas;

import bodies.CelestialBody;
import bodies.CelestialBodyType;

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
        double R = convert_km_to_m(volumetricMeanRadius(celestialBody));

        return Constants.G * M / (R * R);
    }

    public static double gravitationalForce(CelestialBody celestialBody1, CelestialBody celestialBody2, double distance_km) {
        double m1 = celestialBody1.getMass_kg();
        double m2 = celestialBody2.getMass_kg();
        double r = convert_km_to_m(distance_km);

        return Constants.G * (m1 * m2 / (r*r) );
    }

    public static double orbitalPeriodStar(CelestialBody celestialBody1, CelestialBody celestialBody2, double semimajor_axis) {
        double m2 = celestialBody2.getMass_kg();
        double a = convert_km_to_m(semimajor_axis);

        double p = 2*Math.PI*Math.sqrt(Math.pow(a, 3) / (Constants.G * m2));

        return p/86400;
    }

}
