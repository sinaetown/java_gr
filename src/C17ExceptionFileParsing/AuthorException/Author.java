package C17ExceptionFileParsing.AuthorException;

import java.util.*;

class Author {
    private Long id;
    private String name;
    private String email;
    private String password;
    static Long static_id = 0L;

    Author (String name, String email, String password) {
        static_id++;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}