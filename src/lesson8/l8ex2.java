package lesson8;

public class l8ex2 {

    public static void main(String[] args) {

        Integer[] scores ={96, 64, 53, 37, 75};
        for (Integer value : scores) {
            System.out.println(value);
        }
        Integer total = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
        System.out.println( total/5 );
    }
}
