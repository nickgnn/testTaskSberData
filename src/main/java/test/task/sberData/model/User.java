package test.task.sberData.model;

import java.util.List;

public class User {
    private Long ID;
    private String name;
    private String email;
    private List<Role> roles;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
