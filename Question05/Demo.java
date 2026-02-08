class EvenOddNumber {
    
    boolean findEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}


public class Demo {
    public static void main(String[] args) {
        EvenOddNumber obj = new EvenOddNumber();

        int number = 2;

        if (obj.findEvenOrOdd(number) == true) {
            System.out.println(number + " is Even number");
        } else {
            System.out.println(number + " is Odd number");
        }
    }
}
