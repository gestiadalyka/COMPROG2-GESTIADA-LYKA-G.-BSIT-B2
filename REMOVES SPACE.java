public class removespace {
    public static void main(String[] args)
        {
            String str = "        l y k a       ";
           
            // Call the replaceAll() method
            str = str.replaceAll("\\s", "");
           
            System.out.println(str);
        }
    }
