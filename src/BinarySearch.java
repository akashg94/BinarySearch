public class BinarySearch {
    public static void main(String[] args) {


        int[] num = {2, 3, 5, 7, 11, 23, 34, 54, 67, 72, 88, 101};
        int srch = 72;
        int lowerIn = 0;
        int higherIn = num.length - 1;
        int middle = (lowerIn + higherIn) / 2;

        while (lowerIn <= higherIn) {


            if (num[middle] == srch) {
                System.out.println("Your element is at " + middle + "index position" );
                break;
            } else if (num[middle] < srch) {
                lowerIn = middle + 1;
            } else {
                higherIn = middle - 1;
            }
            middle = (lowerIn + higherIn) / 2;
        }
        if(lowerIn > higherIn){
            System.out.println("Element not found");
        }

    }

}