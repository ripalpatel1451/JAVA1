
class Operator
{
    private int i;
    public void preincrement(int i)
    {
        System.out.println("Value of (++i) i: "+ ++i);
System.out.println("ABC");
    }
    public void postincrement(int i)
    {
        System.out.println("Value of (i++) i: "+ i++ +" and Value of i after postincrement" +i);
    }
}
