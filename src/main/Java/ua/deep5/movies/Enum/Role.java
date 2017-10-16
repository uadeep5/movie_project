package ua.deep5.movies.Enum;

public enum Role{
    Admin, User;

    @Override
    public String toString() {
        return name();
    }
}
