import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicTests {

    @DisplayName("Success test")
    @Description("This test should return positive result")
    @Tag("positive")
    @Test
    void positiveTest() {
        step("Assert that true is true", () -> {
            assertEquals(true, true);
        });
    }

    @DisplayName("Failed test")
    @Description("This test should return negative result")
    @Tag("failed")
    @Test
    void negativeTest() {
        step("Assert that true is false", () -> {
            assertEquals(true, false);
        });
    }
}
