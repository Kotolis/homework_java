package homework;

public class Games extends Category{

    //Методы абстрактного класса "Категории"

    public int id = 1010;

    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе электроники";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Игры";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Игры'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }

    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Игры'");}

    public void click() {System.out.println("Совершен клик на иконку 'Игры' ");}

    public void getIconSize(){
        System.out.println("Иконка " + iconSize);
    }

}


