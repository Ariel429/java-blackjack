# java-blackjack

# 구현 기능 목록

-[x] 게임
    - [x] 플레이어들의 이름을 입력받는다.
        - [x] 최소 플레이어는 1명으로, 딜러와 게임을 진행한다.
        - [x] ,를 기준으로 분리

    - [x] 시작시 각 플레이어가 두 장의 카드를 지급받는다.
    - [x] 딜러는 처음에 받은 2장의 합계가 16이하이면 반드시 1장의 카드를 뽑는다.
    - [x] 딜러는 처음에 받은 2장의 합계가 17이상이면 추가로 받을 수 없다.
    - [x] 플레이어는 카드 숫자의 합이 21이 초과하지 않는 동안 원하는 만큼 카드를 뽑을 수 있다.
    - [x] 카드를 추가로 뽑아 21을 초과할 경우 배팅 금액을 모두 잃게 된다.
        - [x] Ace를 가진 플레이어는 에이스의 숫자값으로 1 혹은 11을 선택할 수 있다.
        - [x] King, Queen, Jack의 숫자값은 각각 10으로 취급한다.

-[x] 출력
    - [x] 게임 시작 시 각 플레이어가 받은 2장의 카드를 출력한다.
    - [x] 각 플레이어에게 추가로 카드를 받을 것인지 묻는다.
        - [x] 카드를 추가로 받으면 해당 플레이어가 가진 카드 목록을 출력한다.
        - [x] 딜러는 카드값의 합이 16이하면 카드를 추가로 받았다는 메시지를 출력한다.

    - [x] 모든 플레이어가 더이상 카드를 뽑지 않으면 게임이 종료된다.
        - [x] 플레이어별 카드의 목록을 출력한다.
        - [x] 플레이어별 카드 숫자의 합을 계산하여 결과로 출력한다.

    - [x] 게임을 완료한 후 각 플레이어별로 승패를 출력한다.
        - [x] 딜러는 각 플레이어와의 승패를 누적해서 출력한다.
        - [x] 플레이어는 딜러와의 승패를 출력한다.


- [x] 예외
    - 이름
        - [x] 플레이어의 이름은 공백, null 값이 될 수 없다.
        - [x] 플레이어의 이름은 특수문자를 포함할 수 없다.
        - [x] 플레이어의 이름은 "딜러"가 될 수 없다.
        - [x] 플레이어는 서로 중복된 이름을 가질 수 없다.

    - 카드 덱
        - [x] 하나의 카드덱에서는 카드를 52장 초과하여 뽑을 수 없다.

    - 플레이어에게 카드를 더 받을 것인지 질문
        - [] y, n가 아닌 형태로 대답할 수 없다.
        - [] 대문자의 Y, N도 인식