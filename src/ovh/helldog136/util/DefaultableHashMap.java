package ovh.helldog136.util;

import java.util.HashMap;

/**
 * Created by Duncan -Helldog136- De Weireld on 19/12/14.
 * Allows the user to set a non-null default value to return if the HashMap doesn't contains the given Key.
 */
public class DefaultableHashMap<K, V> extends HashMap<K, V> {
    private V def;

    /**
     * Default constructor of the DefaultableHashMap
     * Basically the default value is null so it will act as a normal HashMap
     */
    public DefaultableHashMap(){
        this(null);
    }

    /**
     * Constructor of the HashMap
     * @param _def the default returned value if the key doesn't exists
     */
    public DefaultableHashMap(V _def){
        super();
        def = _def;
    }

    public void setDefault(V _def){
        def = _def;
    }

    @Override
    public V get(Object key){
        V res = super.get(key);
        if (res == null){
            res = def;
        }
        return res;
    }

    public static void main(String[] args){
        //love
        DefaultableHashMap<String,Integer> t1 = new DefaultableHashMap<String, Integer>(0);
        t1.put("a",1);
        t1.put("b", 2);
        System.out.println(t1.get("a"));
        System.out.println(t1.get("e"));
        System.out.println(t1.get("b"));
        t1.setDefault(42);
        System.out.println(t1.get("a"));
        System.out.println(t1.get("e"));
        System.out.println(t1.get("b"));
    }
}
