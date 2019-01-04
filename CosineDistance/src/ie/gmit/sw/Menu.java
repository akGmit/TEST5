package ie.gmit.sw;

import java.util.Scanner;

public final class Menu {
  private Scanner in;
  private boolean running;
  CosineDistance cosineDistance;
  //TEST
  String defaultDir = "/home/ak/Documents/college/OO/";
  String defaultQuery = "/home/ak/Documents/college/WarAndPeace";

  public Menu() {
    in = new Scanner(System.in);
    running = true;
    cosineDistance = new CosineDistance();
  }

  public void execute() {
    System.out.println(welcomeMessage());
    do {
      //cosineDistance.setSubjectFileDir(subjectDir());
      //TEST
      cosineDistance.setSubjectFileDir(defaultDir);
      cosineDistance.setQueryFile(defaultQuery);
      cosineDistance.processFiles();
    } while (false);
  }

  private String welcomeMessage() {
    return "*****Document Comparison Service*****";
  }
  
  private String subjectDir() {
    System.out.print("Enter Subject Directory > ");
    return in.next();
  }

}
