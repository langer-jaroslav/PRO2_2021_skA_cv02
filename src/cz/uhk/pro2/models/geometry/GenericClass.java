package cz.uhk.pro2.models.geometry;

import java.time.LocalDateTime;
import java.util.List;

public class GenericClass<E> {
    private E myObject;
    private LocalDateTime lastUpdate;
    public GenericClass(E item){
        this.myObject = item;
        update();
    }
    public E getMyObject() {
        return myObject;
    }

    public void setMyObject(E myObject) {
        this.myObject = myObject;
        update();
    }
    private void update(){
        lastUpdate = LocalDateTime.now();
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }
}
