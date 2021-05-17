package Collections.Set;
import Collections.Set.HeavlyBody;

import java.util.HashSet;
import java.util.Set;

public class HeavlyBody {
    private final String name;
    private final double orbintalPeriod;
    private final Set<HeavlyBody> satellites;

    public HeavlyBody(String name, double orbintalPeriod) {
        this.name = name;
        this.orbintalPeriod = orbintalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbintalPeriod() {
        return orbintalPeriod;
    }

    public boolean addMoon(HeavlyBody moon) {
        return this.satellites.add(moon);
    }

    public Set<HeavlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }
}

