// public class tasku {

// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder();

// String c1 = "a";
// String c2 = "b";
// int n = 100;
// for (int i = 0; i < n / 2; i++) {
// sb.append(c1);
// sb.append(c2);
// }
// try (FileWriter notation = new FileWriter("dz_2/logcalc.txt", true)) {
// notation.append(
// ("считалка: " + number1 + operation + number2 + " = " + calc(number1,
// number2, operation)
// + "\n"));
// notation.close();
// } catch (IOException e) {
// System.out.println(e.toString());
// }
// System.out.println(sb);
// }
// }

// public static void main(String[] args) { // метод ввода, печати считает
// try (Scanner in = new Scanner(System.in, "866")) {
// System.out.println("Введите первое число: ");
// float number1 = in.nextFloat();
// System.out.println("Выберите операцию +, -, / или *: ");
// String operation = in.next();
// System.out.println("Введите второе число: ");
// float number2 = in.nextFloat();
// System.out.println(calc(number1, number2, operation));
// try (FileWriter notation = new FileWriter("dz_2/logcalc.txt", true)) {
// notation.append(
// ("считалка: " + number1 + operation + number2 + " = " + calc(number1,
// number2, operation)
// + "\n"));
// notation.close();
// } catch (IOException e) {
// System.out.println(e.toString());
// }
// }

//

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;

// public class tasku {
// public static void main(String[] args) {
// String pathProject = System.getProperty("user.dir");
// String pathDir = pathProject.concat("/L2");
// File dir = new File(pathDir);
// String fileName = "L2/l2t3.txt";
// System.out.println(dir.getAbsolutePath());
// for (String fname : dir.list()) {
// UserFileWriter(fileName, fname);
// }
// }

// public static void UserFileWriter(String fileName, String inputString) {
// try (FileWriter notation = new FileWriter(fileName, true)) {
// notation.append(inputString + '\n');
// notation.close();
// } catch (IOException e) {
// System.out.println(e.toString());
// }
// }
// }