package bodies.stars;

import bodies.CelestialBody;
import bodies.CelestialBodyType;

public class Star extends CelestialBody {
    StarType starType;
    public Star(String name, CelestialBodyType celestialBodyType, StarType starType, double mass_kg, double volume_km3, double equatorialRadius_km, double polarRadius_km) {
        super(  name,
                celestialBodyType,
                mass_kg,
                volume_km3,
                equatorialRadius_km,
                polarRadius_km);
        this.starType = starType;
    }

    public StarType getStarType() {
        return starType;
    }

    public void setStarType(StarType starType){
        this.starType = starType;
    }

}
