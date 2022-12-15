package RuntimeClass;

public class MemoryClass {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total Memory : "+ runtime.totalMemory());
        System.out.println("Free Memory : "+ runtime.freeMemory());
        System.out.println("Max Memory : "+ runtime.maxMemory());
        System.out.println("Available Processor : "+ runtime.availableProcessors());

        for (int i = 0; i < 10000; i++) {
            new MemoryClass();
        }
        System.out.println("After creating 10000 instance, Free Memory :"+
                runtime.freeMemory());
        System.gc();
        System.out.println("After gc(), free memory : "+ runtime.freeMemory());

    }
}
