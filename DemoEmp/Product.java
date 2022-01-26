class Product{
    int pCode = 121;
    String pName = "Box";
    int pPrice = 20;
    int pQty = 5;

    void getProduct(){
        System.out.println(pCode);
        System.out.println(pName);
        System.out.println(pPrice);
        System.out.println(pQty);

    }
    public static void main(String[] args){
        Product v = new Product();
        v.getProduct();
    }
}