package MapAdvancedIndexApplication;

import java.util.Objects;

public class Topic {

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdvancedIndexApplication.Topic that = (AdvancedIndexApplication.Topic) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public Topic(String name) {
        this.name = name;


    }


}
