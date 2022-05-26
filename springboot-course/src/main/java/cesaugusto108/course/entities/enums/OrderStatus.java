package cesaugusto108.course.entities.enums;

public enum OrderStatus {

    PAYMENT_PENDING(1),
    PAYMENT_CONFIRMED(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus getOrderStatus(int code) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.getCode() == code) {
                return orderStatus;
            }
        }

        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
