package bitbucket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CollStorage implements MainActions{
    private ArrayList<Integer> al = new ArrayList<>();

    @Override
    public void add(int num) {
        for (int i = 0; i < al.size(); i++) {
            al.set(i, al.get(i) + num);
        }
        al.add(num);
    }

    @Override
    public void delete(int num) {
        for (int i = 0; i < al.size(); i++) {
            al.set(i, al.get(i) - num);
        }

        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) == num) {
                al.remove(i);
                break;
            }
        }
    }

    @Override
    public void searchByNumber(int num) {
        if (al.contains(num))
            System.out.println("Collection contains this number");
        else
            System.out.println("Not found");
    }

    @Override
    public void searchByIndex(int index) {
        if (index > al.size() - 1)
            System.out.println("Array index not found");
        System.out.println(al.get(index));
    }

    @Override
    public int searchMin() {
        int min = al.get(0);
        for (int i = 1; i < al.size(); i++) {
            if (min > al.get(i))
                min = al.get(i);
        }
        return min;
    }

    @Override
    public int searchMax() {
        int max = al.get(0);
        for (int i = 1; i < al.size(); i++) {
            if (max < al.get(i))
                max = al.get(i);
        }
        return max;
    }

    @Override
    public double searchAverage() {
        double sum = .0;
        for(int x : al) sum += x;
        return sum/al.size();
    }

    void selectAction(int coursor) throws IOException {
        switch (coursor) {
            case 1:
                System.out.print("Add number: ");
                add(input());
                break;
            case 2:
                System.out.print("Delete number: ");
                delete(input());
                break;
            case 3:
                System.out.print("Enter number: ");
                searchByNumber(input());
                break;
            case 4:
                System.out.print("Enter index: ");
                searchByIndex(input());
                break;
            case 5:
                System.out.println(searchMin());
                break;
            case 6:
                System.out.println(searchMax());
                break;
            case 7:
                System.out.println(searchAverage());
                break;
        }
    }

    int input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }
}