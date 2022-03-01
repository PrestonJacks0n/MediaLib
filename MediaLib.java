/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  private Book book;
  public static String owner = "PLTW"; //now public, so getOwner is not needed
  private static int numEntries;

  public void addBook(Book b)
  {
    if (book == null){
    book = b;
    numEntries ++;
    }
    else{
      System.out.println("Library already has one book.");
    }
    
  }

  public String toString() 
  {
    String info = "";
    if (book != null){
    info = ("The book in the lib is " + book);}
    else  info = "No Info";
    return info;
  }
  public void testBook(Book tester){
    tester.setTitle("trump");
    System.out.println(tester);
  }
  /*public static String getOwner(){
    return owner;
  }no longer needed*/ 
  public static String changeOwner(String O){
    owner = O;
    return owner;
  }
  public static int getEntries(){
    //System.out.println("Test: Owner is " + owner);
    return numEntries;
  }
}