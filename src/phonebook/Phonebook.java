package phonebook;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Яна Белова", "+7-234-79-24-97");
        phoneBook.put("Аня Кадушкина", "+7-129-79-24-67");
        phoneBook.put("Катя Сергеева", "+7-234-99-24-56");
        phoneBook.put("Кристина Кузнецова", "8-234-79-24-45");
        phoneBook.put("Женя Данильчук", "+7-234-798934");
        phoneBook.put("Катя Яковлева", "+7238972422");
        phoneBook.put("Николай Долгов", "+7-333-79-24-01");
        phoneBook.put("Азамат Джураев", "+7-234-79-00-02");
        phoneBook.put("Татьяна Польская", "+7-234-49-24-99");
        phoneBook.put("Вова Баскин", "+7-134-15-24-10");
        phoneBook.put("Милена Белова", "+7238888412");
        phoneBook.put("Аня Борзова", "+8987792423");
        phoneBook.put("Илья Сергеев", "7234999900");
        phoneBook.put("Кристина Окорокова", "8-130-79-04-88");
        phoneBook.put("Евгений Иванов", "+7-234-797911");
        phoneBook.put("Михаил Яковлев", "+7230972444");
        phoneBook.put("Катя Долгова", "+7-033-79-04-55");
        phoneBook.put("Барахман Джураев", "+7-234-59-00-66");
        phoneBook.put("Королина Королева", "+7-234-09-24-81");
        phoneBook.put("Владимир Баскакин", "+7-104-15-24-87");

        for (Map.Entry<String, String> contact: phoneBook.entrySet()) {
            System.out.println("Контакт " + contact.getKey() + ": " + contact.getValue());
        }
    }
}