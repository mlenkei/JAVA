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