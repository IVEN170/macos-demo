package demo;

public final class App {
    public static void main(String[] args) {
        String os = System.getProperty("os.name");
        String arch = System.getProperty("os.arch");
        String java = System.getProperty("java.version");
        System.out.println("hello from " + os + " (" + arch + ") on Java " + java);
    }
}
