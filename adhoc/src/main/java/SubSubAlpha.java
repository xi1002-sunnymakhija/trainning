class Alpha
{
    static String s = " ";
    protected Alpha()
    {
        s += "alpha ";
    }

    private void foo()
    {
        System.out.println("x");
    }
}
class SubAlpha extends Alpha
{
    private SubAlpha()
    {
        s += "sub ";
    }
    private void foo()
    {
        System.out.println("xoo");
    }
}

public class SubSubAlpha extends Alpha
{
    private SubSubAlpha()
    {
        s += "subsub ";
    }
    public static void main(String[] args)
    {
        new SubSubAlpha();
        System.out.println(s);
    }
}

