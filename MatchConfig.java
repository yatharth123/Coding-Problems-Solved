import org.json.JSONObject;

public class MatchConfig {
    //todo добавить нужные поля и классы и реализовать десериализацию json-объекта
    int myLives;
    int enemyLives;
    // ...

    public MatchConfig(JSONObject params) {
        myLives = params.getInt("my_lives");
        enemyLives = params.getInt("enemy_lives");
        // ...
    }
}