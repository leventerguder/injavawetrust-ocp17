package chapter13.working_with_parallel_streams.performing_a_parallel_decomposition;

public class CPUCoreCount {

    public static void main(String[] args) {

        // Returns the number of processors available to the Java virtual machine.
        int cores = Runtime.getRuntime().availableProcessors();

        System.out.println(cores);
    }
}
