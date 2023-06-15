public class Main {
    public static void main(String[] args) {
        Shape kor = new Circle(2);
        System.out.println("A kerulete: " + kor.getPerimeter());
        System.out.println("A terulete: " + kor.getArea());
        Shape negyzet = new Square(3);
        System.out.println("A kerülete: " + negyzet.getPerimeter());
        System.out.println("A területe: " + negyzet.getArea());
    }
}
