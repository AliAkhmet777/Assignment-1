import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt not found. Please make sure the file exists.");
            return;
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;

            if (line.startsWith("Circle:")) {
                String radiusStr = line.substring(line.indexOf(":") + 1).trim();
                double radius = Double.parseDouble(radiusStr);
                Circle circle = new Circle(radius);
                System.out.println("\nCircle: radius=" + radius);
                System.out.println("Circumference: " + circle.circumference());
                System.out.println("Area: " + circle.area());
            } else if (line.startsWith("Cylinder:")) {
                String dimensions = line.substring(line.indexOf(":") + 1).trim();
                String[] parts = dimensions.split(",");
                double radius = Double.parseDouble(parts[0].trim());
                double height = Double.parseDouble(parts[1].trim());
                Cylinder cylinder = new Cylinder(radius, height);
                System.out.println("\nCylinder: radius=" + radius + ", height=" + height);
                System.out.println("Surface Area: " + cylinder.surfaceArea());
                System.out.println("Volume: " + cylinder.volume());
            } else {
                System.out.println("Invalid input format: " + line);
            }
        }
        scanner.close();
    }
}