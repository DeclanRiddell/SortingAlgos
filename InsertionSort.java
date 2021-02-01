public class InsertionSort {

    public void insertionSort(int array[]){
        int n = array.length;
        for (int i = 0; i < n-1; i++){
            int search = array[i];
            for (int k = i-1; k >= 0; k++){
                if(array[k] > search){
                    array[k+1] = array[k];
                    k = k-1;
                }
                array[k+1] = search;
            }
        }
    }

    public String toString(int array[]){
        String s = "";
        for (int i = 0; i < array.length; i++){
            s += array[i] + " ";
        }
        return s;
    }

    public static void main(String args[]){
        InsertionSort ins = new InsertionSort();
        int array[] = {2, 5, 6, 1 ,8};
        ins.insertionSort(array);
        System.out.println(ins.toString(array));
    }
}
