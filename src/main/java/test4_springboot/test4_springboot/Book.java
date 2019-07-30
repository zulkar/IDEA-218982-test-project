package test4_springboot.test4_springboot;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    @XmlAttribute
    private String firstName;
    @XmlElement
    private String lastName;
    @XmlElement
    private String age;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Book [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
    }
}
