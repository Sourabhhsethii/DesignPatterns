package jan2024.patterns.mediator.observer;

public class ArticleDialogBox {

    private ListBox articleListBox = new ListBox();
    private TextBox titleTextBox = new TextBox();
    private Button saveButton = new Button();

    public ArticleDialogBox() {
        articleListBox.addEventHandler(this::articleSelected);
        articleListBox.addEventHandler(this::titleChanged);
    }

    public void simulateUserInteraction(){
        articleListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("Text Box: " + titleTextBox.getContent());
        System.out.println("Text Box: " + saveButton.isEnabled());
    }

    private void articleSelected() {
        titleTextBox.setContent(articleListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged(){
        var content = titleTextBox.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
