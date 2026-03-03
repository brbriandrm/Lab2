import java.util.Locale;

public class StringTransformer {
    public static String  substringDeletion(String text, char char1, char char2){
        if (text == null || text.isEmpty() ) return  "";
        String[] sentences = text.split("(?<=[.!?])\\s+");
        String finalResult = "";

        for(int i = 0; i <sentences.length; i++){
            int first = sentences[i].indexOf(char1);
            int last = sentences[i].lastIndexOf(char2);

            if(first !=-1 && last != -1 && first < last) {
                String firstPart = sentences[i].substring(0, first);
                String lastPart = sentences[i].substring(last + 1);

                finalResult += firstPart + lastPart;
            }
            else{
                finalResult += sentences[i];
            }
            if(i < sentences.length-1){
                finalResult += " ";
            }
        }
        return finalResult;
    }
}
