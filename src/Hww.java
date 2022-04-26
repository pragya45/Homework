
    import javax.swing.*;
    import java.util.Scanner;

    //1. Write a program to take student details as input and display the result.
    public class Hww {
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter name:");
            String name=scanner.nextLine();
            System.out.println("Enter address:");
            String address=scanner.nextLine();
            System.out.println("Enter age:");
            int age=scanner.nextInt();
            System.out.println("Enter batch:");
            int batch=scanner.nextInt();

            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
            System.out.println("Address:"+address);
            System.out.println("Batch:"+batch);

        }
    }

    //2. Write a program to calculate sum of four numbers taking user input.
    class Sum{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter first number:");
            int num1=scanner.nextInt();
            System.out.println("Enter second number:");
            int num2=scanner.nextInt();
            System.out.println("Enter third number:");
            int num3=scanner.nextInt();
            System.out.println("Enter fourth number:");
            int num4=scanner.nextInt();

            int sum=num1+num2+num3+num4;
            System.out.println("Sum of 4 numbers is:"+sum);
        }
    }
//. Write a program to take input of the total marks of four subjects of a student and calculate
//        the total percentage secured. Then display the percentage and final result of the student;
//        a. If equal to or more than 70 -> First Class
//        b. If more than 59 -> Upper second Class
//        c. If more than 49 -> Second class
//d. If more than 39 -> Third class and if below than 40 the result is fail.

    class Student{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter marks of first subject:");
            float sub1=scanner.nextFloat();
            System.out.println("Enter marks of second subject:");
            float sub2=scanner.nextFloat();
            System.out.println("Enter marks of third subject:");
            float sub3=scanner.nextFloat();
            System.out.println("Enter marks of fourth subject:");
            float sub4=scanner.nextFloat();

            float total=sub1+sub2+sub3+sub4;
            System.out.println("Total marks:"+total);

            float per=(total*100)/400;
            System.out.println("Total percentage:"+per);

            String result;
            result=(per>=70)?"First Class" : (per>59 && per<70)?"Second Class" :
                    (per>49 && per<59)?"Third Class" :(per>39 && per<49)?"Fourth Class" : "Fail";
            System.out.println(result);
        }
    }

    //4. Write a program to take two integer inputs from user and print sum and product of them.
//5. Take two integer inputs from user. First calculate the sum of two then product of two.
//        Finally, print the sum and product of both obtained results.
    class SumProduct{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter first number:");
            int num1=scanner.nextInt();
            System.out.println("Enter second number:");
            int num2=scanner.nextInt();

            int sum=num1+num2;
            int product=num1*num2;
            System.out.println("Sum:"+sum);
            System.out.println("Product:"+product);

            int finalSum=sum+product;
            int finalProduct=sum*product;
            System.out.println("Sum of obtained result:"+finalSum);
            System.out.println("Product of obtained result:"+finalProduct);
        }
    }

    //6. Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
    class Area{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter length of rectangle");
            double length= scanner.nextDouble();
            System.out.println("Enter breadth of rectangle");
            double breadth= scanner.nextDouble();
            double area=length*breadth;
            System.out.println("Area of rectangle is:" + (int) area);
        }
    }

    //7. Take name, roll number and field of interest from user and print in the format below :Hey,
//        my name is xyz and my roll number is xyz. My field of interest are xyz.
    class Details{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter name:");
            String name=scanner.nextLine();
            System.out.println("Enter roll number:");
            String roll=scanner.nextLine();
            System.out.println("Enter field of interest:");
            String field=scanner.nextLine();
            System.out.println("Hey, my name is"+name+ "  and my roll number is"+roll+
                    "   my field of interest is:"+field);
        }
    }

//8. Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//        of triangle and Volume of Cube and Cuboid. Take the attributes as user input.

    class Square{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter length of side of a square:");
            float length=scanner.nextFloat();
            float area=length*length;
            float perimeter=4*length;
            System.out.println("Area of square is" +area);
            System.out.println("Perimeter of a square is" +perimeter);
        }
    }
    class Triangle{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
//        to calculate simple interest
            System.out.println("Enter principle,rate and time:");
            float principle=scanner.nextFloat();
            float time=scanner.nextFloat();
            float rate=scanner.nextFloat();
            float si=(principle*time*rate)/100;
            System.out.println("Simple Interest is" +si);
//        to calculate area of triangle
            System.out.println("Enter length and breadth of triangle:");
            float length=scanner.nextFloat();
            float breadth=scanner.nextFloat();
            float area=length*breadth;
            System.out.println("Area of triangle is" +area);
//        to find volume of cube
            System.out.println("Enter the edge length of cube:");
            float len=scanner.nextFloat();
            float volumeCube=len*len;
            System.out.println("Volume of cube is" +volumeCube);
//        to find volume of cuboid
            System.out.println("Enter the length, breadth and width of cuboid:");
            float length1=scanner.nextFloat();
            float breadth1=scanner.nextFloat();
            float width1=scanner.nextFloat();
            float volumeCuboid=length1*breadth1*width1;
            System.out.println("Volume of cuboid is" +volumeCuboid);

        }
    }

//9. Write a program to find square of a number.
//        E.g.- INPUT : 2 OUTPUT : 4
//        INPUT : 5 OUTPUT : 25

    class Number{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter any number:");
            Double number=scanner.nextDouble();
            Double sqr=number*number;
            System.out.println("Square of a given number" +sqr);
        }
    }

    //10. Take two different string input and print them in same line. E.g.-
//        INPUT : Codes
//        Dope
//        OUTPUT : CodesDope
    class StringFirst{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter two string:");
            String char1=scanner.nextLine();
            String char2=scanner.nextLine();
            System.out.println("Output is" +char1+char2);
        }
    }

    //11. Take 3 inputs from user and check :
//        all are equal
//        any of two are equal
//        ( use && || with ternary operator )
    class Check{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter three numbers:");
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            int c=scanner.nextInt();
            String checkInput;
            checkInput=(a==b && a==c && b==c) ? "All are equal" : ((a==b) || (a==c) || (b==c)) ? "Any of two are equal":"None of them are equal";
            System.out.println(checkInput);
        }
    }

    //12.	Write a program to enter the values of two variables 'a' and 'b' from keyboard and
//        then check if both the conditions 'a < 50' and 'a < b' are true.
    class Condition{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the value of a:");
            int a=scanner.nextInt();
            System.out.println("Enter the value of b:");
            int b=scanner.nextInt();
            String check1;
            check1=(a<50 && a<b) ? "True" : "False";
            System.out.println(check1);
        }
    }

    //13.	If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.
    class Result{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the marks of Robert in three subjects:");
            float sub1=scanner.nextFloat();
            float sub2=scanner.nextFloat();
            float sub3=scanner.nextFloat();
            float total=sub1+sub2+sub3;
            float percentage=(total*100)/300;
            System.out.println("His total marks is \t"+ total);
            System.out.println("His percentage is\t" + percentage+"%");
        }
    }

//import javax.swing.*;

    //1.	Write a program to take student details as input and display the result.
    class Detail {
        public static void main(String[] args) {
            String name, address;
            int age, batch;
            name = (JOptionPane.showInputDialog(null,"Name: " ));
            address = (JOptionPane.showInputDialog(null,"Address: " ));
            age = Integer.parseInt(JOptionPane.showInputDialog(null,"Age: " ));
            batch = Integer.parseInt(JOptionPane.showInputDialog(null,"Batch: " ));
            JOptionPane.showMessageDialog(null,"Name:"+name+"\n Address:"+address
                    +"\nAge:"+age+"\nBatch:"+batch);
        }
    }

    //2.	Write a program to calculate sum of four numbers taking user input.
    class SumNum{
        public static void main(String[] args) {
            Double num1, num2,num3,sum;
            num1=Double.parseDouble(JOptionPane.showInputDialog("Enter first number:"));
            num2=Double.parseDouble(JOptionPane.showInputDialog("Enter second number:"));
            num3=Double.parseDouble(JOptionPane.showInputDialog("Enter third number:"));
            sum=num1+num2+num3;
            JOptionPane.showMessageDialog(null,"Sum of given three numbers:"+sum);

        }
    }

    //3.	Write a program to take input of the total marks of four subjects of a student and calculate the total percentage secured. Then display the percentage and final result of the student;
//        If equal to or more than 70 -> First Class
//        If more than 59 -> Upper second Class
//        If more than 49 -> Second class
//If more than 39 -> Third class and if below than 40 the result is fail
    class StudentResult{
        public static void main(String[] args) {
            float sub1, sub2,sub3,sub4,total,per;
            sub1=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for sub1:"));
            sub2=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for sub2:"));
            sub3=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for sub3:"));
            sub4=Integer.parseInt(JOptionPane.showInputDialog("Enter marks for sub4:"));
            total=sub1+sub2+sub3+sub4;
            per=total*100/400;
            String result1;
            result1=(per>=70)?"First Class" : (per>59 && per<70)?"Second Class" :
                    (per>49 && per<59)?"Third Class" :(per>39 && per<49)?"Fourth Class" : "Fail";
            JOptionPane.showMessageDialog(null,"Total:"+total+"\nPercentage"+per+"\n"+result1);
        }
    }

    //4.	Write a program to take two integer inputs from user and print sum and product of them.
//5. Take two integer inputs from user. First calculate the sum of two then product of two.
//        Finally, print the sum and product of both obtained results.
    class ProductSum{
        public static void main(String[] args) {
            int num1,num2,sum,product,obtainedSum,obtainedPro;
            num1=Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
            num2=Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));
            sum=num1+num2;
            product=num1*num2;
            obtainedSum=sum+product;
            obtainedPro=sum*product;
            JOptionPane.showMessageDialog(null,"Sum:"+sum+"\nProduct:"+product+"\nSum of obtained result:"+obtainedSum+
                    "\nProduct of obtained result:"+obtainedPro);
        }
    }

    //5.	Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
    class AreaRectangle{
        public static void main(String[] args) {
            double length, breadth, area;
            length=Double.parseDouble(JOptionPane.showInputDialog("Enter length of rectangle:"));
            breadth=Double.parseDouble(JOptionPane.showInputDialog("Enter length of breadth:"));
            area=length*breadth;
            JOptionPane.showMessageDialog(null,"Area of rectangle:"+ (int) area);

        }
    }

    //6.	Take name, roll number and field of interest from user and print in the format below :
//        Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.
    class Stud{
        public static void main(String[] args) {
            String name,field;
            int roll;
            name=(JOptionPane.showInputDialog("Enter name:"));
            field=(JOptionPane.showInputDialog("Enter interest field:"));
            roll=Integer.parseInt(JOptionPane.showInputDialog("Enter roll num.:"));
            JOptionPane.showMessageDialog(null,"Hey, my name is "+name+" and my roll number is "+roll+
                    ". My field of interest is "+field);
        }
    }

    //7.	Take side of a square from user and print area and perimeter of it.
//        Also, calculate SI, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
    class SquareArea{
        public static void main(String[] args) {
//        for square
            float length,area, perimeter;
            length=Float.parseFloat(JOptionPane.showInputDialog("Enter length side of a square:"));
            area=length*length;
            perimeter=4*length;
            JOptionPane.showMessageDialog(null,"Area of square: "+area+"\nPerimeter of square :"+perimeter);
//        for simple interest
            float p,t,r,si;
            p=Float.parseFloat(JOptionPane.showInputDialog("Enter principle:"));
            t=Float.parseFloat(JOptionPane.showInputDialog("Enter rate:"));
            r=Float.parseFloat(JOptionPane.showInputDialog("Enter time:"));
            si=p*t*r/100;
            JOptionPane.showMessageDialog(null,"Simple Interest :"+si);

//        for triangle;
            float l,b,areaT;
            l=Float.parseFloat(JOptionPane.showInputDialog("Enter length of triangle:"));
            b=Float.parseFloat(JOptionPane.showInputDialog("Enter breadth triangle:"));
            areaT=l*b;
            JOptionPane.showMessageDialog(null,"Area of triangle :"+areaT);

//       for cube and cuboid
            float l2,l1,b1,w,volumeOfCube,volumeOfCuboid;
            l2=Float.parseFloat(JOptionPane.showInputDialog("Enter the edge length of cube:"));
            volumeOfCube=l2*l2;
            JOptionPane.showMessageDialog(null,"Volume of cube :"+volumeOfCube);

            l1=Float.parseFloat(JOptionPane.showInputDialog("Enter length of cuboid:"));
            b1=Float.parseFloat(JOptionPane.showInputDialog("Enter breadth of cuboid:"));
            w=Float.parseFloat(JOptionPane.showInputDialog("Enter width of cuboid:"));
            volumeOfCuboid=l1*b1*w;
            JOptionPane.showMessageDialog(null,"Volume of cuboid :"+volumeOfCuboid);

        }
    }

//8.	Write a program to find square of a number.
//        E.g.- INPUT : 2        OUTPUT : 4
//        INPUT : 5        OUTPUT : 25

    class SquareOfNum{
        public static void main(String[] args) {
            int num, square;
            num=Integer.parseInt(JOptionPane.showInputDialog("Enter  number:"));
            square=num*num;
            JOptionPane.showMessageDialog(null,"Square of given number :"+square);
        }
    }

//9.	Take two different string input and print them in same line. E.g.-
//        INPUT : Codes
//        Dope
//        OUTPUT : CodesDope

    class Variable{
        public static void main(String[] args) {
            String var1,var2;
            var1=(JOptionPane.showInputDialog("Enter first string: "));
            var2=(JOptionPane.showInputDialog("Enter second string: "));
            JOptionPane.showMessageDialog(null,"Output: "+var1+var2);
        }
    }

//10.	Take 3 inputs from user and check :
//        all are equal any of two are equal
//        ( use && || with ternary operator )

    class InputCheck{
        public static void main(String[] args) {
            int a,b,c;
            a=Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
            b=Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));
            c=Integer.parseInt(JOptionPane.showInputDialog("Enter third number: "));
            String checkInput;
            checkInput=(a==b && a==c && b==c) ? "All are equal" : ((a==b) || (a==c) || (b==c)) ? "Any of two are equal":"None of them are equal";
            JOptionPane.showMessageDialog(null,"Output:"+checkInput);

        }
    }


//11.	Write a program to enter the values of two variables 'a' and 'b' from keyboard and
//        then check if both the conditions 'a < 50' and 'a < b' are true.

    class CheckValue{
        public static void main(String[] args) {
            int a,b;
            a=Integer.parseInt(JOptionPane.showInputDialog("Enter value of a:"));
            b=Integer.parseInt(JOptionPane.showInputDialog("Enter value of b:"));
            String checkValue;
            checkValue=(a<50 && a<b) ? "True" : "False";
            JOptionPane.showMessageDialog(null,"Output: "+checkValue);
        }
    }

    //12.	If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//        write a program to calculate his total marks and percentage marks.
    class CalculateResult{
        public static void main(String[] args) {
            float sub1,sub2,sub3,total,per;
            sub1=Float.parseFloat(JOptionPane.showInputDialog("Enter marks in oop: "));
            sub2=Float.parseFloat(JOptionPane.showInputDialog("Enter marks in python: "));
            sub3=Float.parseFloat(JOptionPane.showInputDialog("Enter marks in database: "));
            total=sub1+sub2+sub3;
            per=(total*100)/300;
            JOptionPane.showMessageDialog(null,"Total marks of Robert: "+total+"\nTotal percentage:"+per+"%");
        }
    }

