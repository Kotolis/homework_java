package homework;

public class Headphones extends Accessories{

    //Методы абстрактного класса "Категории"

    public int id = 1008;
    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе категорий";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Наушники";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Наушники'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }

    //Методы интерфейса "Элемент"
    public void getType() {System.out.println("Иконка 'Наушники'");}

    public void click() {System.out.println("Совершен клик на иконку 'Наушники' ");}

    public void getIconSize(){System.out.println("Иконка " + iconSize);}

}
