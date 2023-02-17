package figure;

public class pentagon extends figure{

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    pentagon(String name, String type, double perimeter, double square) {
        super(name, perimeter, square);
        this.type=type;
    }
}
