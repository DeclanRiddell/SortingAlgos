public class ImprovedSelectionSort {

    //Dont really know what im improving on
    public void improvedSelectionSort(int array[]){
        int n = array.length;
        for (int i = 0; i < n-1; i++){
            int search = i;
            for (int k = i+1; k < n; k++){
                if (array[k] < array[search]){
                    search = k;
                }
                else {
                    int swapIndex = array[search];
                    array[search] = array[i];
                    array[i] = swapIndex;
                }
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
        ImprovedSelectionSort iss = new ImprovedSelectionSort();
        int array[] = {2, 5, 6, 1, 8};
        iss.improvedSelectionSort(array);
        System.out.println(iss.toString(array));
    }
}

