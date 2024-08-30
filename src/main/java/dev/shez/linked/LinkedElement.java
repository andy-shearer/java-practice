package dev.shez.linked;

public class LinkedElement {
    private String data;
    private LinkedElement next = null;
    private LinkedElement prev = null;

    public LinkedElement(String data) {
        this.data = data;
    }

    public LinkedElement(String data, LinkedElement prev) {
        this.data = data;
        this.prev = prev;
    }

    public LinkedElement(String data, LinkedElement prev, LinkedElement next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public String getData() {
        return data;
    }

    public LinkedElement getNext() {
        return next;
    }

    public LinkedElement getPrev() {
        return prev;
    }

    public void setNext(LinkedElement next) {
        this.next = next;
    }

    public void setPrev(LinkedElement prev) {
        this.prev = prev;
    }

    public boolean hasNext() {
        return this.next != null;
    }

}
