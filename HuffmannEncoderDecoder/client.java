public class client
{
    public static void main(String[] args)
    {
        huffmann1 hed = new huffmann1("absbixqwrwuuhiwipyreggsjhaklhvdhbbcboiuocwmzoquwieqyejifoeqpomzxbabcbueiff");
        
        String encoded = hed.encodeString("absvsyi");
        String decoded = hed.decodeString(encoded);

        System.out.println(encoded + " -> " + decoded);
    }
}