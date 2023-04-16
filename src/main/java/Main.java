import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.runArrayListPractise();
    }

    private void runArrayListPractise() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add(0,"second");
        list.add(0,"third");
        list.add(0, "fourth");
        list.add(0,"sixth");
        list.add(1, "fifth");
        //System.out.println(list);
        ListIterator<String> iterator2 = list.listIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        List<String> numbers = new ArrayList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Four");
        numbers.set(2, "Three");
        for (String element : numbers) {
            System.out.println(element);
        }

        ArrayList<String> birds = new ArrayList<>();
        String s1 = "Crow";
        String s2 = "Duck";
        String s3 = "Pig";
        String s4 = "Pigeon";
        birds.add(s1);
        birds.add(s2);
        birds.add(s3);
        birds.add(s4);
        birds.remove(2);
        for (String element : birds) {
            System.out.println(element);
        }

        ArrayList<String> moreBirds = new ArrayList<>();
        moreBirds.add("Swan");
        moreBirds.add("Flamingo");

        birds.addAll (3, moreBirds); // Додавання всіх елементів moreBirds до birds, починаючи з індекса 3
        /*for (String val : birds) {
            System.out.println(val);*/
        for (Iterator<String> iterator = (Iterator<String>) list.iterator(); iterator.hasNext(); ) {
            String next = iterator.next();
            System.out.println(next);
        }

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Norway");
        countries.add("Sweden");
        countries.clear(); // Видалення всіх елементів із списку
        for (String val : countries) {
            System.out.println(val);
        }
    }

    private void runPair() { // Дженерік з двома параметрами
        Pair <Integer, String> worldCup = new Pair <> (2022, "Qatar");
        System.out.println("World cup " + worldCup.getFirst() + " in " + worldCup.getSecond());
    }

    private void run() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 20));
        people.add(new Person("Bill", 21));
        people.add(new Person("Maria", 19));

        int bill = people.indexOf(new Person("Bill", 21));
        System.out.println(bill);

        Person[] array = new Person[0]; // toArray з параметром
        array = people.toArray(array);
        people.get(1).setAge(99);

        for (Person person : array) {
            System.out.println(person);
        }

        List<Person> list = new ArrayList<>(Arrays.asList(array)); // Обгортаємо в створення нового ArrayList
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

        list.removeIf(e -> e % 2 == 0); // Лямбда вираз
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
        BoxPrinter<String> myBoxPrinter = new BoxPrinter<> ("I'm learning generics!");
        System.out.println(myBoxPrinter);

        BoxPrinter<Integer> myIntBoxPrinter = new BoxPrinter<> (777);
        System.out.println(myIntBoxPrinter);

        BoxPrinter<Double> myDoubleBoxPrinter = new BoxPrinter<> (0.77);
        System.out.println(myDoubleBoxPrinter);

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

    private void runG() {
        GenericsPractise<String> myStringGeneric = new GenericsPractise<> ("learning generics");
        System.out.println(myStringGeneric);

        GenericsPractise<Integer> myIntGeneric = new GenericsPractise<> (789);
        System.out.println(myIntGeneric);

        GenericsPractise<Double> myDoubleGeneric = new GenericsPractise<> (0.99);
        System.out.println(myDoubleGeneric);

        var randomGeneric = new GenericsPractise<>(123456789);
        System.out.println(randomGeneric);

        String[] arr = {"short", "long", "superlong"};
        Optional<String> longest3 = findMax(arr);
        if (longest3.isPresent()) {
            System.out.println(longest3.get());
        } else {
            System.out.println("not found");
        }

        List <String> pets = List.of("cat", "dog", "chinchilla", "hamster");
        System.out.println(pets);

    }

    private Optional<String> findMax(String[] arr) { // Пощук найдовшого рядка в масиві
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
