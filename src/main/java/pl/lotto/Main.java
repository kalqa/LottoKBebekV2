package pl.lotto;
public class Main {

    public static void main(String[] args) {

        UserAsker userAsker = new UserAsker();
        new GameStarter().chooseGame(userAsker);


    }
}


