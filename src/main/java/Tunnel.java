import java.util.concurrent.Semaphore;


public class Tunnel extends Stage {

    // семафор
    Semaphore semaphore = new Semaphore(2);

    public Tunnel() {
        this.length = 80;// длинна
        this.description = "Тоннель " + length + " метров";// описание
    }

    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                // блочим семафор
                semaphore.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                // отпускаем семафор
                semaphore.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}