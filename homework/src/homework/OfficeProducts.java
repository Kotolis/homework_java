package homework;

public class OfficeProducts extends Category{

    //Методы абстрактного класса "Категории"

    public int id = 1012;
    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе электроники";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Офисная техника";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Офисная техника'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }

    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Офисная техника'");}

    public void click() {System.out.println("Совершен клик на иконку 'Офисная техника' ");}

    public void getIconSize(){
        System.out.println("Иконка " + iconSize);
    }

}
