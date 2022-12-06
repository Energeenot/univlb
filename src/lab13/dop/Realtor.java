package lab13.dop;

public class Realtor {
    public Seller seller;
    public Buyer buyer;

    public void send(String message, People people){
        if (buyer == people){
            seller.notify(message);
        } else if (seller == people) {
            buyer.notify(message);
        }
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}
