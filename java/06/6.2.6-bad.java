// 6.19

class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 100);
        Circle circle = new Circle(10);

        // 6.20 同じように見えるメソッド
        rectangle.area();
        circle.area();

        /*
         * 6.21 areaは同名であっても違うメソッド 異なる型のインスタンスは代入できない。コンパイルエラーになる。 同名のメソッドがあっても利用できない。 rectangle
         * rectangle2 = new circle(8); rectangle2.area()
         */


    }
}

/*
 * 複数の型に『area』という同じ名前のメソッドを実装している
 */


// 四角形
class Rectangle {
    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // 中略
    double area() {
        return width * height;
    }
}


// 円
class Circle {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return radius * radius * Math.PI;
    }
}
