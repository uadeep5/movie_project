package ua.deep5.movies.model;

import ua.deep5.movies.Enum.Role;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class DBUser extends AbstractModel {
    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "img_id")
    private Image image;

    public DBUser() {
    }

    public DBUser(String login, String password, Role role, String email) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
