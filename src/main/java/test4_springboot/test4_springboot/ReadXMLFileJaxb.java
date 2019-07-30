package test4_springboot.test4_springboot;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ReadXMLFileJaxb {
    public static void main(String[] args) {
        File file = new File(ReadXMLFileJaxb.class.getClassLoader().getResource("book.xml").getFile());

        try {
            JAXBContext context = JAXBContext.newInstance(Book.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Book book = (Book) unmarshaller.unmarshal(file);
            System.out.println(book.toString());
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
    }
}