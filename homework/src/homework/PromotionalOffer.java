package homework;

public class PromotionalOffer extends Category {

    //Методы абстрактного класса "Категории"

    public int id = 1013;
    private String iconSize = "Большая";
    private int length;


    public void getIconDescription() {
        iconDescription = "Иконка в разделе электроники";
        System.out.println(iconDescription);}

    public void getName() {
        name = "Рекламное предложение";
        System.out.println(name);}

    public void open(){System.out.println("Открыта категория 'Рекламное предложение'");}

    public void getId(){
        System.out.println("id элемента " + id  );
    }


    //Методы интерфейса "Элемент"

    public void getType() {System.out.println("Иконка 'Рекламное предложение'");}

    public void click() {System.out.println("Совершен клик на иконку 'Рекламное предложение' ");}

    public void getIconSize(){
        System.out.println("Иконка категории " + iconSize);
    }

    public void setLength(int newLength){
        if (newLength >= 5 && newLength <= 60)
            length = newLength;
        System.out.println("Иконка большая, так как ее длина " + length + "см");}

}
