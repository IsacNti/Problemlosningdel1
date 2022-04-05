import com.sun.org.apache.xpath.internal.operations.Equals;

class om {
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static String capitalizeWord(String str){
        String words[]=str.split("\\s");
        String capitalizeWord="";
        for(String w:words){
            String first=w.substring(0,1);
            String afterfirst=w.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";

        }
        capitalizeWord = (capitalizeWord.replaceAll(" ", ""));


        return capitalizeWord.trim();
    }

    public static String palindromeWord (String str) {
        StringBuilder a=new StringBuilder(str);

        a.reverse();
    return a.toString();
    }
}