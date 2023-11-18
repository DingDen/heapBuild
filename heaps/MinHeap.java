package heaps;

import java.util.Arrays;

public class MinHeap extends MaxHeap {
    private int[] minHeapVetor;

    @Override
    public int[] getHeapVetor() {
        return minHeapVetor;
    }
    
    @Override
    public int setTamHeap(int tam) {
        return this.tam = tam;
    }

    public MinHeap(int capacity) {
        super(capacity);
        this.capacity = capacity; 
        this.tam = 0;
        this.minHeapVetor = new int[capacity];
    }

    @Override
    public void arranjarHeapSort(int n) {   // Ordenação decrescente
        while (n > 0) {
            int temp = minHeapVetor[0];
            minHeapVetor[0] = minHeapVetor[n-1];
            minHeapVetor[n-1] = temp;
            n -= 1;
            descer(0, n);
        }
    }

    @Override
    protected void descer(int i, int n) {
        int j = 2*i + 1;
        if(j <= n - 1) {
            if(j < n - 1 && minHeapVetor[j+1] < minHeapVetor[j]) {
                j += 1;
            }
            if(minHeapVetor[i] > minHeapVetor[j]) {
                int temp = minHeapVetor[i];
                minHeapVetor[i] = minHeapVetor[j];
                minHeapVetor[j] = temp;
                descer(j, n - 1);
            }
        }
    }

    @Override
    protected void subir(int i) {
        int j = (i - 1) / 2;
        if(j >= 0 && minHeapVetor[i] < minHeapVetor[j]) {
            int temp = minHeapVetor[j];
            minHeapVetor[j] = minHeapVetor[i];
            minHeapVetor[i] = temp;
            subir(j);
        }
    }
    
    @Override
    public void insertHeap(int chave) {   
        if(tam == capacity) {
            System.out.println("o Heap está cheio.");
            return;
        }
        minHeapVetor[tam] = chave;
        subir(tam); 
        tam += 1;
    }

    @Override
    public void removeHeap() {
        if(tam == 0) {
            System.out.println("o Heap está vazio.");
            return;
        }
        minHeapVetor[0] = minHeapVetor[tam-1];
        tam -= 1;
        descer(0, tam);
    }

    @Override
    public void printHeap() {
        for(int i = 0; i < tam; i++) {
            System.out.print(minHeapVetor[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void clearHeap(int[] minHeapVetor) {
        Arrays.fill(minHeapVetor, 0);
    }

    @Override
    public String toString() {
        return Arrays.toString(minHeapVetor);
    }
}
