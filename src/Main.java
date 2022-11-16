class Main {
    private static int[] numbers = {22, 13, 10, 80, 19, 54, 51, 81, 30, 99, 91, 73, 65, 36, 35, 74, 82, 12, 43, 6};

    public static void selectionSort() {
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
    public static void main(String[] args){
        SortedNumbers sorted = new SortedNumbers(10);
        sorted.addNumber(7);
        sorted.addNumber(3);
    }
}