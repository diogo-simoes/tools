package pt.linkare.ant;

public class PropertyTextBlock extends TextBlock {

    private String key = null;

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PropertyTextBlock)) {
            return false;
        }

        PropertyTextBlock cssTextBlockOther = (PropertyTextBlock) other;

        if (cssTextBlockOther.key == null || key == null) {
            return false;
        }

        return cssTextBlockOther.key.equals(key);
    }

    @Override
    public String toString() {
        return getContent();
    }

    @Override
    protected void initializeFromContent(String content) {
        if (content.indexOf("=") != -1) {
            key = content.substring(0, content.indexOf("=")).trim();
        }
    }

}
