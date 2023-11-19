# OrbitSim

OrbitSim is a personal project for simulating n-number of celestial bodies orbiting each other.
The goal is to be able to simulate our solar system in the past, present and future; including speed modifiers to make visual changes for a user be noticeable.

I hope to be able to simulate the solar system with enough accuracy to show that our sun is not the center of mass in the solar system and that the gravitational forces of our planets affects it as well.
To achieve this effect I plan on using public data availible from NASA, and implement a solution for the n-body problem.
It would be ideal to have decent perforamce while simulating the Sun, all planets, most of the popular moons, and any other interesting celestial bodies, such as Halleys comet and dwarf planets such as Pluto.
The most ideal would to have every single known moon in the solar system running in real time, though this will probably be too performance heavy even if I were to achieve a time complexity of O(n).
On the topic of time complexity I am hoping for something not worse than O(n log n) though I want to stick as close to O(n) as possible. This is due to the fact that complexity increases exponentially witch the addition of each new planet, moon and whatever other celestial body.
Considering that we have 290 moons in our solar systems, the number of celestial bodies to run calculations on while considering their effect on each other as well makes finding an efficient approximation, while not loosing out too much on accuracy, imperative to make this project successful.

With that being said, there is still a lot to be done.
- I need to manually implement each celestial body I want to simulate, unless I can find a way to pull the data from a website that stores it in a generic and predictable way.
- The constructors for celestial bodies are mostly done, they will need adjustments though since I'll likely want to add more info to them in order to be able to simulate their orbits, though the dirty work is done.
- I need to implement each and every formula that I need to make use for in a class. It's imperative that the implementation for these is efficient. For now I'll try to write the code myself, though if performance becomes a massive issue, I'll have to import code from people smarter than me.
- I haven't begun on any orbital mechanics stuff yet.

- I need to implement a graphical interface that a user can interact with. (Likely the last thing I'll do)
- While 3d rendering would be preferable, it's likely too complex to implement for me at this stage. I'll consider this when I get here.

Good luck to me...
