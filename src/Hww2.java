 import java.util.Scanner;

//1. Write a JAVA program to find maximum between two numbers.
public class Hww2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        if (num1>num2){
            System.out.println("Maximum number: "+num1);
        }else {
            System.out.println("Maximum number: "+num2);
        }
    }
}

//2. Write a JAVA program to find maximum between three numbers.
class Max {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("Maximum number: "+num1);
        }else if(num2>num1 && num2>num3){
            System.out.println("Maximum number: "+num2);
        }else{
            System.out.println("Maximum number is "+num3);

        }
    }
}

//3. Write a JAVA program to check whether a number is negative, positive or zero.
class CheckNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        if (num<0){
            System.out.println("Number is negative");
        }else if(num>0){
            System.out.println("Number is positive");
        }else{
            System.out.println("Number is zero");
        }
    }
}

//4. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
class Div{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=scanner.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("Given number is divisible by 5 and 11");
        }else{
            System.out.println("Given number is not divisible by 5 and 11");
        }
    }
}

//5. Write a JAVA program to check whether a number is even or odd.
class OddEven{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println("Given number is even");
        }else{
            System.out.println("Given number is odd");
        }
    }
}

//6. Write a JAVA program to check whether a year is leap year or not.
class LeapYear{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any year");
        int year=scanner.nextInt();
        if (year%400==0 || year%4==0 && year%100!=0)  {
            System.out.println("Leap year");
        }else{
            System.out.println("Not a leap year");
        }
    }
}


//7. Write a JAVA program to check whether a character is alphabet or not.
class Character{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any character");
        char a=scanner.next().charAt(0);
        if ((a>='a' && a<='z') || (a>='A' && a<='Z') ){
            System.out.println("Given character is alphabet");
        }else{
            System.out.println("Given character is not alphabet");
        }
    }
}

//8. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
class Alphabet{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char a=scanner.next().charAt(0);
        if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            System.out.println("Given alphabet is vowel");
        }else{
            System.out.println("Given alphabet is constant");
        }
    }
}

//  9.  Write a JAVA program to input any character and check whether it is alphabet, digit or special
//character.

class CheckCharacter{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any character");
        char a=scanner.next().charAt(0);
        if ((a>='a' && a<='z') || (a>='A' && a<='Z') ){
            System.out.println("Given character is alphabet");
        }else if (a>='0' && a<='9' ){
            System.out.println("Given character is digit");
        }else{
            System.out.println("Given character is special character");
        }
    }
}

//10. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
class UpperLower{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char a=scanner.next().charAt(0);
        if (a>='a' && a<='z'){
            System.out.println("Given alphabet is  lowercase alphabet");
        }else if (a>='A' && a<='Z'){
            System.out.println("Given alphabet is  uppercase alphabet");
        }
    }
}

//11. Write a JAVA program to input week number and print weekday.

class Week{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter week number:");
        int number=scanner.nextInt();
        if (number==1){
            System.out.println("Sunday");
        }
        else if (number==2){
            System.out.println("Monday");
        }
        else if (number==3){
            System.out.println("Tuesday");
        }
        else if (number==4){
            System.out.println("Wednesday");
        }
        else if (number==5){
            System.out.println("Thursday");
        }
        else if (number==6){
            System.out.println("Friday");
        }
        else if (number==7){
            System.out.println("Sunday");
        }else{
            System.out.println("Enter week number between 1-7");
        }

    }
}

//12. Write a JAVA program to input month number and print number of days in that month.
class Month{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the month number:");
        int month=scanner.nextInt();
        if(month == 1)
        {
            System.out.println("JANUARY 31 days");
        }
        else if(month == 2)
        {
            System.out.println("FEBRUARY 28 or 29 days");
        }
        else if(month == 3)
        {
            System.out.println("MARCH 31 days");
        }
        else if(month == 4)
        {
            System.out.println("APRIL 30 days");
        }
        else if(month == 5)
        {
            System.out.println("MAY 31 days");
        }
        else if(month == 6)
        {
            System.out.println("JUNE 30 days");
        }
        else if(month == 7)
        {
            System.out.println("JULY 31 days");
        }
        else if(month == 8)
        {
            System.out.println("AUGUST 31 days");
        }
        else if(month == 9)
        {
            System.out.println("SEPTEMBER 30 days");
        }
        else if(month == 10)
        {
            System.out.println("OCTOBER 31 days");
        }
        else if(month == 11)
        {
            System.out.println("NOVEMBER 30 days");
        }
        else if(month == 12)
        {
            System.out.println("DECEMBER 31 days");
        }
        else
        {
            System.out.println("Invalid input! Please enter month number between (1-12).");
        }

    }
}

//13. Write a JAVA program to count total number of notes in given amount.
class  Notes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int amount = scanner.nextInt();
        int totalNotes;
        if (amount % 5 == 0) {
            totalNotes = amount / 5;
            System.out.println("Total num of notes :" + totalNotes);
        } else {
            System.out.println("Invalid number");
        }
    }
}



//14. Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
class CheckAngle{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three angles of triangle:");
        int angle1=scanner.nextInt();
        int angle2=scanner.nextInt();
        int angle3=scanner.nextInt();
        int total=angle1+angle2+angle3;
        if (total==180){
            System.out.println("Triangle is valid");
        }else {
            System.out.println("Triangle is not valid");
        }

    }
}

//15. Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.
class CheckSides{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first side of triangle:");
        int side1=scanner.nextInt();
        System.out.println("Enter second side of triangle:");
        int side2=scanner.nextInt();
        System.out.println("Enter third side of triangle:");
        int side3=scanner.nextInt();
        if (side1+side2>side3 || side2+side3>side1 || side1+side3>side1){
            System.out.println("Triangle is valid");
        }else {
            System.out.println("Triangle is not valid");
        }

    }
}

//16. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.

class CheckTriangle{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first side of triangle:");
        int side1=scanner.nextInt();
        System.out.println("Enter second side of triangle:");
        int side2=scanner.nextInt();
        System.out.println("Enter third side of triangle:");
        int side3=scanner.nextInt();
        if (side1==side2 && side1==side3 && side2==side3){
            System.out.println("Triangle is equilateral");
        }else if(side1!=side2 && side1!=side3 && side2!=side3){
            System.out.println("Triangle is scalene");
        }else{
            System.out.println("Triangle is isosceles");
        }

    }
}

//17. Write a JAVA program to find all roots of a quadratic equation.
class Quadratic{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double secondRoot=0,firstRoot=0;
        System.out.println("Enter value of a:");
        double a =scanner.nextDouble();
        System.out.println("Enter value of b:");
        double b =scanner.nextDouble();
        System.out.println("Enter value of c:");
        double c =scanner.nextDouble();

        double determinant=(b*b)-(4*a*c);
        double sqr=Math.sqrt(determinant);
        System.out.println(determinant);
        if (determinant>0){
            firstRoot=(-b + sqr)/(2*a);
            secondRoot=(-b + sqr)/(2*a);
            System.out.println("Roots are:"+firstRoot +"and"+secondRoot);
        }else  if (determinant==0){
            System.out.println("Root is"+(-b)/(2*a));
        }
    }
}
//18. Write a JAVA program to calculate profit or loss.
class ProfitLoss{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter selling price");
        int sp=scanner.nextInt();
        System.out.println("Enter cost price");
        int cp=scanner.nextInt();
        int profit=sp-cp;
        int loss=cp-sp;
        if (sp>cp){
            System.out.println("Profit:"+profit);
        }else{
            System.out.println("Loss:"+loss);

        }
    }
}

//19.	Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,
//        Mathematics and Computer. Calculate percentage and grade according to following:
//        Percentage >= 90% : Grade A
//        Percentage >= 80% : Grade B
//        Percentage >= 70% : Grade C
//        Percentage >= 60% : Grade D
//        Percentage >= 40% : Grade E
//        Percentage < 40% : Grade F
class Calculate{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter marks of Physics, Chemistry, Biology, Mathematics & Computer:");
        float physics=scanner.nextFloat();
        float chemistry=scanner.nextFloat();
        float biology=scanner.nextFloat();
        float mathematics=scanner.nextFloat();
        float computer=scanner.nextFloat();
        float total=physics+chemistry+biology+mathematics+computer;
        float per=total*100/500;
        if(per>=90){
            System.out.println("Grade A");
        }else if(per>=80 && per<90){
            System.out.println("Grade B");
        }else if(per>=70 && per<80){
            System.out.println("Grade C");
        }else if(per>=60 && per<70){
            System.out.println("Grade D");
        }else if(per>=40 && per<60){
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}

//20.	Write a JAVA program to input basic salary of an employee and calculate its Gross salary according to following:
//        Basic Salary <= 10000 : HRA = 20%, DA = 80%
//        Basic Salary <= 20000 : HRA = 25%, DA = 90%
//        Basic Salary > 20000 : HRA = 30%, DA = 95%


 
//. Write a JAVA program to input electricity unit charges and calculate total electricity bill
//        according to the given condition:
//        For first 50 units Rs. 0.50/unit
//        For next 100 units Rs. 0.75/unit
//        For next 100 units Rs. 1.20/unit
//        For unit above 250 Rs. 1.50/unit
//        An additional surcharge of 20% is added to the bill
class Elect{
    public static void main(String[] args) {
        int units;
        double Amount,Sur_charge,Total_Amount;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the unit that you consumed:");
        units=scanner.nextInt();

        if (units <=50){
            Amount=units*0.5;
            Sur_charge=0.2*Amount;
        }
        else if (units <150) {
            Amount = 25 +((units-50)*0.75);
            Sur_charge =0.2*Amount;
        }
        else if (units <150) {
            Amount = 25 + 75 +((units - 150) * 1.20);
            Sur_charge = 0.2 * Amount;
        }
        else{
            Amount = 25 + 75 +120 +((units - 150) * 1.50);
            Sur_charge = 0.2 * Amount;
        }
        Total_Amount=Amount+Sur_charge;
        System.out.println("\n Electricity BIll"+Total_Amount);
    }


}