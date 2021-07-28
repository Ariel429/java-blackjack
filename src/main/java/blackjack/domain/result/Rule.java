package blackjack.domain.result;

import blackjack.domain.participant.Dealer;
import blackjack.domain.participant.Player;

import java.util.function.BiFunction;

public enum Rule {
    // 카드 값의 합이 21을 넘으면 승패 결정
    PLAYER_BUST(((player, dealer) -> player.isBust()), WinningResult.LOSE),
    DEALER_BUST(((player, dealer) -> dealer.isBust()), WinningResult.WIN),

    // 카드 값의 합이 21을 넘지 않으면서, 값이 더 큰쪽이 승패결정(이미 여기서 결정, BlackJack 체크 필요없음)
    PLAYER_HIGHER(((player, dealer) -> player.getCardsSum() > dealer.getCardsSum()), WinningResult.WIN),
    DEALER_HIGHER(((player, dealer) -> player.getCardsSum() < dealer.getCardsSum()), WinningResult.LOSE),

    // 무승부 결정
    TIES(((player, dealer) -> player.getCardsSum() == dealer.getCardsSum()), WinningResult.TIE);


    private BiFunction<Player, Dealer, Boolean> compare;
    private WinningResult winningResult;

    Rule(BiFunction<Player, Dealer, Boolean> compare, WinningResult winningResult) {
        this.compare = compare;
        this.winningResult = winningResult;
    }

    public Boolean compare(Player player, Dealer dealer) {
        return compare.apply(player, dealer);
    }

    public WinningResult getWinningResult() {
        return winningResult;
    }
}
