package java.learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogOutputFormatTest {

    @Test
    void getName_returnsName() {
        assertEquals("json", LogOutputFormat.JSON.getName());
        assertEquals(LogOutputFormat.JSON, LogOutputFormat.valueOf("JSON"));
        assertEquals("JSON", LogOutputFormat.JSON.toString());
        assertThrows(IllegalArgumentException.class, () -> LogOutputFormat.valueOf("UNKNOWN"));
    }
}