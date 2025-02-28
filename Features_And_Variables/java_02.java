
public class Demo1
// Đây là phần khai báo một lớp có tên là Demo1. 
// Lớp này được khai báo là public, có nghĩa là nó có thể được truy cập từ bất kỳ lớp nào khác trong cùng một hoặc khác package.
{
    public static void main(String[] args) {
        
        // Đây là phương thức main, điểm bắt đầu của một ứng dụng Java. 
        // Khi bạn chạy chương trình, Java sẽ tìm phương thức main trong lớp đầu tiên mà bạn chỉ định và bắt đầu thực thi từ đây.

        
        Demo1 de = new  Demo1();
        // Dòng này tạo ra một đối tượng mới của lớp Demo1 và gán nó cho biến tham chiếu de
        
        new Demo1();
        new Demo1();
        new Demo1();
        new Demo1();
        // Các dòng này đều tạo ra thêm bốn đối tượng mới của lớp Demo1, 
        // nhưng không gán chúng vào bất kỳ biến nào (do đó, chúng sẽ không được sử dụng sau này)
    }
}