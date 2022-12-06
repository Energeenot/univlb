package lab13.dop;

public class test {
    public static void main(String[] args) {
        Realtor realtor =  new Realtor();
        People seller = new Seller(realtor);
        People buyer = new Buyer(realtor);
        realtor.setSeller((Seller) seller);
        realtor.setBuyer((Buyer) buyer);
        buyer.send("Здравствуйте сколько стоит квартира");
        seller.send("50 квантилионов ");
    }
}
