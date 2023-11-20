package computations.formulas;

import bodies.CelestialBody;
import computations.constants.Constants;

import static computations.formulas.Conversions.*;

public class OrbitFormulas {

    public static double orbitalPeriod(CelestialBody celestialBody1, CelestialBody celestialBody2,double distance_km) {
        double M1 = celestialBody1.getMass_kg();
        double M2 = celestialBody2.getMass_kg();
        double r = convert_km_to_m(distance_km);

        return 2*Math.PI * Math.sqrt((r*r*r)/(Constants.G*(M1 + M2)));
    }

    public static double orbitalSpeed(CelestialBody celestialBody1, CelestialBody celestialBody2,double distance_km) {
        double M1 = celestialBody1.getMass_kg();
        double M2 = celestialBody2.getMass_kg();
        double r = convert_km_to_m(distance_km);

        return 2*Math.PI * Math.sqrt((Constants.G*(M1 + M2))/(r));
    }
}
