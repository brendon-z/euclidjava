import java.util.Scanner;

class Euclid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in numbers via command line
        System.out.println("Enter number one: ");
        int inputNumber1 = Math.abs(Integer.parseInt((scanner.nextLine())));
        
        System.out.println("Enter number two: ");
        int inputNumber2 = Math.abs(Integer.parseInt((scanner.nextLine())));

        int gcdResult = new Euclid().getGCD(inputNumber1, inputNumber2);
        System.out.println("The GCD is: " + gcdResult);

        scanner.close();
    }

    public int getGCD(int x1, int x2) {
        int remainder = divisionAlgo(x1, x2);
        if (remainder == 0) {
            return x2;
        } else {
            return getGCD(x2, remainder);
        }
    }

    // Simple "subtract until you can't no more" division algorithm
    public int divisionAlgo(int x1, int x2) {
        int smallest = Math.min(x1, x2);
        int remainder = Math.max(x1, x2);

        while (remainder >= smallest) {
            remainder -= smallest;
        }

        return remainder;
    }
}
