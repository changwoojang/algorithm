package CodingList;

class StudentInfo {
    public int grade;

    StudentInfo(int grade) {
        this.grade = grade;
    }
}

class StudentPerson {
    public StudentInfo info;

    StudentPerson(StudentInfo info) {
        this.info = info;
    }
}

class EmployeeInfo {
    public int rank;

    EmployeeInfo(int rank) {
        this.rank = rank;
    }
}

class Testing<T> {
    public T test;
}

class EmployeePerson {
    public EmployeeInfo info;

    EmployeePerson(EmployeeInfo info) {
        this.info = info;
    }
}

class Person<T> {
    public T info;

    Person(T info) {
        this.info = info;
    }
}

public class GenericTest {
    public static void main(String[] args) {
        Testing<String> p1 = new Testing<String>();
//        CodingList.Person<Integer> tt = new CodingList.Person<>();
        Testing<StringBuilder> p2 = new Testing<StringBuilder>();

        System.out.println(p1.toString());
//        System.out.println(tt);
        System.out.println(p2);


        StudentInfo si = new StudentInfo(2);
        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info.grade); // 2
        System.out.println(sp.info); // 2

        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank); // 1
        System.out.println(ep.info); // 1

        Person<EmployeeInfo> person = new Person(new EmployeeInfo(12)); //런타임 에러가 발생한다
        EmployeeInfo employee =  person.info;
        System.out.println(employee.rank);

    }

}
