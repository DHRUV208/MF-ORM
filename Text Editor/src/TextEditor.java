public class TextEditor {
    private SpellChecker sc;
    public TextEditor(SpellChecker sc)
    {
        this.sc =sc;
    }
    public void spellChecker()
    {
        sc.display();
    }
}
