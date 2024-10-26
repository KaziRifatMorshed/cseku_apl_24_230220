public class tbtKU {
    private static tbtKU instance = null;

    private tbtKU() {
        System.out.println("tbtKU instance created");
        // other codes...
    }

    public tbtKU getInstance() {
        if (instance == null) {
            synchronized (tbtKU.class) {
                if (instance == null) {
                    System.out.println("no instance present. creating first instance");
                    instance = new tbtKU();
                }
            }
        }
        return instance;
    }
}
