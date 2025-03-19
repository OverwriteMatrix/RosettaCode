// T = type (can think of it as "thing" though)

public class Box<T> {
    T item;
    
    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
}
