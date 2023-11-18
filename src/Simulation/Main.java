package Simulation;

import static formulas.CelestialBodyFormulas.*;
import static Simulation.OurSolarSystem.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(gravitationalForce(Earth, Earth.getParentBody(), Earth.getDistanceToParent()));
    }
}

