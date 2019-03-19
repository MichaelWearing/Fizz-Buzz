package fizz.buzz;

public class FizzBuzz {

    public static void main(String[] args) {
        boolean fizz = false;
        boolean buzz = false;
        
        for (int i = 1; i < 100; i++) {
            fizz = false;
            buzz = false;
            String text = "";
            
            if (i % 3 == 0) {
                fizz = true;
            }
            if (i % 5 == 0) {
                buzz = true;
            }
            if (fizz) {
                text += "Fizz ";
            }
            if (buzz) {
                text += "Buzz ";
            }

            if (!fizz && !buzz) {
                text += "" + i;
            }
            System.out.println(text);
        }
    }
}
