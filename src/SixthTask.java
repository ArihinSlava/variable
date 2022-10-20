public class SixthTask {
    public static void main(String[] args) {
        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");

        var appleWeight = 2;
        var orangeWeight = 3;
        var fruitWeight = appleWeight + orangeWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoWeight = 2;
        var cucumberWeight = 2;
        var zucciniWeight = 2;
        var peppersWeight = 2;
        var vegetablesWeigt = tomatoWeight + cucumberWeight + peppersWeight + zucciniWeight;
        var productWeight = fruitWeight + vegetablesWeigt + meatWeight + waterWeight;
        System.out.println("Общий вест продуктов " + productWeight + " кг!");

        var leftWeight = liftingCapacity - stuffWeight - productWeight;
        System.out.println("Места осталось " + leftWeight + "кг!");

        productWeight = productWeight * 2;
        System.out.println("Теперь вес продуктов " + productWeight);

        leftWeight = liftingCapacity - stuffWeight - productWeight;
        System.out.println("Теперь место осталось " + leftWeight + " кг!");

        var overload = (stuffWeight + productWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");

        var productsIsOneCar = productWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsIsOneCar);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var sportManWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес спортсменов " + sportManWeight + "Кг!");

        var differenceWeight = firstBoxer - secondBoxer;
        System.out.println("Разница в "+ differenceWeight +"кг!");

        var differencWeight = secondBoxer - firstBoxer;
        System.out.println("разница в " + differencWeight + " кг!");

        var differenWeight = secondBoxer % firstBoxer;
        System.out.println("Разница в " + differenWeight + " Кг!");







    }
}
