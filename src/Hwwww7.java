import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* Write code that creates an ArrayList that can hold string objects. Add the names of
three cars to the ArrayList, and then display the contents of the ArrayList
* */
class Q1{
    public static void main(String[] args) {
        System.out.println(displayCar());

    }
    static ArrayList<String> displayCar(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>();
        for(int i=0;i<3;i++){
            System.out.print("Enter name of the car: ");
            String car = scanner.next();
            str.add(i,car);
        }
        return str;
    }
}
/*. WAP to create a function which accepts the arraylist of integer of size 10 as
parameter and return the sum of prime numbers present in it.*/
class Q2_IntSumprime{
    public static void main(String[] args) {
        ArrayList<Integer> yourArray= new ArrayList<Integer>();
        yourArray.add(0,55);
        yourArray.add(1,5);
        yourArray.add(2,3);
        yourArray.add(3,7);
        yourArray.add(4,6);
        int ans =sumPrime(yourArray);
        System.out.println(ans);
    }
    static int sumPrime(ArrayList<Integer> myArray){

        int sum =0;
        for(int i=0;i<myArray.size();i++){
            int count =0;
            for(int j=2;j<myArray.get(i);j++){
                if(myArray.get(i)%j==0){
                    count+=1;
                }
            }
            if(count==0){
                sum+=myArray.get(i);
            }
        }
        return sum;

    }
}
/*WAP to sort the integer elements of array of size 10 in ascending and descending
order*/
class Q3_Sort{
    public static void main(String[] args) {


    }
    static ArrayList<Integer> ass(ArrayList<Integer> myArray){
        Collections.sort(myArray);
        return myArray;
    }
    static ArrayList<Integer> dec(ArrayList<Integer> myArray){
        Collections.reverse(myArray);
        return myArray;
    }
}


