
public class StringTransformer {
    public String substringDeletion(String text, char char1, char char2){
        if (text == null || text.isEmpty()) return "";

        String[] sentences = splitSentences(text);

        String finalResult = "";

        for (int i = 0; i < sentences.length; i++) {
            finalResult += processSentence(sentences[i], char1, char2);

            if (i < sentences.length - 1) {
                finalResult += " ";
            }
        }

        return finalResult;
    }

    private String[] splitSentences(String input) {
        return input.split("(?<=[.!?])\\s+");
    }

    private String processSentence(String input, char char1, char char2) {
        int first = input.indexOf(char1);
        int last = input.lastIndexOf(char2);

        if (first == -1 || last == -1 || first >= last) {
            return input;
        }

        String firstPart = input.substring(0, first);
        String lastPart = input.substring(last + 1);

        return firstPart + lastPart;
    }
}

