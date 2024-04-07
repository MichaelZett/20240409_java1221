package de.zettsystems.scoped;

public record User() {
    public boolean isAdmin() {
        return false;
    }
}
