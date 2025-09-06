public class numOfWords {
    public static void main(String[] args) {
        String txt = "Plant hope in the hearts of others";
      
        int i = 0;
        int total = 0;

        while (i < txt.length()) {
            if(txt.charAt(i) == ' ' && txt.charAt(i + 1) != ' '){
                total++;
            }
            i++;
        }
      
        System.out.println(total + 1);
       
    }
}
