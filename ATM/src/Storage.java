import java.io.Serializable;

import java.util.HashMap;

public class Storage implements Serializable {
    public static HashMap<Integer, Integer> storage;

    public Storage(){
        storage = new HashMap<>();
    }

    public static HashMap<Integer, Integer> getStorage(){
        return storage;
    }

    public void getValue(int key){
        storage.get(key);
    }

    public void addValue(int key, int value){
        storage.put(key, value);
    }

    public void updateValue(int key, int value){
        storage.put(key, value);
    }
}

// map.replace("b", 200);
// map.put(key, SOMETHING);