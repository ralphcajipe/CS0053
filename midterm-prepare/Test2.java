class Test2
{
    public static void main(String[] args)
    {

        String str = "geeks";

        str.toUpperCase();

        str += "forgeeks";

        String string = str.substring(2,13);

        string = string + str.charAt(4);;

        System.out.println(string);
        // Output is eksforgeekss
    }
}