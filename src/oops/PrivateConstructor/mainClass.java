package oops.PrivateConstructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class mainClass {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {

        Constructor<pConstructionClass> con=pConstructionClass.class.getDeclaredConstructor();
        con.setAccessible(true);

        pConstructionClass p1=con.newInstance();
    }
}
