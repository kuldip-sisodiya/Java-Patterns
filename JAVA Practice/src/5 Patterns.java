import java.util.Scanner;

class NoPatterns4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int no = input.nextInt();

        for (int i=no;i>=1;i--){
            for (int j=no;j>=1;j--){
                System.out.print(" "+j);
            }
            System.out.println();
        }
    }
}
