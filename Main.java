/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main 
{
  public static void main(String[] args) 
 {
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
        try 
       {
        Service s = new Service();
        s.addStudent(new Student(i, w));
        }catch (IOException e) 
        {
        }
        break;
     case 2:
        Service s = new Service();
        var students = s.getStudents();
        for(Student current : students) 
        {
        System.out.println(current.ToString());
        } 
        break;
  }
 }
}