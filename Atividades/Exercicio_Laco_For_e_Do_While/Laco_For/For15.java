package Exercicio_Laco_For_e_Do_While.Laco_For;

public class For15 {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++){
            if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
