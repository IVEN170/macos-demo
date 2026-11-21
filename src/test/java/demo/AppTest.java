package demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void archIsKnown() {
        String arch = System.getProperty("os.arch");
        System.out.println("running tests on " + System.getProperty("os.name") + " / " + arch);
        assertEquals(true, arch != null && !arch.isBlank());
    }
}
