public class ReverseNumber {
    public static void main(String[] args) {
       int number = 102030;
        int original = number;
        int reversed = 0;
    while(number !=0){
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number/=10;
    } 
    System.out.println("Reversed of " + original + " is: " + reversed);   
    }
}

