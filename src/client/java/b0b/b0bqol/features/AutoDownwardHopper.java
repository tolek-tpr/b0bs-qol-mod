package b0b.b0bqol.features;

import net.minecraft.util.math.Direction;

public class AutoDownwardHopper extends Feature {

    public AutoDownwardHopper() {
        super("Auto Downwards Hopper");
    }

    public Direction getModifiedDirection() { return Direction.UP; }

}