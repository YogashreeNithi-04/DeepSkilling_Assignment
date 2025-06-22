
interface Document {
    void display();
}


class WordDoc implements Document {
    @Override
    public void display() {
        System.out.println("📄 Word document is now open.");
    }
}

class PdfDoc implements Document {
    @Override
    public void display() {
        System.out.println("📄 PDF document is now open.");
    }
}

class ExcelDoc implements Document {
    @Override
    public void display() {
        System.out.println("📊 Excel sheet is now open.");
    }
}


abstract class DocumentCreator {
    public abstract Document create();
}


class WordCreator extends DocumentCreator {
    @Override
    public Document create() {
        return new WordDoc();
    }
}

class PdfCreator extends DocumentCreator {
    @Override
    public Document create() {
        return new PdfDoc();
    }
}

class ExcelCreator extends DocumentCreator {
    @Override
    public Document create() {
        return new ExcelDoc();
    }
}


public class FactoryMethodDemo {
    public static void main(String[] args) {
        
        DocumentCreator wordCreator = new WordCreator();
        Document word = wordCreator.create();
        word.display();

        
        DocumentCreator pdfCreator = new PdfCreator();
        Document pdf = pdfCreator.create();
        pdf.display();

        
        DocumentCreator excelCreator = new ExcelCreator();
        Document excel = excelCreator.create();
        excel.display();
    }
}
