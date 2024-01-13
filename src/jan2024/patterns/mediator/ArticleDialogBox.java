package jan2024.patterns.mediator;

public class ArticleDialogBox extends DialogBox{
    private ListBox articleListBox = new ListBox(this);
    private TextBox titleTextBoc = new TextBox(this);
    private Button saveButton = new Button(this);

    public void simulateUserInteration(){
        articleListBox.setSelection("Article 1");
        articleListBox.setSelection("");
        articleListBox.setSelection("Article 2");
        System.out.println("Text Box: " + titleTextBoc.getContent());
        System.out.println("Button: " + saveButton.isEnable());
    }

    @Override
    public void changed(UIControl uiControl) {
        if(uiControl == articleListBox){
            articleSelected();
        } else if(uiControl == titleTextBoc){
            titleChanged();
        }
    }

    private void articleSelected(){
        titleTextBoc.setContent(articleListBox.getSelection());
        saveButton.setEnable(true);
    }
    private void titleChanged(){
        var content = titleTextBoc.getContent();
        var isEmpty = (content == null || content.isEmpty());
        saveButton.setEnable(!isEmpty);
    }
}
