
package dev.cozi.addon.util;

import net.minecraft.util.math.Vec3d;

public class RotationUtils {
    public static float[] getRotationsTo(Vec3d from, Vec3d to) {
        Vec3d diff = to.subtract(from);
        double diffX = diff.x;
        double diffY = diff.y;
        double diffZ = diff.z;
        double diffXZ = Math.sqrt(diffX * diffX + diffZ * diffZ);
        float yaw = (float) (Math.toDegrees(Math.atan2(diffZ, diffX)) - 90.0f);
        float pitch = (float) -(Math.toDegrees(Math.atan2(diffY, diffXZ)));
        return new float[] { yaw, pitch };
    }
}
