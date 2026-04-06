package dsa.KKvideo.lec11;

public class _04Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

//        int temp = a;
//        a = b;
//        b = temp;
        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Shivesh Jha";
        changeName(name);
        System.out.println(name);
    }

    static void changeName(String name) {
        name = "Rahul Bharti";
    } // creating a new object

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp; // this change will be valid in this function scope only!
    }
}
