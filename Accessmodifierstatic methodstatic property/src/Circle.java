import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.S;

//            * Luyện tập sử dụng static:
//    Bài Tập: Tạo một lớp Circle có trường private là id và radius,
//    có thuộc tính hằng static là PI bằng 3.14.
//  - Viết chương trình sao cho khi khởi tạo đối tượng của Circle
//    thì id của các đối tượng có thể tự tăng.
//   - In ra số lượng đối tượng được tạo từ lớp Circle.
//- Viết hàm tính diện tích, chu vi.
// - Xác định hình tròn có bán kính lớn nhất dựa vào thêm thuộc tính maxRadius.
//- Viết hàm có thể hiển thị tổng diện tích các hình tròn được tạo ra từ lớp Circle.
// =>Các yêu cầu phải được xử lý trong lớp Circle, tạo một class Main
// để chạy và chỉ có nhiệm gọi các hàm mà bạn vừa tạo.
//  Mọi người xác định xem cái nào static cái nào không.
public class Circle {
    private double radius;

    private static final double PI = 3.14;
    private static int count = 0;
    private static int sum = 0;

    private static double maxRadius;
    public int id;


    public Circle( double radius) {
        count++;
        this.id = count;
        this.radius = radius;
        if( radius > maxRadius){
             maxRadius = radius;
            sum= sum + S;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getCount(){
        return count;
    }
    public double V(){
        return 2 * PI * radius;
    }
    public double S(){
        return PI * radius * radius;
    }
    public static double getmaxRadius(){
        return maxRadius;
    }
    public static double getSum(){
        return sum;
    }

    @Override
    public String toString() {
        return "ID" + this.id + " hình tròn có bán kính là : " + this.radius ;
    }
}
