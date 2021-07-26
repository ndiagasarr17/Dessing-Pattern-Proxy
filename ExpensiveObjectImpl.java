public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }
    
    @Override
    public void process() {
        System.out.println("Traitement Terminé.");
       
    }
    
    private void heavyInitialConfiguration() {
        System.out.println("Chargement de la configuration initiale...");
        
    }
    
}

//l'implementation de notre interface avec plus de configurations
