/**
 * Created by user on 2016/10/12.
 */
public class Student implements Comparable{
    private Integer age;
    private String name;

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
       Student student=(Student)o;

        if(student.getAge().compareTo(this.getAge())>0){
            return -1;
        }else if(student.getAge().compareTo(this.getAge())==0){
            return 0;
        }else {
            return -1;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
