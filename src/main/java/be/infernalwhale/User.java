package be.infernalwhale;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String username;

    @OneToOne(mappedBy = "user")
    private Office office;

    @OneToMany(mappedBy = "user", cascade = CascadeType.REFRESH)
    private List<Message> messages;

    @ManyToMany(mappedBy = "users")
    private Set<UserGroup> userGroups;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public User setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public Office getOffice() {
        return office;
    }

    public User setOffice(Office office) {
        this.office = office;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("User: \n");
        sb.append("id: " + this.getId() + "\n");
        sb.append("username: " + this.getUsername() + "\n");
        this.getMessages().forEach(message -> sb.append(message.toString() + "\n"));

        return sb.toString();
    }
}
