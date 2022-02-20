package homework;

public class Computers extends Category{

    //Методы абстрактного класса "Категории"

    public int id = 1007;

    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе электроники";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Компьютеры";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Компьютеры'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }


    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Компьютеры'");}

    public void click() {System.out.println("Совершен клик на иконку 'Компьютеры' ");}

    public void getIconSize(){System.out.println("Иконка " + iconSize);}
}
