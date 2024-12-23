class Cylinder {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double surfaceArea() {
        double baseArea = Math.PI * radius * radius;
        double sideArea = 2 * Math.PI * radius * height;
        return 2 * baseArea + sideArea;
    }

    double volume() {
        return Math.PI * radius * radius * height;
    }
}