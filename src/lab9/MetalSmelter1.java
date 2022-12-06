package lab9;

public class MetalSmelter1 {
    private boolean empty;
    private boolean smelt;
    private static MetalSmelter1 instance;

    private MetalSmelter1(){
        empty = true;
        smelt = false;
        System.out.println("Singleton created!");
    }

    public static MetalSmelter1 getInstance(){
        if (instance == null){
            instance = new MetalSmelter1();
        }
        return instance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isSmelt() {
        return smelt;
    }
    public void fill(){
        if(isEmpty()){
            empty = false;
            smelt = false;
            System.out.println("Заполнение плавильщика металла");
        }
    }

    public void drain(){
        if (!isEmpty() && isSmelt()){
            System.out.println("Сливаем расплавленный металл");
            empty = true;
        }
    }

    public void smelting(){
        if (!isEmpty() && !isSmelt()){
            System.out.println("Плавим металл");
            smelt = true;
        }
    }
}
