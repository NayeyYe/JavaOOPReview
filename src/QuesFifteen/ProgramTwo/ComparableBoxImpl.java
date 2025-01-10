package QuesFifteen.ProgramTwo;

public class ComparableBoxImpl<T extends Comparable<T>> implements ComparableBox<T> {
    private T content;

    public ComparableBoxImpl(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public int compareTo(T other) {
        return this.content.compareTo(other);
    }

    @Override
    public String toString() {
        return "ComparableBoxImpl{" +
                "content=" + content +
                '}';
    }
}
