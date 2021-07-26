public class ExpensiveObjectProxy implements ExpensiveObject {
    private static ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }
}

//Nous allons maintenant utiliser le modèle Proxy et initialiser notre objet à la demande. 
