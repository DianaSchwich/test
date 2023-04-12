package ifElseeee;

public class ifElseStatement2 {
    public static void main(String[] args) {
        int accountBalance=3000;


        if(accountBalance>1000)
        {
            System.out.println("Yay lets go shopping");
        }
        char gender='M';
        if(gender=='F')
        {
            System.out.println("We always like shopping");

        }
        ///////////////////////////////

        String expected="Best sellers";
        if(expected.equals ("Best Sellers")){
            System.out.println("Test Passes");
        }else{
            System.out.println("Test Fail");
        }
    }
}
