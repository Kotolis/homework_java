package homework;

public class Smartphones extends Category{

    //Методы абстрактного класса "Категории"

    public int id = 1001;
    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе электроники";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Смартфоны";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Смартфоны'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }

    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Смартфоны'");}

    public void click() {System.out.println("Совершен клик на иконку 'Смартфоны' ");}

    public void getIconSize(){
        System.out.println("Иконка " + iconSize);
    }
}
