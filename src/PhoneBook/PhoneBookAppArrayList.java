package PhoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookAppArrayList {
    final int CREATE = 1;
    final int SEARCH = 2;
    final int DELETE = 3;
    final int ALL = 4;
    final int EXIT = 5;

    private ArrayList<Phone> array = new ArrayList<Phone>();
    private String phone, name;
    String[] datas;
    Scanner read ;

    public PhoneBookAppArrayList(){
        read = new Scanner(System.in);
    }

    public void add(){
        System.out.println("ADD");
        int count = read.nextInt();
        for (int i = 0; i < count; i ++){
            String temp = read.next();
            datas = temp.split(",");
            name = datas[0];
            phone = datas[1];
            array.add(new Phone(phone,name));
        }
    }
    public void delete(){
        System.out.println("DELETE");
        name = read.next();
        for(Phone each: array){
            if(each.getName().equals(name)){
                array.remove(each);
            }
        }
    }
    public void search(){
        System.out.println("SEARCH");
        name = read.next();
        for(Phone each: array){
            if(each.getName().equals(name)){
                System.out.println("FOUNT Name");
                System.out.println(each.toString());
            }
        }
    }
    public void showAll(){
        System.out.println("ALL");
        for(Phone each: array){
            System.out.println(each);
        }
    }
    public void run(){
        while(true){
            System.out.println("Create:1, Search:2, Delete:3, All:4, Exit:-1");
            int menu = read.nextInt();
            switch(menu){
                case CREATE: add(); break;
                case DELETE: delete(); break;
                case SEARCH: search(); break;
                case ALL: showAll(); break;
                case EXIT: break;
            }
        }
    }
    public static void main (String[] args){
        PhoneBookAppArrayList pbaa = new PhoneBookAppArrayList();
        pbaa.run();
    }

}
