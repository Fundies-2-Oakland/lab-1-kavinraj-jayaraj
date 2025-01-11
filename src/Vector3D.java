import java.util.Vector;

public class Vector3D {

    double x, y, z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }

    public double getMagnitude() {
        return Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)) + (Math.pow(z, 2)));
    }

    public Vector3D normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0) {
            throw new IllegalStateException("Can't normalize vector since magnitude is 0");
        }
        return new Vector3D(getX() / magnitude, getY() / magnitude, getZ() / magnitude);
    }

    public Vector3D add(Vector3D otherVector) {
        return new Vector3D(getX() + otherVector.getX(), getY() + otherVector.getY(), getZ() + otherVector.getZ());
    }

    public Vector3D multiply(double constant) {
        return new Vector3D(getX() * constant, getY() * constant, getZ() * constant);
    }

    public double dotProduct(Vector3D otherVector) {
        return (getX() * otherVector.getX()) + (getY() * otherVector.getY()) + (getZ() * otherVector.getZ());
    }

    public double angleBetween(Vector3D otherVector) {
        double magnitudeCurrent = getMagnitude();
        double magnitudeOther = otherVector.getMagnitude();

        if (magnitudeOther == 0 || magnitudeCurrent == 0) {
            throw new IllegalStateException("At least one vector magnitude is 0");
        }

        return Math.toDegrees(Math.acos(dotProduct(otherVector) / (magnitudeOther * magnitudeCurrent)));
    }

    public Vector3D crossProduct(Vector3D otherVector) {

        double uX = getY() * otherVector.getZ() - getZ() * otherVector.getY();
        double uY = getZ() * otherVector.getX() - getX() * otherVector.getZ();
        double uZ = getX() * otherVector.getY() - getY() * otherVector.getX();

        return new Vector3D(uX, uY, uZ);
    }


}
