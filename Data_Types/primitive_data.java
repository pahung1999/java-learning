public class DemoPrimitiveData {
    public static void main(String[] args) {
    // Kiểu dữ liệu nguyên thủy là những kiểu dữ liệu cơ bản mà Java cung cấp, không phải là đối tượng. 
    // Java có 8 kiểu dữ liệu nguyên thủy:

    // byte: 1 byte, có phạm vi từ -128 đến 127.
    byte b=100;
    System.out.println("Byte value: " + b);

    // short: 2 byte, có phạm vi từ -32,768 đến 32,767.
    short s=10000;
    System.out.println("Short value: " + s);

    // int: 4 byte, có phạm vi từ -2^31 đến 2^31-1.
    int i = 1000000;
    System.out.println("Int value: " + i);

    // long: 8 byte, có phạm vi từ -2^63 đến 2^63-1.
    long l = 100000L;
    // Suffix L (hoặc l) được sử dụng để chỉ định rằng giá trị được định nghĩa là một kiểu dữ liệu long. 
    // Nếu không có hậu tố này, trình biên dịch Java sẽ coi giá trị 100000 là kiểu dữ liệu int theo mặc định.
    System.out.println("Long value: " + l);


    // float: 4 byte, dùng để lưu trữ số thực (điểm động).
    float f = 10.5f;
    System.out.println("Float value: " + f);
    // Ý nghĩa: Suffix f (hoặc F) chỉ định rằng giá trị 10.5 là kiểu dữ liệu float. 
    // Nếu không có hậu tố này, trình biên dịch Java sẽ coi 10.5 là kiểu dữ liệu double theo mặc định.
    // Tại sao cần sử dụng: Kiểu float trong Java có độ chính xác thấp hơn so với kiểu double và chiếm ít bộ nhớ hơn. 


    // double: 8 byte, dùng cho số thực với độ chính xác gấp đôi so với float.
    double d = 20.99;
    System.out.println("Double value: " + d);


    // char: 2 byte, dùng để lưu trữ ký tự Unicode.
    char c = 'A';
    System.out.println("Char value: " + c);

    // boolean: 1 bit, chỉ có hai giá trị: true hoặc false.
    boolean isJavaFun = true;
    System.out.println("Boolean value: " + isJavaFun);
    
    }
} 