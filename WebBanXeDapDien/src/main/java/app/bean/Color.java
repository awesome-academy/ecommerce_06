package app.bean;

public enum Color {
    RED("Đỏ"), BLUE("Xanh"), YELLOW("Vàng"), BLACK("Đen");
    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static Color getColor(String value) {
        if (value.equalsIgnoreCase("Đỏ"))
            return Color.RED;
        else if (value.equalsIgnoreCase("Xanh"))
            return Color.BLUE;
        else if (value.equalsIgnoreCase("Vàng"))
            return Color.YELLOW;
        else return BLACK;

    }

    @Override
    public String toString() {
        if (this == RED) return "Đỏ";
        else if (this == BLUE) return "Xanh";
        else if (this == YELLOW) return "Vàng";
        return "";
    }
}
