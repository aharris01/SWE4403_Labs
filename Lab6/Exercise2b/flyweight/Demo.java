package flyweight;

public class Demo {
  public static void main(String[] args){
    show();
  }

  public static void show() {
    CellContextFactory contextFactory = new CellContextFactory();
    SpreadSheet sheet = new SpreadSheet(contextFactory);
    sheet.setContent(0, 0, "Hello");
    sheet.setContent(1, 0, "World");
    sheet.setFontFamily(0, 0, "Arial");
    sheet.render();
  }
}
