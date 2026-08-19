package Java_Test;

public class String_Dup_Num
{
    public static void main(String[] args)
    {
        int[] numbers = {12, 45, 23, 12, 67, 89, 45, 90, 23};

        System.out.print("The numbers are: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Duplicate numbers are:");

        for (int k = 0; k < numbers.length; k++) {
            for (int j = k + 1; j < numbers.length; j++) {
                if (numbers[k] == numbers[j]) {
                    System.out.println(numbers[j]);
                    break; // Prevents printing the same duplicate multiple times if it appears more than twice
                }
            }
        }
    }
}
