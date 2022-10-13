import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class ListTests {
	
    //my tests 
    /* 
    @Test
    public void filterTest(){
        List<String> input = Arrays.asList("hi", "hello", "k", "hm"); 
        //String a = "h";
        StringChecker sc = new StringChecker(){
            public boolean checkString(String s){
                return true; 
            } 
        };  
        ListExamples.filter(input,sc); 
        assertEquals(input, input);
    }*/
    @Test
    public void mergeTest(){
        List<String> input = Arrays.asList("hi", "hello", "k", "hm");
        List<String> input2 = Arrays.asList("boy", "apple"); 
        ListExamples.merge(input, input2);
        List<String> comp = Arrays.asList("apple", "boy", "hello", "hi", "hm", "k"); 
        assertEquals(comp, ListExamples.merge(input, input2)); 
    }
}
