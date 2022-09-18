import java.util.Scanner;

public class Shambhavee_class {
    Scanner sc = new Scanner(System.in);

    int[] input_digit() {
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the " + (i + 1) + " digit :");
            num[i] = sc.nextInt();
        }
        return num;
    }

    void checking_digit(int[] numbers) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i != j && j != k && i != k) {
                        System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                    }
                }
            }
        }
    }

}