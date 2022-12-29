public class BonusMilesService {
    public int calculate(int cost) {
        int costPerMile = 20; // Количество рублей для одной бонусной мили
        int countOfMiles; // Количество бонусных миль
        countOfMiles = cost / costPerMile; // Рассчитывает количество бонусных миль
        return countOfMiles;
    }
}
