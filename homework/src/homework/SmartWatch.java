package homework;

public class SmartWatch extends Category{

    //Методы абстрактного класса "Категории"

    public int id = 1005;
    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе электроники";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Smart-часы";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Smart-часы'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }

    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Smart-часы'");}

    public void click() {System.out.println("Совершен клик на иконку 'Smart-часы' ");}

    public void getIconSize(){
        System.out.println("Иконка " + iconSize);
    }
}
