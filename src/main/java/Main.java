import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 20));
        people.add(new Person("Bill", 21));
        people.add(new Person("Maria", 19));

        int bill = people.indexOf(new Person("Bill", 21));
        System.out.println(bill);

        Person[] array = new Person[0];
        array = people.toArray(array);
        people.get(1).setAge(99);

        for (Person person : array) {
            System.out.println(person);
        }

        List<Person> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(people.getClass());
        System.out.println(list.getClass());
    }

    private void run3() {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int x;
        while ((x = in.nextInt())!=0) {
            list.add(x);
        }
        System.out.println(list);
        // Видалити всі парні числа
        // 1 2 4 3 5 6 7 8 10 11 3 12 15 0
        // 1 3 5 7 11 3 15

        list.removeIf(e -> e % 2 == 0);
        System.out.println(list);

        System.out.println(list.contains(3));
        System.out.println(list.contains(4));

        System.out.println(list.indexOf(3));
        System.out.println(list.lastIndexOf(3));
        System.out.println(list.indexOf(14));
    }

    private void run2() {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int x;
        while ((x = in.nextInt())!=0) {
            list.add(x);
        }

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        for (int a : list) {
            System.out.print(a + " ");
        }
        System.out.println();

    }

    private void runWithArray() {
        // 1 5 2 6 7 8 0
        int[] arr = new int[10];
        int count = 0;
        Scanner in = new Scanner(System.in);
        int x;
        while ((x = in.nextInt())!=0) {
            arr[count] = x;
            count++;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private void run1() {
        BoxPrinter<String> bp1 = new BoxPrinter<>("Hello");
        System.out.println(bp1);

        var bp2 = new BoxPrinter<>(123);
        System.out.println(bp2);

        bp2.setVal(111);


        String[] arr = {"first", "second", "hello", "one", "last"};
        Optional<String> longest = findMax(arr);
        if (longest.isPresent()) {
            System.out.println(longest.get());
        } else {
            System.out.println("not found");
        }

        String[] empty = {};
        Optional<String> longest2 = findMax(empty);
        if (longest2.isPresent()) {
            System.out.println(longest2.get());
        } else {
            System.out.println("not found");
        }

        List<String> list = List.of("one", "two", "three", "four");
        System.out.println(list);
    }

    private Optional<String> findMax(String[] arr) {
        if (arr.length == 0) return Optional.empty();
        String res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > res.length()) {
                res = arr[i];
            }
        }
        return Optional.of(res);
    }


}
