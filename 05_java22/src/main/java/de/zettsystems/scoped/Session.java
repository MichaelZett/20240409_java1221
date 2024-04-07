package de.zettsystems.scoped;

public class Session {
    public final static ScopedValue<User> LOGGED_IN_USER = ScopedValue.newInstance();
}
