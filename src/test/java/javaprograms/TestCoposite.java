package javaprograms;


import java.util.ArrayList;
import java.util.List;

interface Shape{
    public void draw(String fillcolor);
}

class Triangle implements Shape {
    public void draw(String fillcolor){
        System.out.println("draw a triangle "+fillcolor);
    }
}

class Square implements Shape {
    public void draw(String fillcolor){
        System.out.println("draw a square "+fillcolor);
    }
}

class Drawing implements  Shape{
   List<Shape> shapes=new ArrayList<>();
    @Override
    public void draw(String fillcolor) {
        for (Shape s : shapes) {
            s.draw(fillcolor);
        }
    }
    public void add(Shape s){
        this.shapes.add(s);
    }
    public void remove(Shape s){
        this.shapes.remove(s);
    }
}

public class TestCoposite {

    public static void main(String[] args) {

    Shape tri=new Triangle();
    Shape square=new Square();

    Drawing drawing=new Drawing();
    drawing.add(tri);
    drawing.add(square);

    drawing.draw("red");
    }

}



