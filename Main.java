import java.util.Random;
import java.util.Scanner;
import heaps.MaxHeap;
import heaps.MinHeap;

public class Main {
    public static void main(String[] args) {
        MaxHeap kratosMaxHeap = null;
        MinHeap bloodborneMinHeap = null;

        System.out.println("\tOPERAÇÕES");
        System.out.println("-----------------------------------");
        
        Scanner user = new Scanner(System.in);

        System.out.print("Digite a capacidade do heap: ");
        int capacidade = user.nextInt();
        
        System.out.println("\nDigite [1] para escolher Max-heap\nDigite [2] para escolher Min-heap.");
        int heapStruct;
        
        do {
            System.out.print("Digite o comando: ");
            heapStruct = user.nextInt();
            switch (heapStruct) {
                case 1:
                    kratosMaxHeap = new MaxHeap(capacidade);
                    break;
                case 2:
                    bloodborneMinHeap = new MinHeap(capacidade);
                    break;
                default:
                    System.out.println("Comando inválido.\n");
                    break;
            }
        } while(heapStruct != 1 && heapStruct != 2);
        
        System.out.println("\n");
        
        System.out.println("[COMANDOS] - Opções");
        System.out.printf("[1].\tGerar um vetor com valores aleatórios de tamanho %d\n", capacidade);
        System.out.println("[2].\tInserção de elemento.");
        System.out.println("[3].\tRemoção de elemento.");
        System.out.println("[4].\tOrdenação conforme o Heapsort.");
        System.out.println("[5].\tVisualizar a fila e o seu tamanho.");
        System.out.println("[6].\tLimpar a fila de prioridade.");
        System.out.println("[0].\tParar o programa.\n");
        
        int comando;
        do {    
            System.out.print("Escolha um comando: ");
            comando = user.nextInt();  
            switch (comando) {
                case 0:
                    System.out.println("\nSaindo do programa.");
                    break;
                case 1:
                    System.out.print("\nVetor: ");
                    int[] generatedRandomNumberArray = new int[capacidade];
                    Random randomValue = new Random();
                    for(int r = 0; r < capacidade; r++) {
                        int randomNumber = randomValue.nextInt(100);
                        generatedRandomNumberArray[r] = randomNumber;
                        System.out.print(randomNumber + " ");
                    }
                    if(heapStruct == 1) {
                        kratosMaxHeap.setTamHeap(0);
                        for(int i : generatedRandomNumberArray) {
                            kratosMaxHeap.insertHeap(i);
                        }
                        System.out.println("\nMax-heap: " + kratosMaxHeap.toString());
                    } else if (heapStruct == 2) {
                        bloodborneMinHeap.setTamHeap(0);
                        for(int j : generatedRandomNumberArray) {
                            bloodborneMinHeap.insertHeap(j);
                        }
                        System.out.println("\nMin-heap: " + bloodborneMinHeap.toString());
                    }
                    System.out.println("\nGerado com sucesso!");
                    break;
                case 2: //Inserção
                    
                    break;
                case 3: // Remoção
                
                    break;
                case 4: // Ordenação
                
                    break;
                case 5: // Visualizar
                
                    break;
                case 6: // Clear
                
                    break;  
                default:
                    System.out.println("Digite um comando válido.");
                    break;
            }
        } while (comando != 0);
        
        user.close();
    }
}
