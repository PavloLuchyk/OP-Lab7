package lab7;

class BubbleSort implements ISort{
    @Override
    public void sortArray(byte[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if (array[j] < array[j+1]){
                    Swap.swap(array, j, j+1);
                }
            }
        }
    }
}