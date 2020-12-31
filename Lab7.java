package lab7;
import java.util.Arrays;

public class Lab7 {
    public static void main(String[] args) {
        Context sorting = new Context();
        sorting.setStrategy(new BubbleSort());
        printResults(new byte[]{3,5,6,1,9}, sorting);
        printResults(new byte[]{12,3,8,5,11,1,3}, sorting);
        sorting.setStrategy(new SelectionSort());
        printResults(new byte[]{5,99,2,1,6,7,48,5}, sorting);
        printResults(new byte[]{11,22,63,19,84,53,33}, sorting);
        sorting.setStrategy(new InsertionSort());
        printResults(new byte[]{1, 2, 97, 46, 23, 88, 99, 11}, sorting);
        printResults(new byte[]{26, 27, 18,55, 10,21,1}, sorting);
        printResults(null, sorting);
        printResults(new byte[]{26, 27, 18,55, 10,21,1}, null);
        printResults(new byte[]{}, sorting);
        
    }
       
    public static void checkExceptions(byte[] array,Context context){
        if (array == null){
            throw new NullPointerException("Array cannot be null");
        }
        if (context == null){
            throw new NullPointerException("Context cannot be null");
        }
        if (array.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }
        
    }
    
    public static void printResults(byte[] array,Context context){
        try{
            checkExceptions(array,context);
            context.executeStrategy(array);
            System.out.println(Arrays.toString(array));
        } catch(IllegalArgumentException | NullPointerException e){
            System.out.println("Exception! " + e.getMessage());
        }
    }
}
