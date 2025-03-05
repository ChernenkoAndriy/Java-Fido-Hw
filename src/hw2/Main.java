package hw2;

 class Main {
    public static void main(String[] args) {
        int[] testnums = {-1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int n : testnums){
         try {
         System.out.println("Recursive value for staircase height: " + n + ":" +
                 "           " + recursiveWaysCount(n));
         System.out.println("Recurrent value for staircase height: " + n + ":" +
                     "           " + recurrentWaysCount(n));
         } catch (IllegalArgumentException e){
             System.out.println("Exception caught: "  + e.getMessage());
         }
        }
    }
    public static int recursiveWaysCount(int n){
    if(n<0) throw new IllegalArgumentException("n is negative: " + n);
    if(n==0) return 0;
    if(n==1) return 1;
    if(n==2) return 2;
    return recursiveWaysCount(n-1) + recursiveWaysCount(n-2);
    }

    public static int recurrentWaysCount(int n) {
        if (n < 0) throw new IllegalArgumentException("n is negative: " + n);
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int first = 1;
        int second = 2;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = first + second;
            first = second;
            second = current;
        }
        return current;
    }

}

