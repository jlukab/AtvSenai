package Exercicio_Laco_For_e_Do_While.Do_While;

public class While07 {
    public static void main(String[] args) {
        int num = 1;

        do {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }while(num <=20);
    }
}
