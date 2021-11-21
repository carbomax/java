package observer.propertyChangeListener;

public class PropertyChangeListenerDemo {

    public static void main(String[] args) {
        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();
        observable.addPropertyChangeListener(observer);
        observable.setNews("Nuevas noticias");
    }
}
