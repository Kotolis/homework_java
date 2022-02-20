package homework;

public class Laptops extends Category {

    //Методы абстрактного класса "Категории"

    public int id = 1003;
    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе электроники";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Ноутбуки";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Ноутбуки'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }

    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Ноутбуки'");}

    public void click() {System.out.println("Совершен клик на иконку 'Ноутбуки' ");}

    public void getIconSize(){
        System.out.println("Иконка " + iconSize);
    }


}


