public class SortedNumbers {
    private int[] numbers;
    private int firstFree;

    public SortedNumbers(int size){
        numbers = new int[size];
        firstFree =0;
    }

    public void addNumber(int n) {
        //add a new element, preserving sorted order
        if (firstFree < numbers.length) {
            numbers[firstFree] = n;
            firstFree++;
            selectionSort();
        }
    }
    public int size(){
        return firstFree;
    }

    public void selectionSort() {
        for (int unsortedPos = 0; unsortedPos < numbers.length; unsortedPos++) {
            int minPos = unsortedPos;
            for (int searchPos = unsortedPos + 1; searchPos < numbers.length; searchPos++) {
                if(numbers[searchPos] < numbers[minPos]){
                    minPos = searchPos;
                }
            }
            if(minPos != unsortedPos) {
                int temp = numbers[unsortedPos];
                numbers[unsortedPos] = numbers[minPos];
                numbers[minPos] = temp;
            }
        }
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+", ");
        }
        System.out.println("");
    }
}
