import java.util.Scanner;
import java.io.IOException;

class Main 
{
  public static void main(String[] args) 
 {
    Service s = new Service();
    Scanner wyb = new Scanner(System.in);
    Scanner imie = new Scanner(System.in);
    Scanner wiek = new Scanner(System.in);
    System.out.println("Wybierz opcje\n 0.Zamknij program.\n 1.Dodaj nowego studenta.\n 2.Wypisz studentów");
    int ww = wyb.nextInt();
      switch(ww)
    {
      case 0:
        System.exit(0);
        break;
      case 1:   
        System.out.println("Podaj nowego studenta: ");
        String i =imie.nextLine();
        System.out.println("Podaj wiek studenta: ");
        int w = wiek.nextInt();
          try {
     
      s.addStudent(new Student(i, w));
      

      var students = s.getStudents();
      for(Student current : students) {
        
      }
    } catch (IOException e) {

    }
        break;
     case 2:
     try {
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
  }
 }
}