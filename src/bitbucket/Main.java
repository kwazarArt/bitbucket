package bitbucket;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CollStorage cs = new CollStorage();
        System.out.println("Creating storage...");
        int selector;

        do {
            System.out.println("Please, select option:");
            System.out.println("1 - add");
            System.out.println("2 - delete");
            System.out.println("3 - search by number");
            System.out.println("4 - search by index");
            System.out.println("5 - search min element");
            System.out.println("6 - search max element");
            System.out.println("7 - search avarage");
            System.out.println("0 - exit");
            selector = cs.input();
            if (selector == 0) break;
            if (selector < 1 || selector > 7)
                System.out.println("Select again");
            else
                cs.selectAction(selector);
        } while (selector >= 1 && selector <= 7);

    }
}
