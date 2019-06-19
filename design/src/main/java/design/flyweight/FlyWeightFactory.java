package design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
    private Map<String, FlyWeight> map = new HashMap<>();

    public FlyWeight getFlyWeight(String key) {
        FlyWeight flyWeight = map.get(key);
        if (flyWeight == null) {
            flyWeight = new ConcreteFlyWeight();
            ((ConcreteFlyWeight) flyWeight).setState(key);
            map.put(key, flyWeight);
        }
        return flyWeight;
    }
}
