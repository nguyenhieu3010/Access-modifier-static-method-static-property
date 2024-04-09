//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
             // bài tập trên slack
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(8);
        System.out.println(circle1.toString());
        System.out.println( " diện tích của hình tròn là: " + circle1.S());
        System.out.println(circle2.toString());
        System.out.println(" diện tích của hình tròn là: " +circle2.S());
        System.out.println(" hình tròn có bán kính lớn nhất là : " +Circle.getmaxRadius());
        System.out.println(" tổng diện tích của các hình tròn là : " +Circle.getSum());
        // bài tập trên jame (Access modifier)
//        Circle1 circle1=new Circle1(5);
//        System.out.println(circle1.getRadius());
//        System.out.println(circle1.getArea());
        // bài tập trên jame (Xây dựng lớp chỉ ghi trong Java)
//            Student student = new Student();
//        System.out.println(student.getClass1() + " " + student.getName());
//            student.setName("hieu");
//            student.setClass1("CO3");
//        System.out.println(student.getClass1() + " " +student.getName());


    }
}