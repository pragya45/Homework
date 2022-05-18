import java.util.Arrays;
import java.util.Scanner;

class a_average{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for(int j=0;j<nums.length;j++){
            System.out.print("Enter the number: ");
            nums[j]=scanner.nextInt();
        }
        double average;
        int sum=0;
        for(int i=0; i<nums.length;i++){
            sum+=nums[i];
        }
        average = sum/nums.length+sum%nums.length;
        System.out.println("The average value is "+average);
    }
}
class b_textContains{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.println(text(num));
    }
    public static boolean text(int num){
        int[] myArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        for(int i=0;i<myArray.length;i++){
            if(myArray[i]==num){
                return true;
            }
        }
        return false;
    }
}
class c_findMinMax{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int num = scanner.nextInt();
        int[] myArray = new int[num];
        for(int i=0;i<myArray.length;i++){
            System.out.print("Enter the number: ");
            myArray[i]= scanner.nextInt();
        }
        find(myArray);

    }

    public static void find(int[] args) {
        int max=0;
        for(int i=0;i< args.length;i++){
            if(args[i]>max){
                max=args[i];
            }

        }
        System.out.println("The maximum value is "+max);
        int min=args[0];
        for(int j=0; j<args.length;j++){
            if(args[j]<min){
                min=args[j];
            }
        }
        System.out.println("The minimum number is "+min);
    }
}
//WAP to create a function which accepts array as
// an parameter and you need to count all those numbers which are factors of 2 .
class d_CountFactor{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want in the array: ");
        int num = scanner.nextInt();
        int[] ar = new int[num];
        for(int i =0; i<ar.length;i++){
            System.out.print("Enter the number: ");
            ar[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        System.out.println(countFactor(ar));

    }
    public static int countFactor(int[] args){
        int count=0;
        for(int i=0;i<args.length;i++){
            if(args[i]==1||args[i]==2){
                count++;
            }
        }
        return count;
    }
}
class e_createArray{
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array()));
    }

    public static int[] array() {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        return a ;
    }
}
//WAP to create a function where you have to add all the elements which are the factors of
//both 11 and 5. Here, you have to return thus obtained sum.
class f_factors5n11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of element in the array: ");
        int num = scanner.nextInt();
        int[] a = new int[num];
        for(int i= 0 ; i<a.length;i++){
            System.out.print("Enter the number: ");
            a[i]=scanner.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sumFactor5n11(a));
    }
    public static int sumFactor5n11(int[] args){
        int sum=0;
        for(int i=0; i<args.length;i++){
            if(args[i]%5==0&&args[i]%11==0){
                sum+=args[i];
            }
        }
        return sum;
    }
}
class g_reverse{
    public static void main(String[] args) {
        System.out.println(reverseNumber(12345));
    }
    static int reverseNumber(int num){
        int rev=0;
        while(num!=0){
            int rem = num%10;
            rev=rev*10+rem;
            num/=10;
        }
        return rev;
    }
}
