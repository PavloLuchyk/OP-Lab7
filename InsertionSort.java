package lab7;

class InsertionSort implements ISort{
    @Override
    public void sortArray(byte[] arr){
        byte key;
        int j;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while (j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }        
    }
}