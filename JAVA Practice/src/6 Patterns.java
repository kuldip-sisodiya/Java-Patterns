import java.util.Scanner;

class NoPatterns5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the Number :");
//        int no = input.nextInt();
        int value = 1;

        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(" "+value);
                value ++;
            }
            System.out.println();
        }
    }
}
