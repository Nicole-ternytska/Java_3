import org.junit.Test;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class Lab3test {

    @Test
    public void filter_int_Test() {
        ArrayList<Integer> int_list = new ArrayList<>();
        int_list.add(1);
        int_list.add(-10);
        int_list.add(6);
        int_list.add(0);
        Predicate<Integer> provision = number -> number<=0;
        ArrayList<Integer> int_list_result = new ArrayList<>();
        int_list_result.add(-10);
        int_list_result.add(0);
        assertEquals(Lab3.filter(int_list, provision), int_list_result);
    }
    @Test
    public void filter_float_Test() {
        ArrayList<Float> float_list = new ArrayList<>();
        float_list.add(1.2f);
        float_list.add(12f);
        float_list.add(-6.3f);
        float_list.add(-2f);
        Predicate<Float> provision = number -> number%2 == 0;
        ArrayList<Float> float_list_result = new ArrayList<>();
        float_list_result.add(12f);
        float_list_result.add(-2f);
        assertEquals(Lab3.filter(float_list, provision), float_list_result);
    }
    @Test
    public void filter_str_Test() {
        ArrayList<String> str_list = new ArrayList<>();
        str_list.add("ffff");
        str_list.add("abc");
        str_list.add("cdxz");
        str_list.add("a");
        Predicate<String> provision = str -> str.contains("a");
        ArrayList<String> str_list_result = new ArrayList<>();
        str_list_result.add("abc");
        str_list_result.add("a");
        assertEquals(Lab3.filter(str_list, provision), str_list_result);
    }
    @Test
    public void filter_bool_Test() {
        ArrayList<Boolean> bool_list = new ArrayList<>();
        bool_list.add(true);
        bool_list.add(true);
        bool_list.add(false);
        bool_list.add(true);
        Predicate<Boolean> provision = boo -> boo == false;
        ArrayList<Boolean> bool_list_result = new ArrayList<>();
        bool_list_result.add(false);
        assertEquals(Lab3.filter(bool_list, provision), bool_list_result);
    }

    @Test
    public void transform_int_Test() {
        ArrayList<Integer> int_list = new ArrayList<>();
        int_list.add(1);
        int_list.add(-10);
        int_list.add(6);
        int_list.add(0);
        Function<Integer,Integer> function = number -> number*12;
        ArrayList<Integer> int_list_result = new ArrayList<>();
        int_list_result.add(12);
        int_list_result.add(-120);
        int_list_result.add(72);
        int_list_result.add(0);
        assertEquals(Lab3.transform(int_list, function), int_list_result);
    }
    @Test
    public void transform_float_Test() {
        ArrayList<Float> float_list = new ArrayList<>();
        float_list.add(1.2f);
        float_list.add(12f);
        float_list.add(-6.3f);
        float_list.add(-2f);
        Function<Float,Integer> function = number -> (int)(number*0);
        ArrayList<Integer> float_list_result = new ArrayList<>();
        float_list_result.add(0);
        float_list_result.add(0);
        float_list_result.add(0);
        float_list_result.add(0);
        assertEquals(Lab3.transform(float_list, function), float_list_result);
    }
    @Test
    public void transform_str_Test() {
        ArrayList<String> str_list = new ArrayList<>();
        str_list.add("ffff");
        str_list.add("abc");
        str_list.add("cdxz");
        str_list.add("aaaaaaaaaa");
        Function<String,String> function = str -> str.toUpperCase();
        ArrayList<String> str_list_result = new ArrayList<>();
        str_list_result.add("FFFF");
        str_list_result.add("ABC");
        str_list_result.add("CDXZ");
        str_list_result.add("AAAAAAAAAA");
        assertEquals(Lab3.transform(str_list, function), str_list_result);
    }
    @Test
    public void transform_bool_Test() {
        ArrayList<Boolean> bool_list = new ArrayList<>();
        bool_list.add(true);
        bool_list.add(true);
        bool_list.add(false);
        bool_list.add(true);
        Function<Boolean,Boolean> function = boo -> boo=false;
        ArrayList<Boolean> bool_list_result = new ArrayList<>();
        bool_list_result.add(false);
        bool_list_result.add(false);
        bool_list_result.add(false);
        bool_list_result.add(false);
        assertEquals(Lab3.transform(bool_list, function), bool_list_result);
    }

}