package be.infernalwhale;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Office {
    @Id
    private int id; // this will be the room number

    @OneToOne()
    private User user;

    public int getId() {
        return id;
    }

    public Office setId(int id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Office setUser(User user) {
        this.user = user;
        return this;
    }
}
