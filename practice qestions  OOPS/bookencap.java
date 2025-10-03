public class bookencap {
  private  String title;
  private  boolean isAvailable;
 public bookencap(String title,boolean isAvailable){
    this.title= title;
    this.isAvailable=isAvailable;
 }
    public String getTitle(){
        return title;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void checkOut(){
        if(isAvailable){
            isAvailable=false;
            System.out.println(title+"book has been checked out.");
        }
        else{
            System.out.println(title+" is already checked out.");
        }
        if(!isAvailable){
            isAvailable=true;
            System.out.println(title+"has been returned.");

        }
        else{
            System.out.println(title+" is available.");
        }
    }
    public static void main(String[] args) {
        bookencap book = new bookencap("Java Programming", true);
        System.out.println("Title: "+book.getTitle());
        System.out.println("Available:"+book.isAvailable());
        book.checkOut();
    }
}
