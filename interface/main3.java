//Step 1: Define the first interface
interface Drawable {
    void draw();
}

// Step 2: Define the second interface
interface Colorable {
    void color();
}

// Step 3: Implement both interfaces in a single class
class Shape implements Drawable, Colorable {
    @Override
    public void draw() {
        System.out.println("Drawing the shape.");
    }

    @Override
    public void color() {
        System.out.println("Coloring the shape.");
    }
}

// Step 4: Use the class in the main method
public class main3 {
    public static void main(String[] args) {
        Shape myShape = new Shape(); // Create an instance of Shape
        myShape.draw();              // Call the draw method
        myShape.color();             // Call the color method
    }
}



