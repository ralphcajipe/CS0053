class Test
{

    public static void main(String[] args)

    {

        StringBuffer a = new StringBuffer("geeks");

        StringBuffer b = new StringBuffer("forgeeks");

        a.delete(1,3);

        a.append(b);

        System.out.println(a);

        // Output is gksforgeeks

    }

}