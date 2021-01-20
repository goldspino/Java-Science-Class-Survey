
import java.util.*;

class Main {
  public static void main(String[] args) {
    

Scanner scan = new Scanner(System.in);

System.out.println("What was your percentage in science class?");

int perc = scan.nextInt();

if(perc>=90){
  System.out.println("A");
}

if(perc<90 && perc>=80){
  System.out.println("B");
}

if(perc<80 && perc>=70){
  System.out.println("C");
}
if(perc<70 && perc>=60){
  System.out.println("D");
}
if(perc<60){
  System.out.println("F");
}

  }
}