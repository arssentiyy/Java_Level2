package Lesson3;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String args[]) {
        fPhoneBook();
    }

    private static void fPhoneBook() {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Петров Иван", "8-911-8526545");
        hm.put("Сидоров Василий", "8-921-6521455");
        hm.put("Петров Пётр", "8-904-55445646");
        hm.put("Сидоров Леонид", "8-952-5644645");
        hm.put("Петров Константин", "8-954-4123654");
        hm.put("Иванов Сергей", "8-252-6556445");
        hm.put("Кукушкин Павел", "8-56541-54455");
        for (Map.Entry<String, String> o : hm.entrySet()) {
            if (o.getKey().contains("Петров")) System.out.println(o.getKey() + ": " + o.getValue());
        }
        hm.put("Сидоров Илья", "8-92215-455649894");
        System.out.println("New Person Entry: Сидоров Илья: " + hm.get("Сидоров Илья"));


    }

}
