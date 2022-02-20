package homework;

public class Tv extends Category {

    //Методы абстрактного класса "Категории"

    public int id = 1004;
    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе электроники";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Телевизоры";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Телевизоры'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }

    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Телевизоры'");}

    public void click() {System.out.println("Совершен клик на иконку 'Телевизоры' ");}

    public void getIconSize(){
        System.out.println("Иконка " + iconSize);
    }


}
