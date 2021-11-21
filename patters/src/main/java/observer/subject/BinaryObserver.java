package observer.subject;

public class BinaryObserver extends Observer {

    @Override
    public void update(Subject subject) {
        System.out.println( "Octal String: " + Integer.toBinaryString((Integer) subject.getState()) );
    }
}
