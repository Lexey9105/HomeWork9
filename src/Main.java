import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    private static void test1() {
        int expenseArr []=generateRandomArray ();
        System.out.println(Arrays.toString(expenseArr));
        int totalExpense=0;
        for (int elements:expenseArr){totalExpense+=elements;}
        System.out.println("Сумма трат рублей за месяц сотавила "+totalExpense+" рублей");

    }

    private static void test2() {
            int expenseArr []=generateRandomArray ();
        System.out.println(Arrays.toString(expenseArr));
            int totalExpense=0;
            for (int elements:expenseArr){totalExpense+=elements;}
            int minExpense=totalExpense;
            for (int elements:expenseArr){if (minExpense>elements){minExpense=elements;}}
        System.out.println("Минимальная сумма трат рублей за месяц составила "+minExpense);
            int maxExpense=-1;
            for (int elements:expenseArr){if (maxExpense<elements){maxExpense=elements;}
                }
        System.out.println("Максимальная сумма трат рублей за месяц составила "+maxExpense);
    }
    private static void test3() {
        int expenseArr []=generateRandomArray ();
        System.out.println(Arrays.toString(expenseArr));
        int averageExpense=0;
        for (int elements:expenseArr){averageExpense+=elements;}
        System.out.println("Средняя сумма трат за месяц составила "+(float)averageExpense/expenseArr.length+" рублей");

    }
    private static void test4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=reverseFullName.length-1;i>=0;i--){
            System.out.print(reverseFullName[i]);
        }
    }
}





