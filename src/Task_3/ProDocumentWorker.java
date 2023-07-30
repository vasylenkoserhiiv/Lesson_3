package Task_3;
/*
"Документ відредаговано", "Документ збережено у старому форматі, збереження в інших форматах доступне
у версії Експерт"
 */
public class ProDocumentWorker extends DocumentWorker {
    @Override
    public void editDocument(){
        System.out.println("Документ відредаговано");
    }
    @Override
    public void saveDocument(){
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне\n" +
                "у версії Експерт");
    }
}
