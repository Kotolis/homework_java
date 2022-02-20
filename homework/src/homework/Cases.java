package homework;

public class Cases extends Accessories{

    //Методы абстрактного класса "Категории"
    public int id = 1006;
    public String iconSize = "Маленькая";

    public void getIconDescription() {
        iconDescription = "Иконка в разделе категорий";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Аксессуары для смартфонов";
        System.out.println(name);}


    public void open(){System.out.println("Открыта категория 'Аксессуары для смартфонов' ");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }

    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Аксессуары для смартфонов'");}

    public void click() {System.out.println("Совершен клик на иконку 'Аксессуары для смартфонов' ");}

    public void getIconSize(){
        System.out.println("Иконка " + iconSize);
    }
}
