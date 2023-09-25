import java.util.Scanner;

public class resultgen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subject you want");
        int num = sc.nextInt();
        double sum_of_sub=0;
        for (int i = 1; i <=num; i++) {
            System.out.println("Enter the marks in subject"+i);
            sum_of_sub+= sc.nextInt();

        }
        int total_mark = num * 100;
        System.out.println(sum_of_sub);
        double percentage = (sum_of_sub /total_mark)*100;
        if (percentage >= 90 && percentage <=100){
            System.out.println("you got A+");
        } else if (percentage >= 80 && percentage <=90) {
            System.out.println("you got A");
        }
        else if (percentage >= 70 && percentage <=80) {
            System.out.println("you got B+");
        }
        else if (percentage >= 60 && percentage <=70) {
            System.out.println("you got B");
        }
        else if (percentage >= 50 && percentage <=60) {
            System.out.println("you got C+");
        }
        else if (percentage >= 40 && percentage <=50) {
            System.out.println("you got C");
        }
        else{
            System.out.println("You failed");
        }


    }

}
