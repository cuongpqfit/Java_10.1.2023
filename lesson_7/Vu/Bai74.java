public class Bai74 {
//     Bài 4: Viết code giải thuật sắp xếp nổi bọt
// begin BubbleSort(list)

//    for all elements of list
//       if list[i] > list[i+1]
//          swap(list[i], list[i+1])
//       end if
//    end for

//    return list


public static void main (String[]agrs ){

    int[] a = {4,2,1,7,3,8,5,10};
    int n =  a.length;

    for (int i : a)
    System.out.print(i+ " ");
    System.out.println();

    for ( int i= 0; i< n-1; i++){
        for ( int j=0 ; j<n-1 ; j++){
            if ( a [j] > a[j+1]){
                int tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
            }
        }
    }
    
    for ( int i : a)
    System.out.print( i + " "); 

    }

}