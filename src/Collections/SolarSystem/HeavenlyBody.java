package Collections.SolarSystem;

import java.util.Objects;

public abstract class HeavenlyBody {
    private final String name;
    private final String type;
    private final double orbitalPeriod;

    public HeavenlyBody(String name, String type, double orbitalPeriod) {
        this.name = name;
        this.type = type;
        this.orbitalPeriod = orbitalPeriod;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavenlyBody that = (HeavenlyBody) o;
        return name.equals(that.name) &&
                type.equals(that.type);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(name, type);
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " Type: " + this.type + " Orbital Period: " + this.orbitalPeriod;
    }
}
