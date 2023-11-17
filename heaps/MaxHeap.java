package heaps;

public class MaxHeap {
    private int[] maxHeapVetor;
    protected int capacity;
    protected int tam;

    public int getTamHeap() {
        return tam;
    }

    public int getCapacityHeap() {
        return capacity;
    }

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.tam = 0;
        this.maxHeapVetor = new int[capacity];
    }

    // Ordenação crescente
    public void arranjarHeapSort(int n) {
        while (n > 0) {
            int temp = maxHeapVetor[0];
            maxHeapVetor[0] = maxHeapVetor[n-1];
            maxHeapVetor[n-1] = temp;
            n -= 1;
            descer(0, n);
        }
    }

    protected void descer(int i, int n) {     
        int j = 2*i + 1;
        if(j <= n - 1) {
            if(j < n - 1 && maxHeapVetor[j+1] > maxHeapVetor[j]) {
                j += 1;
            }
            if(maxHeapVetor[i] < maxHeapVetor[j]) {
                int temp = maxHeapVetor[i];
                maxHeapVetor[i] = maxHeapVetor[j];
                maxHeapVetor[j] = temp;
                descer(j, n - 1);
            }
        }
    }
    
    public void removeHeap() {
        if(tam == 0) {
            System.out.println("o Heap está vazio.");
            return;
        }
        maxHeapVetor[0] = maxHeapVetor[tam-1];
        tam -= 1;
        descer(0, tam);
    }

    protected void subir(int i) {
        int j = (i - 1) / 2;
        if(j >= 0 && maxHeapVetor[i] > maxHeapVetor[j]) {
            int temp = maxHeapVetor[j];
            maxHeapVetor[j] = maxHeapVetor[i];
            maxHeapVetor[i] = temp;
            subir(j);
        }
    }

    public void insertHeap(int chave) {
        if(tam == capacity) {
            System.out.println("o Heap está cheio.");
            return;
        }
        maxHeapVetor[tam] = chave;
        subir(tam); 
        tam += 1;
    }

    public void printHeap() {
        for(int i = 0; i < tam; i++) {
            System.out.print(maxHeapVetor[i] + " ");
        }
        System.out.println();
    }
}