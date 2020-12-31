package lab7;

class SelectionSort implements ISort{
    @Override
    public void sortArray(byte[] array) {
        int maxIndex;
        for(int i=0;i<array.length;i++){
            maxIndex = i;
            for(int j=i;j<array.length;j++){
                if (array[maxIndex] < array[j]){
                    maxIndex = j;
                }
            }
            if (maxIndex != i){
                Swap.swap(array, i, maxIndex);
            }
        }
    }
    
}