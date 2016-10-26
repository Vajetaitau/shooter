package shooter.root.details;

import java.util.Set;

/**
 * Created by karol on 10/23/2016.
 */
public class ShooterMap {

    private Set<ShooterDetails> shooterDetailsSet;

    protected ShooterMap() {
    }

    public ShooterMap(Set<ShooterDetails> shooterDetailsSet) {
        this.shooterDetailsSet = shooterDetailsSet;
    }

    public Set<ShooterDetails> getShooterDetailsSet() {
        return shooterDetailsSet;
    }

    public void setShooterDetailsSet(Set<ShooterDetails> shooterDetailsSet) {
        this.shooterDetailsSet = shooterDetailsSet;
    }
}
