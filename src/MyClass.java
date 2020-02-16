import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
//        JFrame jFrame = new JFrame("My App");
//        jFrame.setContentPane(new MyFirstForm().jpanel);
//        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
//        jFrame.pack();
//        jFrame.setVisible(true);

        Scanner option = new Scanner(System.in);
        printLine("Masukkan Operasi (Tambah, Kali, Bagi, Kurang, Pythagoras sisi miring, Pythagoras sisi tegak, Modulus, Root)");
        String myOption = option.nextLine().toLowerCase().trim();
        printLine("Masukkan Angka Pertama (untuk root silahkan isi nilai kedua dengan 0)");
        String firstNumber = option.nextLine().trim();
        printLine("Masukkan Angka Kedua");
        String secondNumber = option.nextLine().trim();

        if (myOption.isEmpty()) {
            printLine("Please fill the Option");
        } else {
            int myTotal;
            if (firstNumber.isEmpty() && secondNumber.isEmpty()) {
                printLine("Not Allowing to be empty");
            } else if (firstNumber.isEmpty() || secondNumber.isEmpty()) {
                printLine("Not Allowing to be empty");
            } else {
                try {
                    int myFirst = Integer.parseInt(firstNumber);
                    int mySecond = Integer.parseInt(secondNumber);
                    switch (myOption) {
                        case "kali":
                            myTotal = myFirst * mySecond;
                            printLine("Result : " + intToString(myTotal));
                            break;
                        case "tambah":
                            myTotal = myFirst + mySecond;
                            printLine("Result : " + intToString(myTotal));
                            break;
                        case "bagi":
                            myTotal = myFirst / mySecond;
                            printLine("Result : " + intToString(myTotal));
                            break;
                        case "kurang":
                            myTotal = myFirst - mySecond;
                            printLine("Result : " + intToString(myTotal));
                            break;
                        case "pythagoras sisi miring":
                            myTotal = pythagorasResult(myFirst, mySecond, "+");
                            printLine("Result : " + intToString(myTotal));
                            break;
                        case "pythagoras sisi tegak":
                            myTotal = pythagorasResult(myFirst, mySecond, "-");
                            printLine("Result : " + intToString(myTotal));
                            break;
                        case "modulus":
                            myTotal = myFirst%mySecond;
                            printLine("Result : " + intToString(myTotal));
                            break;
                        case "root":
                            myTotal = (int) Math.sqrt(Double.parseDouble(String.valueOf(myFirst)));
                            printLine("Result : " + intToString(myTotal));
                            break;
                        default:
                            printLine("Salah Option");
                    }
                } catch (Exception ex) {
                    printLine(ex.toString());
                    printLine("Harus Angka");
                }
            }
        }
    }

    private static int pythagorasResult(int myFirst, int mySecond, String symbol) {
        if (symbol.equals("+")) return (int) Math.sqrt(Math.pow(myFirst, 2) + Math.pow(mySecond, 2));
        else return (int) Math.sqrt(Math.pow(myFirst, 2) - Math.pow(mySecond, 2));
    }

    private static String intToString(int value) {
        return String.valueOf(value);
    }

    public static void printLine(String msg) {
        System.out.println(msg);
    }
}
