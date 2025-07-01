# Revision
## <p>1. BinarySearch<p>
```
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the sorted array: ");    
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.println("Enter " + size + " sorted elements: ");
    for(int i =0 ; i<size; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the element of search: ");
    int target = sc.nextInt();
   int result = binary(arr, target) ;
   if (result== -1){
    System.out.println("Element not found at index: " + result);
   }else{
    System.out.println("Element found at index: " + result);
   }

    }
    public static int binary(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
    while(low<= high){
        int mid = low + (high-low)/2;

        if(arr[mid]== target){
            return mid;
    }else if (arr[mid]<target){
        low = mid + 1;
    }else{
        high = mid - 1;
    }
}
    return -1;

    }
    }
```
## <p>2. BinaryToDecimal<p>
```
public class BinaryToDecimal {
    public static void main(String[] args) {
        String binary = "1101111";
        int decimal = Integer.parseInt(binary,2);
        System.out.println("Decimal of binary"+ binary + " is: " + decimal);
    }
    
}
```
## <p>3. DecimalToBinary<p>
```
public class DecimalToBinary{
    public static void main(String[] args){
        int number = 9;
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary of " + number + " is: " + binary);

    }
}
```
## <p>4. FibonacciSeries<p>
```
public class DecimalToBinary{
    public static void main(String[] args){
        int number = 9;
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary of " + number + " is: " + binary);

    }
}
```
## <p>5. ReverseNumber<p>
```
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
```

[githublink]()