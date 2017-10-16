package ua.deep5.movies.model;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "images")
public class Image extends AbstractModel {
    @Lob
    private byte[] img;

    @OneToOne(mappedBy = "image")
    private Movie movie;

    @OneToOne(mappedBy = "image")
    private Actor actor;

    @OneToOne(mappedBy = "image")
    private Producer producer;

    @OneToOne(mappedBy = "image")
    private DBUser dbUser;

    public Image() {
    }

    public Image(byte[] img) {
        this.img = img;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}
