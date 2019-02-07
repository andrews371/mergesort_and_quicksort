import java.util.Scanner;

 
public class QuickSort {
	 
    	public static void quickSort(int[] v, int esquerda, int direita) {
    	int pivo;
    	if (esquerda < direita) {
        	pivo = particao(v, esquerda, direita);
     	 quickSort(v, esquerda, pivo -1);
   	 quickSort(v, pivo+1, direita); 	 
   	 
      	}

    }

    public static int particao (int[] v, int esquerda, int direita) {
    	int esq = esquerda + 1;
        	int dir = direita;
        	int pivo = v[esquerda];
        	int aux;

    	while (esq <= dir) {
            	if (v[esq] <= pivo) {
                	esq = esq + 1;
            	}
            	else if (v[dir] > pivo) {
                	dir = dir - 1;
            	}
            	if (esq <= dir){
               	aux = v[esq];
               	v[esq] = v[dir];
               	v[dir] = aux;
   		esq = esq + 1;
               	dir = dir - 1;
     		 }
   	}
       
   	v[esquerda] = v[dir];
   	v[dir] = pivo;   	 
   	return dir;

    }
    
    public static void printArray(int array[]){  
        	int n = array.length;  
        	for (int i=0; i<n; ++i)  
            	System.out.print(array[i] + " ");  
        	System.out.println();  
    	}

 
    	public static void main(String args[]) {
        	int tam;
    	 
		 	Scanner entrada = new Scanner(System.in);
    	 
        	System.out.print("Informe o tamanho do array: ");
        	tam = entrada.nextInt();
    	 
        	int[] array = new int[tam];
    	 
    	for (int i = 0; i < tam; i++) {
        	System.out.print("Digite o elemento " + (i+1) + ": ");
        	array[i] = entrada.nextInt();
    	}
    	System.out.println();
    	System.out.println("array inicial");  
    	printArray(array);
 
    	quickSort(array, 0, array.length - 1);
       
    	System.out.println("\narray ordenado");  
        	printArray(array);  
    	}
 
}
