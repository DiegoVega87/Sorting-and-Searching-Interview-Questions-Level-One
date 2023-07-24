import java.util.Arrays;


public class FindingShipments {
    /*
    * As a startup in the logistics industry, we have a massive matrix containing information about different shipments.
    * We need to quickly search for a specific shipment based on its unique identifier and are looking for an algorithm
    * that can efficiently search for the target value in the 2D matrix.
    * The algorithm should return True if the identifier is found, else False.
    *
    * Example 1:
    *   matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    *   target = 5;
    *   Output: true
    *
    * Example 2:
    *   int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    *   target = 10;
    *   Output: False
    *
     * */


    public static boolean searchShipment(int[][] matrix, int target){

        int rows = matrix.length;
        int columns = matrix[0].length;

        int start = 0;
        int end = (rows * columns)-1;

        while(start <= end){

            int mid = start + (end - start)/2;
            int midValue = matrix[mid / columns][mid % columns];

            if(midValue == target){
                return true;
            }else if(target > midValue){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return false;
    }
}
