package nested_loop;

public class Nested_loop {

    public static void main(String[] args) {
        my_class obj1 = new my_class();
        obj1.my_method();
    }
}

class my_class {

    void my_method() {
        Forlabel_1:
        for (int i = 1; i <= 10; i++) {

            Forlabel_2:
            for (int j = 1; j <= 10; j++) {
                System.out.print(j);
                if (i == j) {
                    break Forlabel_2;
                }
            }
            System.out.println();
        }
    }
}
