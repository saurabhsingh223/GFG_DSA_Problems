//move negatives to zero
/*
  Input : arr[] = [1, -1, 3, 2, -7, -5, 11, 6 ]
  Output : [1, 3, 2, 11, 6, -1, -7, -5]
  Explanation: By doing operations we separated the integers without changing the order.
 */

import java.util.*;

 class Move_Negatives_to_end {
    public void segregateElements(int[] arr) {
        // Your code goes here
        List<Integer> list = new ArrayList<>();
        for(int i : arr){
            if(i >= 0) list.add(i);
        }
        for(int i : arr){
            if(i < 0) list.add(i);
        }
        int j = 0;
        for(int i : list){
            arr[j] = i;
            j++;
        }
    }
}