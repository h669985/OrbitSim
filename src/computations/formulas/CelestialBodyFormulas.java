package computations.formulas;

import bodies.CelestialBody;
import computations.constants.Constants;

import static computations.formulas.Conversions.*;

public class CelestialBodyFormulas {

    public static double standardGP(CelestialBody celestialBody1, CelestialBody celestialBody2) {
        double mass = celestialBody1.getMass_kg();

        if(celestialBody2 != null)
            mass += celestialBody2.getMass_kg();


        return Constants.G * (mass);
    }


    public static double gravitationalForce(CelestialBody celestialBody1, CelestialBody celestialBody2, double distance_km) {
        double m1 = celestialBody1.getMass_kg();
        double m2 = celestialBody2.getMass_kg();
        double r = convert_km_to_m(distance_km);

        return Constants.G * (m1 * m2 / (r*r) );
    }

}
