package computations.constants;

// Random links:
// https://ssd.jpl.nasa.gov/planets/approx_pos.html
// https://ssd.jpl.nasa.gov/faq.html

/** Found on physicsstackexchange - https://physics.stackexchange.com/questions/598306/how-to-simulate-orbits
 * If you want to do a more complex and more accurate simulation that might involve, for example, multiple stars, minor planets,
 * and planetary satellites then you need to apply Newton's law of gravity to get a series of linked non-linear differential equations, one for each body.
 * Then you are into the realm of finding an approximate numerical solution to these equations, as described in the comments underneath your question.
 */

public final class Constants {
    public static final double G = 6.6743E-11; // Gravitational constant

    public static final double au = 1.495978707e11; //Astronomical unit (average earth-sun distance)
}
