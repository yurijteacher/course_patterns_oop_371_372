package patterns.structural_patterns.adapter.v1;

import patterns.structural_patterns.facade.Second;

public class User implements UserDetails{

    private Long id;
    private String login;
    private String pass;
    @Override
    public String getUsername(String name) {
        return login;
    }
    @Override
    public String getPassword(String name) {
        return pass;
    }

}
