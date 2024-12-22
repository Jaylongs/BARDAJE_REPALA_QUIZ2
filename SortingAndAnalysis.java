import java.util.Scanner;

class SortingandAnalysis {

    // Bubble Sort Function (Ascending)
    static void bubbleSort(int[] arr, int n) {
        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < n - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort Function (Descending)
    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; ++i) {
            int maxIndex = i;
            for (int j = i + 1; j < n; ++j) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            // Swap arr[i] and arr[maxIndex]
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Main Function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10; // Number of power levels
        int[] powerLevels = new int[n];

        // Input: Ask the user to enter 10 power levels
        System.out.println("Enter the power levels of 10 creatures:");
        for (int i = 0; i < n; ++i) {
            powerLevels[i] = scanner.nextInt();
        }

        // Perform Bubble Sort (Ascending)
        int[] ascending = powerLevels.clone();
        bubbleSort(ascending, n);

        // Display Bubble Sort result
        System.out.print("\nBubble Sort (Ascending): ");
        for (int level : ascending) {
            System.out.print(level + " ");
        }

        // Perform Selection Sort (Descending)
        int[] descending = powerLevels.clone();
        selectionSort(descending, n);

        // Display Selection Sort result
        System.out.print("\nSelection Sort (Descending): ");
        for (int level : descending) {
            System.out.print(level + " ");
        }

        // Analysis: Calculate sums, min, and max
        int sumEven = 0, sumOdd = 0;
        int min = powerLevels[0], max = powerLevels[0];
        for (int level : powerLevels) {
            // Check if even or odd
            if (level % 2 == 0) {
                sumEven += level;
            } else {
                sumOdd += level;
            }
            // Find min and max
            if (level < min) {
                min = level;
            }
            if (level > max) {
                max = level;
            }
        }

        // Display analysis results
        System.out.println("\n\nAnalysis:");
        System.out.println("Sum of Even Numbers: " + sumEven);
        System.out.println("Sum of Odd Numbers: " + sumOdd);
        System.out.println("Minimum Power Level: " + min);
        System.out.println("Maximum Power Level: " + max);

        scanner.close(); // Close the scanner
    }
}