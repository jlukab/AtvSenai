package Exercicio_Laco_For_e_Do_While.Laco_For;

public class For29 {
    public static void main(String[] args) {
    int[] array = {14, 8, 52, 63, 42, 2, 97};

    for (int i = 0; i < array.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < array.length; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j;
            }
        }
        int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
    }

    System.out.println("Vetor ordenado:");
    for (int num : array) {
        System.out.print(num + " ");
    }
}
}
