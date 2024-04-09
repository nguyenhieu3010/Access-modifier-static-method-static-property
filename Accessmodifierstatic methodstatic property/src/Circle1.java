public class Circle1 {
    private final double PI = 3.14;
    private  double radius = 1.0;
    private void Circle1(){
    }
    public Circle1(double radius){
        this.radius=radius;
    }
    public  double getRadius(){
        return radius;
    }
    public double getArea(){
        return PI * radius *radius;
    }


}
