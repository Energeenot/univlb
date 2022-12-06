package lab9;

public class MetalSmelter3 {
    private static MetalSmelter3 instance;
    private boolean empty;
    private boolean smelt;

    private MetalSmelter3(){
        empty = true;
        smelt = false;
        System.out.println("Singleton created");
    }

    public static synchronized MetalSmelter3 getInstance(){
        if (instance == null){
            instance = new MetalSmelter3();
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
