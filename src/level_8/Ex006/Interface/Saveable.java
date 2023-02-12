package level_8.Ex006.Interface;

import level_8.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
