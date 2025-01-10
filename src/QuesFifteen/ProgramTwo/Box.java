package QuesFifteen.ProgramTwo;

public class Box<T> {
    private T content;

    // Getter方法
    public T getContent() {
        return content;
    }

    // Setter方法
    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Box{" +
                "content=" + content +
                '}';
    }
}
