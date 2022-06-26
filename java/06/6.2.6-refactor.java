// 6.19

class Main {
    public static void main(String[] args) {
        // Rectangle rectangle = new Rectangle(10, 100);
        // Circle circle = new Circle(10);

        // Shape interfaceを実装しているRectangle, Circle双方を代入可能。o
        Shape shape = new Circle(10);
        System.out.println(shape.area()); // 円の面積が表示される

        shape = new Rectangle(20, 25);
        System.out.println(shape.area()); // 四角形の面積が表示される。


    }

    void showArea(Shape shape) {
        System.out.println(shape.area());
    }

}


// 6.23 図形型を表現するinterface
interface Shape {
    double area();
}


// 四角形
// 6.24 Shape interfaceの実装
class Rectangle implements Shape {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 中略
    // interfaceに追加するためにpublicを追記
    public double area() {
        return width * height;
    }
}


// 円
// 6.24 Shape interfaceの実装
class Circle implements Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // interfaceに追加するためにpublicを追記
    public double area() {
        return radius * radius * Math.PI;
    }

}
