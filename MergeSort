import java.util.Scanner;
 
class MergeSort  
{  
	public static void mergeSort(int[] array, int l, int r) {
    	if (l < r) {
        	int m = (l + r) / 2;
        	mergeSort(array, l, m);
        	mergeSort(array, m + 1, r);
        	merge(array, l, m, r);
    	}
	}
	 
	public static void merge(int array[], int l, int m, int r)  
	{  
    int[] array2 = new int[r+1];
 
    for (int k = l; k <= r; k++)    
	 	array2[k] = array[k];
    	int i = l;
    	int j = m + 1;
 
    for (int k = l; k <= r; k++) {
      	if (i > m) {
   	 array[k] = array2[j];
   	 j++;
    	}
    	else if (j > r) {
      	 array[k] = array2[i];
   	 i++;
    	}
    	else if (array2[i] < array2[j]){
   	 array[k] = array2[i];
   	 i++;
    	}
    	else {
   	 array[k] = array2[j];
         j++;
    	}
    }
 
 
	}
    	 
	/* funcao para imprimir array de tamanho n */
	public static void printArray(int array[])  
	{  
    	int n = array.length;  
    	for (int i=0; i<n; ++i)  
        	System.out.print(array[i] + " ");  
    	System.out.println();  
	}  
   
	public static void main(String args[])  
	{  
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
 
    	mergeSort(array, 0, tam - 1);
   
    	System.out.println("\narray ordenado");  
    	printArray(array);  
    System.out.println();
	}  
}
 


