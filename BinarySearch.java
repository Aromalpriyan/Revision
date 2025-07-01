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

