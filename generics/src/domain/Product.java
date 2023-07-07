package domain;

public class Product implements Persistente{

    Long code;

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    @Override
    public Long getCode() {
        return code;
    }
}
