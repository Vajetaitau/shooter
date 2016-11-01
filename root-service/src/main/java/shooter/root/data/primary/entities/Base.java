package shooter.root.data.primary.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalTime;

/**
 * Created by karol on 10/16/2016.
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Base implements Serializable {

    private Integer id;
    private LocalTime creationTime;
    private LocalTime lastModificationTime;

    public Base() {
    }

    public Base(Integer id, LocalTime creationTime, LocalTime lastModificationTime) {
        this.id = id;
        this.creationTime = creationTime;
        this.lastModificationTime = lastModificationTime;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    @Column(nullable = false)
    public LocalTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalTime creationTime) {
        this.creationTime = creationTime;
    }

    @NotNull
    @Column(nullable = false)
    public LocalTime getLastModificationTime() {
        return lastModificationTime;
    }

    public void setLastModificationTime(LocalTime lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }
}
