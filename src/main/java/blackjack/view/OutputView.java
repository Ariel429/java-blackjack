package blackjack.view;

import blackjack.domain.Dealer;
import blackjack.domain.Player;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {
    private final String NEW_LINE = System.lineSeparator();

    public void printFirstCardsGiven(List<Player> players, Dealer dealer) {
        StringBuilder sb = new StringBuilder();
        sb.append(dealer.getName())
                .append("와 ");
        sb.append(players.stream()
                .map(Player::getName)
                .collect(Collectors.joining(", ")));
        sb.append("에게 2장의 카드를 나누었습니다.");
        sb.append(NEW_LINE);
        System.out.println(sb);
    }

    public void printDealerCard(Dealer dealer) {
        System.out.println(dealer);
    }

    public void printPlayersCard(List<Player> players) {
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
