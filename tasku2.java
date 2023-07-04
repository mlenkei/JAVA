// package .vscode;

// public class tasku2 {
// import java.util.ArrayList;
// import java.util.concurrent.ThreadLocalRandom;

// public class l3t1 {
// public static void main(String[] args) {

// ArrayList<Integer> newRandomArr = new ArrayList<Integer>();

// for (int i = 0; i < 10; i ++){
// int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
// newRandomArr.add(randomNum);
// }

// System.out.println(newRandomArr.toString());

// newRandomArr.sort(null);
// System.out.println(newRandomArr.toString());
// }
// }
// }

// import java.util.ArrayList;
// import java.util.Arrays;

// public class l3t2 {

// public static void main(String[] args) {
// ArrayList<String> solarPlanetList = new
// ArrayList<String>(Arrays.asList("Меркурий","Меркурий", "Pluto", "Венера",
// "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Уран", "Уран",
// "Венера"));
// System.out.println(solarPlanetList.toString());

// solarPlanetList.sort(null);
// System.out.println(solarPlanetList.toString());
// int count = 0;
// String planet = solarPlanetList.get(0);
// for (String item : solarPlanetList) {

// if (item != planet){
// System.out.printf(planet + count + '\n');
// count = 1;
// }
// else {
// count = count + 1;
// }
// planet = item;
// //System.out.printf("planet" + planet + "count" + count + '\n');
// }

// System.out.printf(planet + count + '\n');
// }
// }

// ArrayList<String> newSolarPlanetList = new ArrayList<String>();
// planet = "";
// for (String item : solarPlanetList) {

// if (item != planet){
// newSolarPlanetList.add(item);
// }

// planet = item;
// //System.out.printf("planet" + planet + "count" + count + '\n');
// }
// System.out.println(newSolarPlanetList.toString());
// package L4;

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.concurrent.ThreadLocalRandom;

// public class l4t1 {
    
//     public static void main(String[] args) {
//         long startTimeAL = System.nanoTime();
//         ArrayList<Integer> newRandomArr = new ArrayList<Integer>();
//         for (int i = 0; i < 1000000; i ++){
//             int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
//             newRandomArr.add(randomNum);
//         }
//         long endTimeAL = System.nanoTime();
//         long durationAL = (endTimeAL - startTimeAL);
//         System.out.println(durationAL);

//         long startTimeLL = System.nanoTime();
//         LinkedList<Integer> newRandomLList = new LinkedList<Integer>();
//         for (int i = 0; i < 1000000; i ++){
//             int randomNum = ThreadLocalRandom.current().nextInt(0, 20);
//             newRandomLList.add(randomNum);
//         }
//         long endTimeLL = System.nanoTime();
//         long durationLL = (endTimeLL - startTimeLL);
//         System.out.println(durationLL);   
// }
// }


// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.Scanner;

// public class l4t2 {
//     public static void main(String[] args) {
    
//     LinkedList<String> OriginLList = new LinkedList<String>();
//     for (int i = 0; i < 10; i ++){
//         OriginLList.add("java-" + i );
//     }
//     System.out.println(Arrays.toString(OriginLList.toArray()));
//     LinkedList<String> NewLList = UserInputInLL (OriginLList);
//     System.out.println(Arrays.toString(NewLList.toArray()));

//     }
//     public static LinkedList<String> UserInputInLL (LinkedList<String> LList){
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("Hello. Enter message format [text]~[num]?: ");
//         String userInputMsg = iScanner.next();
//         iScanner.close();

//         String[] InputMsgSplit = userInputMsg.split("~");
//         if (InputMsgSplit[0].equals("print") == false){
//             LList.add(Integer.parseInt(InputMsgSplit[1]), InputMsgSplit[0]);
//         }
//         else{
//             System.out.println(LList.get(Integer.parseInt(InputMsgSplit[1])));
//             LList.remove(Integer.parseInt(InputMsgSplit[1]));
//         }
            
//         return LList;
//     }
// }

// 21:20

// public static void main(String[] args) {
    
//         LinkedList<String> originLList = new LinkedList<String>();
//         for (int i = 0; i < 10; i ++){
//             originLList.add("j" + i );
//         }
//         System.out.println(Arrays.toString(originLList.toArray()));

//         Stack<String> userStack = new Stack<String>();
//         for (String i: originLList){
//             userStack.push(i);
//         }
//         System.out.println(Arrays.toString(userStack.toArray()));

//         Queue<String> userQueue = new LinkedList<String>();
//         for (String i: originLList){
//             userQueue.add(i);
//         }
//         System.out.println(Arrays.toString(userQueue.toArray()));
//     }

// 21:45

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут
//  повторяющиеся имена с разными телефонами, их необходимо считать, 
// как одного человека с разными телефонами. Вывод должен быть
//  отсортирован по убыванию числа телефонов.


// 1. Подумать над структурой класса Ноутбук для магазина техники
//  - выделить поля и методы. Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написать метод, который будет запрашивать у пользователя критерий
//  (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
// Критерии фильтрации можно хранить в Map. Например:	“Введите цифру, 
//  соответствующую необходимому критерию:	

// 1 - ОЗУ

// 2 - Объем ЖД

// 3 - Операционная система

// 4 - Цвет …

// 1. Далее нужно запросить минимальные значения для указанных критериев - 
// сохранить параметры фильтрации можно также в Map.
// 2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие
//  по условиям.

// 22:01
