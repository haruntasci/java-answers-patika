public class Main {
    public static void main(String[] args) {
        // Integer veriler için liste oluşturma
        MyList<Integer> integerList = new MyList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
        System.out.println("size of first list: "+integerList.size());

        // String veriler için liste oluşturma
        MyList<String> stringList = new MyList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("avocado");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println("size of second list: "+stringList.size());
    }

}
