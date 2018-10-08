import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Main {
    
    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();
        
        MyClass myClass1 = new MyClass(new byte[] { 'a', 'b', 'c', 'd' });
        File file = new File("/tmp/tmp.json");
        objectMapper.writeValue(file, myClass1);
        
        MyClass myClass2 = objectMapper.readValue(file, MyClass.class);
        System.out.println(new String(myClass2.getPayload()));
        
        
    }
    
}