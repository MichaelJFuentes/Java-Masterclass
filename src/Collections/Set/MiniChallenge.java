package Collections.Set;

public class MiniChallenge {
    private final String name;

    public MiniChallenge(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MiniChallenge) {
            String objName = ((MiniChallenge) obj).getName();
            return this.name.equals(objName);
            //return this.equals(objName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
