public class EihthTask {
    public static void main(String[] args) {
        var allHours = 640;
        var hourOneWorker = 8;
        var allWorker = allHours / hourOneWorker;
        System.out.println("Всего работников в компании " + allWorker + " Человек");

        var newAllWorker = allWorker + 94;
        var newAllHour = newAllWorker * hourOneWorker;
        System.out.println("Если в компании работает " + newAllWorker + " Человек" + " То всего " + newAllHour + " часов можеть быть поделено между сотрудникам ");







    }
}
