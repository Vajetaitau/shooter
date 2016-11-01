package shooter.root.data.secondary.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by karol on 11/1/2016.
 */
@Entity
public class Shooter implements Serializable{

    private Integer id;
    private String name;

    protected Shooter() {
    }

    public Shooter(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
