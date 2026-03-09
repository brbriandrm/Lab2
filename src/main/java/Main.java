public class Main {
    public static void main(String[] args){
        try{
            String str = """
                         Or where the dirge of a brave past is chaunted.
                         In dolorous dusks by immemorial walls.""";
            char first = 'r';
            char last  = 'w';

            StringTransformer transformer = new StringTransformer();
            String result = transformer.substringDeletion(str, first, last);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Сталася неочікувана помилка. " + e.getMessage());
        }
    }
}
