package adapter;

public class ObjectAdapter implements TestInterface{
    private TestObject object;

    @Override
    public void method() {
        object.myMethod();
    }
}
