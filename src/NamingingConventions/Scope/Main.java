package NamingingConventions.Scope;

public class Main {
    public static void main(String[] args) {
        String privateVar = " Private to main ";
        String publicVar = "public var";

        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println("scope private var is " + scopeCheck.getPrivateVar());
        System.out.println(privateVar);
    }
}
