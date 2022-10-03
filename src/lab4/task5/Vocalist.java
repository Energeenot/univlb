package lab4.task5;

public class Vocalist extends Musician{
     private String name;
    public Vocalist(String name) {
        this.name = name;
    }

    public void singCouplet(int couplet_number){
        System.out.println(name + " спел куплет №" + couplet_number);
    }

    public  void singChorus(){
        System.out.println(name + " спел припев");
    }
}
