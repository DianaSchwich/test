package Class3;

public class ShortHandAddition {
    public static void main(String[] args) {


        // pick whatever is stored in number container and add 20 to that value and
        // store the results back to number variable
        //   number=number+20; //30
        // we are saying to java add 20 to the previous value of number variable

        int number = 10;
        number = number + 20;
        System.out.println(number);

        int number1 = 10;
        number1 += 20;
        System.out.println(number1);
    }
}
