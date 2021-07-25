package blackjack.domain;

import blackjack.constant.Denomination;
import blackjack.constant.Type;

import java.util.Objects;

public class Card {

    private final Denomination denomination;
    private final Type type;

    public Card(Denomination denomination, Type type) {
        this.denomination = denomination;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Card)) {
            return false;
        }
        Card card = (Card) o;
        return denomination == card.denomination &&
                type == card.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(denomination, type);
    }

    @Override
    public String toString() {
        return denomination.getValue() + type.getType();
    }
}