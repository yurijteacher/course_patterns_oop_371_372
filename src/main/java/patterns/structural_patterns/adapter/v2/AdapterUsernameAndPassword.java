package patterns.structural_patterns.adapter.v2;

public class AdapterUsernameAndPassword extends User implements UserDetails{

    @Override
    public String getUsername(String name) {
        return getLogin();
    }

    @Override
    public String getPassword(String name) {
        return getPass();
    }
}
