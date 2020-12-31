package lab7;

class Swap{
    //Метод зміни місць значень
    public static void swap(byte[] arr,int i,int j){
        byte tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}