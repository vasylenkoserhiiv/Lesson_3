package Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть номер ключа доступу (pro/exp) або залиште порожнім для безкоштовної версії: ");
        String key = scanner.nextLine();

        DocumentWorker documentWorker;

        if (key.equalsIgnoreCase("pro")) {
            documentWorker = new ProDocumentWorker();
        } else if (key.equalsIgnoreCase("exp")) {
            documentWorker = new ExpertDocumentWorker();
        } else {
            documentWorker = new DocumentWorker();
        }

        // Взаємодія з документом за допомогою відповідного об'єкту documentWorker
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();
    }
}