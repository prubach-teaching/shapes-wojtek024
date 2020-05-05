package pl.waw.sgh.shapes;

public class PlayWithShapes {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6, 8);
        System.out.println("Surface R1: " + r1.calcSurface());
        System.out.println("Perimeter R1: " + r1.calcPerimeter());


//        Rectangle r2 = new Rectangle(3, 4);
//        Shape s2 = r2;
//
//        s2.setParams(10, 56);
//        double surf = r2.calcSurface();
//        System.out.println(surf);
//
//        System.out.println("S2 surface: " + s2.calcSurface());
//
//        System.out.println(r2);
//        System.out.println(s2.toString());
//
        Circle c1 = new Circle(5);
        System.out.println("C1: " + c1);
        System.out.println("Surface C1: " + c1.calcSurface());

        Triangle t1 = new Triangle(5, 2, 4, 3);
        System.out.println("T1: " + t1);
        System.out.println("Surface T1: " + t1.calcSurface());
        System.out.println("Perimeter T1: " + t1.calcPerimeter());

        Square s1 = new Square(5);
        System.out.println("S1: " + s1);
        System.out.println("Surface S1: " + s1.calcSurface());
        System.out.println("Perimeter S1: " + s1.calcPerimeter());

        EquilatTriangle et1 = new EquilatTriangle(4);
        System.out.println("ET1: " + et1);
        System.out.println("Surface ET1: " + et1.calcSurface());
        System.out.println("Perimeter ET1: " + et1.calcPerimeter());
    }
}
