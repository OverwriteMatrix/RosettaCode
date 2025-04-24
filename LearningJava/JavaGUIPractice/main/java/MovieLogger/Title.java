package MovieLogger;

import java.util.ArrayList;
import java.util.List;

public class Title {
    private final String name;
    private final List<String> tags;

    public Title(String name) {
        this.name = name;
        this.tags = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getTags() {
        return tags;
    }

    public void addTag(String tag) {
        if (!tags.contains(tag)) {
            tags.add(tag);
        }
    }

    public void removeTag(String tag) {
        tags.remove(tag);
    }

    @Override
    public String toString() {
        return name + " - Tags: " + tags;
    }
}