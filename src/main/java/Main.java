public class Main {
    public static void main(String[] args){
        try{
            String str = """
                         Or where the dirge of a brave past is chaunted.
                         In dolorous dusks by immemorial walls.""";
            char first = 'r';
            char last  = 'w';

            String result = StringTransformer.substringDeletion(str, first, last);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Помилка: вхідний текст не може бути порожнім");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Помилка індексів");
        } catch (Exception e) {
            System.out.println("Сталася неочікувана помилка. " + e.getMessage());
        }
    }
}
