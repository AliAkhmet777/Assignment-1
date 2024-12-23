class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}