package chapter6.project1;

import java.util.Scanner;

public class AbstractInterface {
	static class Circle {
        int x, y, radius;
        
        Circle(int x, int y, int radius) {
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
        
        void draw() {
            System.out.println("[円を描画] 中心点(" + x + "," + y + ")から半径" + radius);
            double perimeter = 2 * Math.PI * radius;
            System.out.println("周囲の長さは、" + perimeter);
        }
    }

    static class Line {
        int x1, y1, x2, y2;

        Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        void draw() {
            System.out.println("[線を描画] 始点(" + x1 + "," + y1 + ")から終点(" + x2 + "," + y2 + ")まで");
            double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            System.out.println("周囲の長さは、" + length);
        }
    }

    static class Triangle {
        int x1, y1, x2, y2, x3, y3;

        Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
        }

        void draw() {
            System.out.println("[三角形を描画] 点1(" + x1 + "," + y1 + ")から点2(" + x2 + "," + y2 + ")、点3(" + x3 + "," + y3 + ")の三角形");
            double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double length2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double length3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));
            double perimeter = length1 + length2 + length3;
            System.out.println("周囲の長さは、" + perimeter);
            System.out.println("内角の和は、180");
        }
    }

    static class Rectangle {
        int x, y, width, height;

        Rectangle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        void draw() {
            System.out.println("[長方形(矩形)を描画] 点(" + x + "," + y + ")を基準として幅" + width + ",高さ" + height + "の長方形");
            double perimeter = 2 * (width + height);
            System.out.println("周囲の長さは、" + perimeter);
            System.out.println("内角の和は、360");
        }
    }

    static class Square {
        int x, y, size;

        Square(int x, int y, int size) {
            this.x = x;
            this.y = y;
            this.size = size;
        }

        void draw() {
            System.out.println("[正方形を描画] 点(" + x + "," + y + ")を基準として幅・高さ" + size + "の正方形");
            double perimeter = 4 * size;
            System.out.println("周囲の長さは、" + perimeter);
            System.out.println("内角の和は、360");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("図形描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ] : >");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 0:
                    Circle circle = new Circle(100, 100, 20);
                    circle.draw();
                    return;

                case 2:
                    Line line = new Line(0, 0, 100, 100);
                    line.draw();
                    return;
                case 3:
                    Triangle triangle = new Triangle(0, 0, 100, 100, 0, 200);
                    triangle.draw();
                    return;

                case 4:
                    Rectangle rectangle = new Rectangle(0, 0, 100, 50);
                    rectangle.draw();
                    return;

                case 44:
                    Square square = new Square(0, 0, 200);
                    square.draw();
                    return;

                default:
                    System.out.println("0、2、3、4、44のいずれかを再入力してください");
                    break;
            }
        }
    }
}
