import java.util.Scanner;
public class StudentMarksGrades {
    public static void main(String[] args) {
        String grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Student Name:");
        String name=sc.nextLine();
        System.out.println("Enter Marks of Subject 1:");
        int mark1 =sc.nextInt();
        System.out.println("Enter marks of Subject 2:");
        int mark2 =sc.nextInt();
        System.out.println("Enter Marks of Subject 3:");
        int mark3 =sc.nextInt();
        float total = mark1+mark2+mark3;float
        A=total/3;
        if(A>=90)
        grade="A";
        else if(A>=70&&A<90)
        grade="B";
        else if(A>=55&&A<70)
        grade="C";
        else if(A>=45&&A<55)
        grade="D";
        else if(A>=35&&A<45)
        grade="E";
        else
        grade="F";
        System.out.println("Total Marks Obtained By " +name+ " Is "+ total + " Out of 300");
        System.out.println("Average Marks Scored By " + name + " Is " + A + "");
        System.out.println("Grade=" + grade);
    }
}
