package PhoneBook;

public class Phone {
    private String phoneNum;
    private String name;

    public Phone(){

    }
    public Phone(String phoneNum, String name){
        this.phoneNum = phoneNum;
        this.name=name;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public String getName(){
        return name;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public void setName(String name){
        this.name = name;
    }
    public String toString(){
        return "phone : "+phoneNum + " Name : " + name;
    }
}
