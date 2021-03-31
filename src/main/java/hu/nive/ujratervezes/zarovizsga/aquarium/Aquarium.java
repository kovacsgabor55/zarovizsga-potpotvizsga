package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {
    List<Fish> fishList = new ArrayList<>();

    public void addFish(Fish fish) {
        fishList.add(fish);
    }

    public void feed() {
        for (Fish item : fishList) {
            item.feed();
        }
    }

    public void removeFish() {
        Iterator<Fish> iterator = fishList.iterator();
        while ((iterator.hasNext())) {
            Fish item = iterator.next();
            if (item.getWeight() >= 11) {
                iterator.remove();
            }
        }
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Fish item : fishList) {
            result.add(item.status());
        }
        return result;
    }
}
