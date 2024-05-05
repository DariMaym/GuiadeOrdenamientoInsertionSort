public class App {
    public static void main(String[] args) throws Exception {
    System.out.println("Metodo de ordenamiento por inserction");
    int[] arr = {12, 11, 13, 5, 6};
    System.out.println("arreglo original");
    for (int num : arr) {
        System.out.println(num);
    }


    System.out.println("==============================");
    insertionSort(arr);//llamada del metodo

    System.out.println("Arreglo ordenado");
    for (int num : arr) {
        System.out.println(num);
    }






    }
    //metodo para ordenar
    public static void insertionSort(int [] arr){
        //se define una variable que guardará el tamaño del arreglo
        int n = arr.length;
        //con el for iteramos el numero de veces segun el tamaño del arreglo que guardamos previamente con la variable n
        for (int i = 0; i < n; i++) {
            //"key" tendrá la posición i en el arreglo que va a comparar
            int key = arr[i];
            int j= i-1;
            //comparamos las posiciones del arreglo para determinar el numero menor
            while ((j>=0 && arr[j] > key)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1]= key;

        }
    }
}
