package NamingingConventions.Scope;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("Scope check " + publicVar + " " + privateVar    );
    }

    public int getPublicVar() {
        return publicVar;
    }

    public int getPrivateVar() {
        return privateVar;
    }
}
