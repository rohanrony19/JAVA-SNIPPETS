package Algorithm.BinarySearch;

public class Code1 {
    // arr = {2,4,6,9,11,12,14,20,36,48}
    /*
        1. Find the middle element = 11
        2. target > mid => search in right else search in left
        3. if middle element == target element //ans
               0 1 2 3 4  5  6  7  8  9
        arr = {2,4,6,9,11,12,14,20,36,48}
        target = 36
        mid = 11
        target = 36 > 11
             5  6  7  8  9   5+9/2 = index(7) => 20
        arr {12,14,20,36,48}
        mid = 20
        target = 36 > 20
        arr {36,48}
        target => 36 == 36
        arr1 = [1,2,3,4,5,6,7,8,9,10,11,12,13,14] , target = 14 => N
        arr1 = [8,9,10,11,12,13,14] => N/2
        arr1 = [12,13,14] => N/4
        arr1 = [14] == target = 14 => N/8
     */
}
