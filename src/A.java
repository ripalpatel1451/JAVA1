public class A
{
    public static void main(String[] args) {
        System.out.println("Hello...");
        Add add = new Add();
        add.add(10,20);

        Operator operator = new Operator();
        operator.preincrement(5);
        operator.postincrement(5);
    }
}
