public class MediaLibRunnerStatic
{
  public static void main(String[] args)
  {
    System.out.println(MediaLib.owner + "s Library");
    MediaLib.changeOwner("Gerald");
    System.out.println(MediaLib.owner + "s Library");

    MediaLib myLib = new MediaLib();
    Book myBook = new Book("Lord of The Rings","Tolkien");
    Book hisBook = new Book("Bruh","Hard");
    myLib.addBook(myBook);
    myLib.addBook(hisBook);
    MediaLib myLib2 = new MediaLib();
    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);

    System.out.println(MediaLib.getEntries());
  }
}
