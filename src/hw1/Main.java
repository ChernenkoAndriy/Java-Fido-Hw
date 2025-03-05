package hw1;

//3x/5y int double byte
class Main {
    public static void main(String[] args) {
    int intVar1 =10;
    int intVar2 =9;
    double doubleVar1 =7;
    double doubleVar2 =4.5;
    byte byteVar1 =25;
    byte byteVar2 =2;
         System.out.println("Result for int function. x="
                + intVar1 + " y=" + intVar2 + " f(x, y)=" + solveTheFunction(intVar1, intVar2));
        System.out.println("Result for double function. x="
                + doubleVar1 + " y=" + doubleVar2 + " f(x, y)=" + solveTheFunction(doubleVar1, doubleVar2));
        System.out.println("Result for byte function. x="
                + byteVar1 + " y=" + byteVar2 + " f(x, y)=" + solveTheFunction(byteVar1, byteVar2));
    }

    static int solveTheFunction(int x, int y){
      return 3*x/(5*y);
    }

    static double solveTheFunction(double x, double y){
        return 3*x/(5*y);
    }
    static byte solveTheFunction(byte x, byte y){
        return (byte) (3*x/(5*y));
    }
}