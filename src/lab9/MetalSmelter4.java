package lab9;

public class MetalSmelter4 {
    private static MetalSmelter4 instance;
    private boolean empty;
    private boolean smelt;

    private MetalSmelter4(){
        empty = true;
        smelt = false;
        System.out.println("Singleton created!");
    }

    public static MetalSmelter4 getInstance(){
        MetalSmelter4 localInstance = instance;
        if (localInstance == null){
            synchronized (MetalSmelter4.class){
                localInstance = instance;
                if (localInstance == null){
                    instance = localInstance = new MetalSmelter4();
                }
            }
        }
        return localInstance;
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
