package generics;

public class ClassWithGenerics<T> {
    private T data;

    public ClassWithGenerics(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
