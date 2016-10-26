package shooter.root.details;

/**
 * Created by karol on 10/23/2016.
 */
public class ShooterDetails extends Coordinates {

    private String name;

    protected ShooterDetails() {
    }

    public ShooterDetails(Integer x, Integer y, String name) {
        super(x, y);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
