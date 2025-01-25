package java.learning;

public enum LogOutputFormat {
    RAW("raw"),
    JSON("json"),
    YAML("yaml");

    private final String name;

    LogOutputFormat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}