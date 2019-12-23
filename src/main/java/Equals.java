import java.util.HashMap;
import java.util.Objects;

/**
 * @author 喻浩
 * @create 2019-12-23-上午8:57
 */
public class Equals {
    
    //只要 id 一样，那么 person 就一样
    public static void main(String[] args) {
        Person person1 = new Person(1,"3");
        Person person2 = new Person(1,"3");
        System.out.println(person1.equals(person2));

        HashMap<Person,String> hashMap = new HashMap<>();
        hashMap.put(person1,"老师");

        System.out.println(hashMap.get(person2));
    }
    
    static class Person{
        private int id;
        private String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return id == person.id;
        }
    }
}
