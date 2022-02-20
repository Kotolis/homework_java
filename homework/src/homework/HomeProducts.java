package homework;

public class HomeProducts extends Category {

    //Методы абстрактного класса "Категории"

    public int id = 1011;
    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе электроники";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Умный дом";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Умный дом'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }

    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Умный дом'");}

    public void click() {System.out.println("Совершен клик на иконку 'Умный дом' ");}

    public void getIconSize(){
        System.out.println("Иконка категории " + iconSize);
    }



}
