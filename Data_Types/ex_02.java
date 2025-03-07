// Bài tập 2: Thao tác với mảng

// Tạo một mảng có 5 số nguyên. 
// Viết một chương trình để tìm giá trị lớn nhất và nhỏ nhất trong mảng, 
// sau đó in chúng ra màn hình.

import java.util.Random;
import java.util.Arrays;

public  class  Ex02 {
    public static void main(String[] args) {
        Random random = new Random();

        int[] five_num_array = new int[5];

        for (int i = 0; i < five_num_array.length; i++) {
            five_num_array[i] = random.nextInt(100);
        }

        

        System.out.println("Array: " + Arrays.toString(five_num_array));

        int max_value = findMax(five_num_array);
        System.out.println("Max value: " + max_value);
        System.out.println("Min value: " + findMin(five_num_array));

    }

    public static int findMax(int[] array){
        int max_value = array[0];

        for (int i : array){
            if (i > max_value){
                max_value = i;
            }
        }
        return max_value;
    }

    public static int findMin(int[] array){
        int min_value = array[0];

        for (int i : array){
            if (i < min_value){
                min_value = i;
            }
        }
        return min_value;
    }
}