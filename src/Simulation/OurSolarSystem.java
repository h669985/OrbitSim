package Simulation;

import bodies.CelestialBodyType;
import bodies.moons.Moon;
import bodies.planets.Planet;
import bodies.planets.PlanetType;
import bodies.stars.Star;
import bodies.stars.StarType;

public final class OurSolarSystem {
    static Star Sun = new Star(
            "Sun",
            CelestialBodyType.STAR,
            StarType.YELLOW_DWARF,
            1988500E24,
            1412000E12,
            695700,
            695700
    );

    static Planet Earth = new Planet(
            "Earth",
            CelestialBodyType.PLANET,
            PlanetType.OCEAN_PLANET,
            Sun,
            1.5E8,
            5.972E24,
            108.321E10,
            6378.137,
            6356.752
    );

    static Moon Moon = new Moon(
            "Earth",
            CelestialBodyType.MOON,
            Earth,
            3.844E5,
            0.07346E24,
            2.1968E10,
            1738.1,
            1736.0
    );
}
