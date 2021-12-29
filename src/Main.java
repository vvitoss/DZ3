public class Main {
    public static void main(String[] args) {
    BonusMilesService service = new BonusMilesService();
    int bonus = service.calculate(1000);
        System.out.println(bonus+" мили");
    }
}
