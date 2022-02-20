package homework;

public class Photo extends Category{

    //Методы абстрактного класса "Категории"

    public int id = 1009;
    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе электроники";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Фотоаппараты";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Фотоаппараты'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }

    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Фотоаппараты'");}

    public void click() {System.out.println("Совершен клик на иконку 'Фотоаппараты' ");}

    public void getIconSize(){System.out.println("Иконка " + iconSize);}


}
