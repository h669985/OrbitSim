package Simulation;

import static physics.formulas.CelestialBodyFormulas.*;
import static Simulation.OurSolarSystem.*;

// Mainly used for testing for now
public class Main {
    public static void main(String[] args) {
        System.out.println(gravitationalForce(Earth, Earth.getParentBody(), Earth.getDistanceToParent()));
    }
}

