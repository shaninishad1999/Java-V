/* 4 Create an array of 5 integers and print sum and average by creating Integer sum(Integer[] arr) and
Double average(Integer sum, Integer numberOfElements).
Do casting as required for getting proper result;*/
public class ArraySumAndAverage {
    public static void main(String[] args) {
        // Step 1: Create an array of 5 integers
        Integer[] numbers = {10, 20, 30, 40, 50};

        // Calculate the sum of the array elements
        Integer totalSum = sum(numbers);
        System.out.println("Sum: " + totalSum);

        // Calculate the average of the array elements
        Integer numberOfElements = numbers.length;
        Double averageValue = average(totalSum, numberOfElements);
        System.out.println("Average: " + averageValue);
    }

    // Method to calculate the sum of elements in the array
    public static Integer sum(Integer[] arr) {
        Integer sum = 0;
        for (Integer num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate the average of the sum
    public static Double average(Integer sum, Integer numberOfElements) {
        // Perform casting to ensure proper division and result
        return (numberOfElements == 0) ? 0.0 : sum.doubleValue() / numberOfElements;
    }
}

