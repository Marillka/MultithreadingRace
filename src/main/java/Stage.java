// абстрактный класс препятствия
public abstract class Stage {
    protected int length;// длинна препетствия

    protected String description;// описание


    public String getDescription() {
        return description;
    }

    public abstract void go(Car c);// метод старта машинки

}