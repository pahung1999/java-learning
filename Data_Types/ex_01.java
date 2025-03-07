
// Bài tập 1: Tính toán diện tích và chu vi hình chữ nhật

// Viết một chương trình có hai biến kiểu int cho chiều dài và chiều rộng của hình chữ nhật. 
// Tính và in ra diện tích và chu vi của hình chữ nhật.

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        System.out.print("Enter width: ");
        int width = scanner.nextInt();

        
        Rectangle rec = new Rectangle(length, width);

        System.out.println(rec.getInfo());
        System.out.println("Area = " + rec.getArea());
        System.out.println("Perimeter = " + rec.getPerimeter());
    }
}

class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    
    public String getInfo(){
        return "Length: " + length + ", Width: " + width;
    }

    public int getArea(){
        return length*width;
    }

    public int getPerimeter(){
        return  2*(length+width);
    }

}