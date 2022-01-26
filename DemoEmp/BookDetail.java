// bCode,bName,bAuthor,bPrice,bQty
class Book{
    String bCode,bName,bAuthor,bPrice,bQty;
    void setBookData(String a,String b,String c,String d,String e){
        bCode = a;
        bName = b;
        bAuthor = c;
        bPrice = d;
        bQty  = e;
    }
    void getBookData(){
        System.out.println("***Book data***");
        System.out.println("Book code: "+bCode);
        System.out.println("Book name: "+bName);
        System.out.println("Book Author: "+bAuthor);
        System.out.println("Book price: "+bPrice);
        System.out.println("Book quantity: "+bQty);

    }
}


public class BookDetail {
    public static void main(String[] args){
        Book bd = new Book();
        bd.setBookData("121","mann","Srikanth","121","5");
        bd.getBookData();
    }


}