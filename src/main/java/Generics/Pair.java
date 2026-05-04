package Generics;

public class Pair<S, T> {
    S first;
    T second;

    public Pair(S first, T second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {
    }

    public S getFirst() {
        return first;
    }

    public void setFirst(S first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
