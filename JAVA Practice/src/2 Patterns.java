import java.util.Scanner;

class NoPatterns{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int no = input.nextInt();

        for (int i=1;i<=no;i++){
            for (int j=1;j<=no;j++){
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
