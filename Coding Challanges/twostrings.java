public class twostrings{
    public static void main(String[] args) {
        // String name1 = "Anas";
        // String name2 = "Anas";

        // String result = is_name(name1, name2);
        // System.out.println(result);

        String[] my_array = {"stayhome","coronavirus","Saudi_Arabia"};

       String result = ass(my_array);

       System.out.println(result);
    }

    // public static String is_name(String name1 , String name2){
    //     if(name1 != name2)
    //     return "false";
    //     else
    //     return "true";
    // }

    public static String ass(String[] my_array){
        String add ="";
        for (int i=0;i<my_array.length;i++) {
            add += '#' + my_array[i];
        }
        return add.trim();
        
    }
}