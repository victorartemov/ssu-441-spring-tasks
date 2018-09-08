package model;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class MethodReplacerImpl implements MethodReplacer {
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("Heh, Hi again instead of buy!");
        return null;
    }
}
