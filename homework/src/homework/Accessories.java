package homework;

public class Accessories extends Category implements Element{

    //Методы абстрактного класса "Категории"

    public String name = "Аксессуары";
    public void accessories() {System.out.println("Если вы здесь, то категория отноится к разделу аксессуаров");}


    public void open() {System.out.println("Открыт раздел с аксессуарами");}

    //Методы интерфейса "Элемент"
    public void getType() {System.out.println("Подкатегория " + name);
    }
    public void click() {System.out.println("Совершен клик на раздел с аксессуарами");}

    public void getIconSize(){
        System.out.println("Иконка у подкатегории отсутсвует");
    }
}
