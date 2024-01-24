package lesson7;

public class l7ex2 {

    static void maths(int num1, int num2){
        int calc = num1 * num2;
        System.out.println(num1+"x"+num2+"="+calc);
    }

    public static void main(String[] args) {
        maths(5,6);
        maths(2,63);
        maths(9,6);
        maths(4,26);
    }

}
