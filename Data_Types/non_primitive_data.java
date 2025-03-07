public class DemoNonPrimitiveData {
    public static void main(String[] args) {
        
    // String: Tập hợp các ký tự (chuỗi).
    String joe = "Joe Mama";
    System.out.println("String: " + joe);

    // Mảng (Array): Một tập hợp các giá trị thuộc cùng một kiểu dữ liệu.
    int[] smthing = {1, 2, 3, 4, 5};

    //Method 1:
    System.out.print("Array: ");
    for (int num : smthing) {
        
        System.out.print(num + ", ");
    }
    System.out.print("\n");

    //Method 2:
    System.out.print("Array: ");
    for (int i = 0; i < smthing.length; i++) {
        System.out.print(smthing[i]); // Print the current element
        if (i < smthing.length - 1) { // Check if it's not the last element
            System.out.print(", "); // Print the comma if it's not the last element
        }
    }
    System.out.print("\n");

    // Lớp (Class): Định nghĩa kiểu dữ liệu mới với các thuộc tính và phương thức.
    Person person = new Person("God", 9999);
    System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());
    // Giao diện (Interface): Định nghĩa một tập hợp các phương thức mà các lớp có thể thực hiện.
    }
}

class  Person {
    private  String name;
    private  int age;
    // Khai báo hai biến thành viên (thuộc tính) của lớp, 
    // name loại String và age loại int. 
    // Từ khóa private chỉ ra rằng những thuộc tính này không thể được truy cập trực tiếp từ bên ngoài lớp.
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Đây là hàm khởi tạo (constructor) của lớp Person. 
    // Nó nhận hai tham số và khởi tạo các thuộc tính name và age với các giá trị truyền vào.


    public String getName(){
        return  name;
    }

    public int getAge() {
        return age;
    }
}

