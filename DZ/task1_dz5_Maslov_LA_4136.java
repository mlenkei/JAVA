// Задание 1.
// Реализуйте структуру телефонной книги с помощью HashMap,
// учитывая, что 1 человек может иметь несколько телефонов.
package DZ;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1_dz5_Maslov_LA_4136{
    
       // Метод - добавляет номера в книгу
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    // Метод - печатает список контактов
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Светлана_Петрова", 123, bookPhone);
        addNumber("Кристина_Белова", 1234, bookPhone);
        addNumber("Анна_Мусина", 546585, bookPhone);
        addNumber("Анна_Крутова", 8956477, bookPhone);
        addNumber("Иван_Юрин", 12356233, bookPhone);
        addNumber("Петр_Лыков", 787897, bookPhone);
        addNumber("Павел_Чернов", 902605, bookPhone);
        addNumber("Петр_Чернышов", 912612, bookPhone);
        addNumber("Мария_Федоровна", 953601, bookPhone);
        addNumber("Марина _Светлова", 790354, bookPhone);
        addNumber("Иван_Савин", 786549, bookPhone);
        addNumber("Мария_Рыкова", 799905, bookPhone);
        addNumber("Марина_Луговая", 788881, bookPhone);
        addNumber("Анна_Владимирова", 787777, bookPhone);
        addNumber("Иван_Мечников", 792487, bookPhone);
        addNumber("Петр_Петин", 864321, bookPhone);
        addNumber("Иван_Ежов", 9784621, bookPhone);
        addNumber("Кристина_Белова", 894537, bookPhone);
        addNumber("Иван_Савин", 755555, bookPhone);
        printBook(bookPhone);
    }
}
