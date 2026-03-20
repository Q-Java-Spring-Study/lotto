package step1.constans;

public interface FormattableMessage {
    String getMessage();

    default String getFormatMessage(Object... args) {
        return String.format(this.getMessage(), args);
    }
}
