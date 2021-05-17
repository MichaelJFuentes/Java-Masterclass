package Collections.SolarSystem;

import java.util.HashSet;
import java.util.Set;

public class Planet extends HeavenlyBody{
    private final Set<HeavenlyBody> moons;
    public Planet(String name, double orbitalPeriod) {
        super(name, "Planet", orbitalPeriod);
        moons = new HashSet<>();
    }

    public Set<HeavenlyBody> getMoons() {
        return new HashSet<>(this.moons);
    }

    public boolean addMoon(HeavenlyBody addMoon) {

        if (addMoon == null) {
            return false;
        }
        if (this.moons.contains(addMoon)) {
            return false;
        }
        return this.moons.add(addMoon);
    }

    public boolean removeMoon(HeavenlyBody removeMoon) {
        if (this.moons.contains(removeMoon)) {
            return this.moons.remove(removeMoon);
        } else {
            return false;
        }
    }
}
