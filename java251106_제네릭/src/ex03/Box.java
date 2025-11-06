package ex03;

public class Box<T extends Person> {
	T item;
	void setItem(T item) {
		this.item = item;
	}
	T getItem() {
		return item;
	}
