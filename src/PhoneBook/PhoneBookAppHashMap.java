package PhoneBook;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBookAppHashMap {
    final int CREATE = 1;
    final int SEARCH = 2;
    final int DELETE = 3;
    final int ALL = 4;
    final int EXIT = -1;

    private Scanner read;
    private HashMap<String, Phone> map = new HashMap<String, Phone>();

    private String information;
    private String phoneNum, name;

    public PhoneBookAppHashMap() {
        read = new Scanner(System.in);
    }

    public void add() {

        System.out.print("ADD");
        System.out.print("How many phone numbers?");
        int n = read.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Name : " + ", PhoneNum : ");
            information = read.next();
            String[] eachInformation = information.split(",");
            name = eachInformation[0];
            phoneNum = eachInformation[1];
            map.put(name, new Phone(phoneNum, name));
        }
    }

    public void delete() {
        System.out.println("DELETE");
        System.out.print("Name : ");
        name = read.next();
        if (map.get(name) == null) {
            System.out.print("Can't find");
            return;
        }
        map.remove(name);
    }

    public void search() {
        System.out.println("SEARCH");
        System.out.print("Name : ");
        name = read.next();
        System.out.println(map.get(name));
    }

    public void showAll() {
        for (String each : map.keySet()) {
            System.out.println("EACH : " + map.get(each));
        }
    }

    public void run() {
        int[] test = new int[6];
        int tests[] = new int[6];

        while (true) {
            System.out.println("Create:1, Search:2, Delete:3, All:4, Exit:-1");
            int menu = read.nextInt();
            switch (menu) {
                case CREATE:
                    add();
                    break;
                case DELETE:
                    delete();
                    break;
                case SEARCH:
                    search();
                    break;
                case ALL:
                    showAll();
                    break;
                case EXIT:
                    break;
            }
        }
    }

    public static void main(String[] args) {
        PhoneBookAppHashMap pba = new PhoneBookAppHashMap();

        pba.run();
    }
}
