package Generic.Class;

public class Student<T> {
    private T id;
    private String name;
    private String age;

    public Student(T id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public T getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setId(T id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
