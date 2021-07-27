package blackjack.domain;

import blackjack.utils.StringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PlayersFactoryTest {

    @ParameterizedTest
    @ValueSource(strings = {"Jane Doe, John Doe, Jim Smith", "Alice, Brown, Chris, Dean"})
    @DisplayName("이름목록을 입력하면 플레이어 리스트가 생성되는지를 테스트한다.")
    void playerGenerateTest(String input) {
        //when
        List<Player> players = PlayersFactory.createPlayers(input);
        List<String> names = StringUtils.splitByComma(input);

        //then
        for (String name : names) {
            assertThat(players).contains(new Player(name));
        }
    }

    @Test
    @DisplayName("이미 생성된 플레이어의 목록을 바꿀 수 없는지를 확인한다.")
    void playersUnmodifiableTest() {
        //given
        // when
        List<Player> players = PlayersFactory.createPlayers("Jane, John, Ariel");

        //then
        assertThatThrownBy(() -> {
            players.add(new Player("ChungHyeon"));
        }).isInstanceOf(RuntimeException.class);
    }
}