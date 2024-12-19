package dc.bmstu.creational.prototype;

import java.util.Objects;

public class CandyJava implements Cloneable {
    private final String name;
    private final String taste;
    private final String manufacture;

    public CandyJava(String name, String taste, String manufacture) {
        this.name = name;
        this.taste = taste;
        this.manufacture = manufacture;
    }

    public String getName() {
        return name;
    }

    public String getTaste() {
        return taste;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public CandyJava clone()  {
        try {
            return (CandyJava) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyJava candyJava = (CandyJava) o;
        return Objects.equals(name, candyJava.name) && Objects.equals(taste, candyJava.taste) && Objects.equals(manufacture, candyJava.manufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, taste, manufacture);
    }
}
