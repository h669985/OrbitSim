package Simulation;

import bodies.CelestialBody;
import bodies.CelestialBodyType;

public final class OurSolarSystem {
    static CelestialBody Sun = new CelestialBody(
            "Sun",
            CelestialBodyType.STAR,
            null, 0,
            1988500E24,
            1412000E12,
            695700
    ) {};


    static CelestialBody Earth = new CelestialBody(
            "Earth",
            CelestialBodyType.PLANET,
            Sun, 1.49597871E8,
            5.9724E24,
            1.083E12,
            6371.000
    ) {};

    static CelestialBody Moon = new CelestialBody(
            "Earth",
            CelestialBodyType.MOON,
            Earth, 3.844E5,
            0.07346E24,
            2.1968E10,
            1737.4
    ) {
    };
}
