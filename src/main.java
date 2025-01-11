public class main {
    public static void main(String[] args) {
        Vector3D vector1 = new Vector3D(0.0, -3.0, -9.0);
        Vector3D vector2 = new Vector3D(-4.0, 8.0, -7.0);

        System.out.println("Vector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);

        System.out.println("The magnitude of Vector 1 is: " + vector1.getMagnitude());
        System.out.println("The magnitude of Vector 2 is: " + vector2.getMagnitude());

        System.out.println("The normalized vector for Vector 1 is: " + vector1.normalize());
        System.out.println("The normalized vector for Vector 2 is: " + vector2.normalize());

        System.out.println("Vector 1 + Vector 2: " + vector1.add(vector2));
        System.out.println("Vector 1 * 9: " + vector1.multiply(9));
        System.out.println("The dot product of Vector 1 and Vector 2 is: " + vector1.dotProduct(vector2));
        System.out.println("The angle between Vector 1 and Vector 2 is: " + vector1.angleBetween(vector2));
        System.out.println("The cross product of Vector 1 and Vector 2 is: " + vector1.crossProduct(vector2));
    }
}
