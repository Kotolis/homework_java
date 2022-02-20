package homework;

public class Tablets extends Category{

    //Методы абстрактного класса "Категории"

    public int id = 1002;
    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе электроники";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Планшеты";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Планшеты'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }

    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Планшеты'");}

    public void click() {System.out.println("Совершен клик на иконку 'Планшеты' ");}

    public void getIconSize(){
        System.out.println("Иконка " + iconSize);
    }


}
