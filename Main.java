import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import heaps.MaxHeap;
import heaps.MinHeap;

public class Main {
    public static void main(String[] args) {
        
        int [] generateRandomNumberArray = new int[10];
        Random generateRandomNumber = new Random();
        
        System.out.print("Vetor de entrada: ");
        MaxHeap kratos = new MaxHeap(10);
        for(int i = 0; i < 10; i++) {
            int randomNumber = generateRandomNumber.nextInt(100);
            generateRandomNumberArray[i] = randomNumber;
            System.out.print(randomNumber + " ");
        }
        
        System.out.println();
        
        System.out.print("Max-heap: ");

        for(int j : generateRandomNumberArray) {
            kratos.insertHeap(j);
        }
        
        kratos.printHeap();

        System.out.println();

        kratos.arranjarHeapSort(kratos.getTamHeap());

        System.out.print("Vetor ordenado crescente: ");
        kratos.printHeap();

        Arrays.fill(generateRandomNumberArray, 0);
        
        System.out.println("\n");
        
        // TESTE MIN-HEAP
        MinHeap bloodborne = new MinHeap(10);

        System.out.print("Vetor de entrada: ");
        for(int i = 0; i < 10; i++) {
            int randomNumber = generateRandomNumber.nextInt(100);
            generateRandomNumberArray[i] = randomNumber;
            System.out.print(randomNumber + " ");
        }

        System.out.println();

        System.out.print("Min-Heap: ");
        
        for(int j : generateRandomNumberArray) {
            bloodborne.insertHeap(j);
        }

        bloodborne.printHeap();

        System.out.println();

        bloodborne.arranjarHeapSort(bloodborne.getTamHeap());
        
        System.out.print("Vetor ordenado decrescente: ");
        
        bloodborne.printHeap();

        

        // INTERFACE - OPERAÇÕES - USUÁRIO

        // System.out.println("");
        
        // Scanner user = new Scanner(System.in);


        
        
        // user.close();
    }
}
