import java.util.*;

public class CarsClient{
    public static void main(String[] args){
       Cars [] arr = new Cars[5];
       arr[0] = new Cars(2000, 45, "White"); 
       arr[1] = new Cars(5000, 87, "Yellow"); 
       arr[2] = new Cars(8000, 367, "Black"); 
       arr[3] = new Cars(1000, 98, "Green"); 
       arr[4] = new Cars(7000, 524, "Red");
    //    Sort(arr); 
    //    Sort(arr, new CarsComparatorColor());
    //    Sort(arr, new CarsComparatorSpeed());
    //    Sort(arr, new CarsComparatorPrice());
          Arrays.sort(arr, new Comparator<Cars>(){
            public int compare(Cars o1, Cars o2){
                return o1.speed - o2.speed;
            }
          });

       Display(arr);
    }

    public static <T> void Display(T [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    // public static <T extends Comparable<T>> void Sort(T [] arr){
    //     for(int i=1;i<arr.length;i++){
    //         for(int j=0;j<arr.length-i;j++){
    //             if(arr[j].compareTo(arr[j+1])>0){
    //                 T temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

     public static <T> void Sort(T [] arr, Comparator<T> camp){
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr.length-i;j++){
                if(camp.compare(arr[j], arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}



 class Cars { //implements Comparable<Cars> {
    int speed;
    int price;
    String color;

    public Cars(int speed, int price, String color){
        this.speed = speed;
        this.price = price;
        this.color = color;
    }

    public String toString(){
        return "P "+ this.price +" S "+ this.speed +" C "+ this.color;
    }

    // public int compareTo(Cars o){

    //     //    return this.speed - o.speed;
    //     // return o.price - this.price;

    //     return this.color.compareTo(o.color);

    // }
}


class CarsComparatorSpeed implements Comparator<Cars>{

    public int compare(Cars o1, Cars o2){
        return o1.speed -o2.speed;
    }
}


class CarsComparatorPrice implements Comparator<Cars>{

    public int compare(Cars o1, Cars o2){
        return o2.price -o1.price;
    }
}


class CarsComparatorColor implements Comparator<Cars>{

    public int compare(Cars o1, Cars o2){
        return o1.color.compareTo(o2.color);
    }
}