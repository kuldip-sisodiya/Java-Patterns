class oddNoPatterns {
    public static void main(String[] args) {

        int odd = 1;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print(" "+odd);
                odd=odd+2;
            }
            System.out.println();
        }
    }
}
