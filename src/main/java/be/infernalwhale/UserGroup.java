package be.infernalwhale;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class UserGroup {
    @Id
    private Integer id;
    private String name;

    @ManyToMany
    private Set<User> users;
}
