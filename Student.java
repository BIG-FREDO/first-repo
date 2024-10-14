import java.util.Scanner;

public class Student {

private String firstName;
private String lastName;
private int level;
private String courses = "";
private static int feePerCourse = 600;
private int balance = 0;
private int studentId = 0;
private static int id = 1000;


public Student(){

Scanner in = new Scanner(System.in);
System.out.print("Enter Student FirstName: ");
this.firstName = in.nextLine();

System.out.print("Enter Student LastName: ");
this.lastName = in.nextLine();

System.out.println("Select your level \n1 - Year One \n2 - Year Two \n3 - Year Three \n4 - Year Four");
System.out.print("Enter level: ");
this.level = in.nextInt();

}

public void setId(){

id++;
this.studentId =+ id;
System.out.println(".....Student ID: " + studentId);
System.out.println();
}

public void enroll(){
System.out.println("Enter course to enroll (Q to quit): ");
do{

System.out.print("Enter course: ");
Scanner in = new Scanner(System.in);
String course = in.nextLine();

if(!course.equalsIgnoreCase("Q")) {

this.courses = courses + course + "/";
this.balance += feePerCourse;

}

else{break;}

}

while(1 != 0);

}

public void payFees(){

System.out.println("Total intuition fee amounts to: $" + balance);
Scanner in = new Scanner(System.in);
System.out.print("Pay intuition fee: $");
int amountToPay = in.nextInt();
System.out.println("We have recieved a payment of: $" + amountToPay);

int newBalance = balance - amountToPay;
System.out.println("Your new balance: $" + newBalance);

}

public void showInfo(){

System.out.println(".....Name of Student: " + firstName + " " + lastName + "." + "\n.....Level of enrollment: " + level + "." + "\n.....Enrolled in: " + courses);

}
public static void main(String[] args){

Scanner in = new Scanner(System.in);
System.out.print("Set number of student to be enrolled: ");
int numOfStudent = in.nextInt();
Student[] students = new Student[numOfStudent];

for(int i = 0; i < numOfStudent; i++){
students[i] = new Student();
System.out.println();

students[i].enroll();
System.out.println();

students[i].payFees();
System.out.println();

students[i].showInfo();
students[i].setId();

}

}
}
