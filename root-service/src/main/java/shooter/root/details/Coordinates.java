package shooter.root.details;

/**
 * Created by karol on 10/23/2016.
 */
public class Coordinates {

    private Integer x;
    private Integer y;

    protected Coordinates() {
    }

    public Coordinates(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
